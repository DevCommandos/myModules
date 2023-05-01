package com.kafkaTest;

import org.apache.kafka.clients.producer.KafkaProducer;
import org.apache.kafka.clients.producer.ProducerConfig;
import org.apache.kafka.clients.producer.ProducerRecord;
import org.apache.kafka.common.serialization.StringSerializer;

import java.util.Properties;

public class simpleProducer {

    private final static String BOOTSTRAP_SERVER = "localhost:9092,localhost:9093,localhost:9094";

    private final static String TOPIC_NAME = "TEST.TOPIC";

    public static void main(String[] args) {
        // Kafka Producer 설정
        Properties props = new Properties();
        props.put(ProducerConfig.BOOTSTRAP_SERVERS_CONFIG, BOOTSTRAP_SERVER);
        props.put(ProducerConfig.KEY_SERIALIZER_CLASS_CONFIG, StringSerializer.class.getName());
        props.put(ProducerConfig.VALUE_SERIALIZER_CLASS_CONFIG, StringSerializer.class.getName());

        // Kafka Producer 생성
        KafkaProducer<String, String> producer = new KafkaProducer<>(props);

        // 메시지 전송
        for (int i = 0; i < 10; i++) {
            String value = "value" + i;
            ProducerRecord<String, String> record = new ProducerRecord<>(TOPIC_NAME, value);
            producer.send(record);
        }

        // Kafka Producer 종료
        producer.flush();
        producer.close();
    }

}
