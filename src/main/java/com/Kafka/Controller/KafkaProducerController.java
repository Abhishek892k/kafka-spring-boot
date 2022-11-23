package com.Kafka.Controller;

import com.Kafka.Service.KafkaProducer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/producer")
public class KafkaProducerController {

    @Autowired
    KafkaProducer kafkaProducer;

    @PostMapping("/publish")
    public ResponseEntity<String> sendMessage(@RequestBody String message){
         kafkaProducer.sendMessage(message);
         return ResponseEntity.ok("Message sent!! ");
    }

}
