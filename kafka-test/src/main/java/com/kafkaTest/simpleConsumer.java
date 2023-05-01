package com.kafkaTest;

import org.apache.kafka.clients.consumer.*;
import org.apache.kafka.clients.producer.KafkaProducer;
import org.apache.kafka.clients.producer.ProducerConfig;
import org.apache.kafka.clients.producer.ProducerRecord;
import org.apache.kafka.common.serialization.StringDeserializer;
import org.apache.kafka.common.serialization.StringSerializer;

import java.time.Duration;
import java.util.Collections;
import java.util.Properties;

public class simpleConsumer {

    private final static String BOOTSTRAP_SERVER = "localhost:9092,localhost:9093,localhost:9094";

    private final static String TOPIC_NAME = "TEST.TOPIC";

    private final static String GROUP_ID = "TEST.GROUP";

    public static void main(String[] args) {
        // Kafka Consumer 설정
        Properties props = new Properties();
        props.put(ConsumerConfig.BOOTSTRAP_SERVERS_CONFIG, BOOTSTRAP_SERVER);
        props.put(ConsumerConfig.GROUP_ID_CONFIG, GROUP_ID);
        props.put(ConsumerConfig.KEY_DESERIALIZER_CLASS_CONFIG, StringDeserializer.class.getName());
        props.put(ConsumerConfig.VALUE_DESERIALIZER_CLASS_CONFIG, StringDeserializer.class.getName());
        props.put(ConsumerConfig.AUTO_OFFSET_RESET_CONFIG, "earliest");

        // Kafka Consumer 생성
        Consumer<String, String> consumer = new KafkaConsumer<>(props);

        // 토픽 구독
        consumer.subscribe(Collections.singletonList(TOPIC_NAME));

        // 메시지 수신 및 처리
        while (true) {
            ConsumerRecords<String, String> records = consumer.poll(Duration.ofSeconds(1));
            for (ConsumerRecord<String, String> record : records) {
                System.out.println("Received message: " + record.value());
            }
        }
    }

}
