package de.atruvia.simplespringjsonproducer.event.sender;

import de.atruvia.simplespringjsonproducer.dto.Person;
import de.atruvia.simplespringjsonproducer.event.PersonErfasstEvent;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.kafka.core.KafkaTemplate;

import java.util.UUID;

public class Sender {

    @Autowired
    private KafkaTemplate<String, PersonErfasstEvent> kafkaTemplate;

    @Value("${kafka.topic.json}")
    private String jsonTopic;

    public void send() {
        Person payload = Person.builder().id(UUID.randomUUID().toString()).vorname("Jane").nachname("Doe").build();
        var event = PersonErfasstEvent.builder().person(payload).build();
        kafkaTemplate.send(jsonTopic,event);
    }
}
