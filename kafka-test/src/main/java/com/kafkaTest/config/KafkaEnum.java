package com.kafkaTest.config;

import lombok.Getter;

@Getter
public enum KafkaEnum {

    BOOTSTRAP_SERVERS("bootstrap.servers", "localhost:9092,localhost:9093,localhost:9094"),
    TEST_CONSUMER_GROUP_ID("test.consumer.group.id", "TEST.GROUP"),
    TEST_TOPIC_NAME("test.topic.name", "TEST.TOPIC");

    private final String key;
    private final String value;

    KafkaEnum(String key, String value) {
        this.key = key;
        this.value = value;
    }
}
