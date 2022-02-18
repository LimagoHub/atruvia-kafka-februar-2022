package de.atruvia.simplespringjsonproducer.event;

import de.atruvia.simplespringjsonproducer.dto.Person;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;
import java.util.UUID;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class PersonErfasstEvent {

    @Builder.Default
    private String eventID = UUID.randomUUID().toString();
    @Builder.Default
    private LocalDateTime timestamp = LocalDateTime.now();
    private Person person;
}
