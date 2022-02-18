package de.atruvia.simplespringjsonproducer.controller;

import de.atruvia.simplespringjsonproducer.event.sender.Sender;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/sender")
@AllArgsConstructor
public class DemoController {

    private final Sender sender;

    @GetMapping("/send")
    public void send() {
        sender.send();
    }
}
