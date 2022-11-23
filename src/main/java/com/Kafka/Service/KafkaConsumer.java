package com.Kafka.Service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;



@Service
public class KafkaConsumer {

    private static final Logger log = LoggerFactory.getLogger(KafkaConsumer.class);


    @KafkaListener(topics = "spring_boot_kafka", groupId = "abhishek")
    public void listenGroupFoo(String message) {
        log.info("Received Message in group id abhishek: " + message);
    }
}
