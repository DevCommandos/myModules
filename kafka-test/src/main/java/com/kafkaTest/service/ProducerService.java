package com.kafkaTest.service;

import com.kafkaTest.config.KafkaEnum;
import lombok.RequiredArgsConstructor;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class ProducerService {

    private final KafkaTemplate<String, String> kafkaTemplate;
    private final String TOPIC_NAME = KafkaEnum.TEST_TOPIC_NAME.getValue();

    public void send(String message) {
        kafkaTemplate.send(TOPIC_NAME, message);
    }

}
