package com.kafkaTest.controller;

import com.kafkaTest.service.ProducerService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
public class ProducerController {

    private final ProducerService producerService;

    @PostMapping("/producer")
    public String sendProducer(@RequestParam String message) {
        producerService.send(message);
        return "send message : "+message;
    }


}
