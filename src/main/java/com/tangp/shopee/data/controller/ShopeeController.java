package com.tangp.shopee.data.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.ResponseEntity;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/shopee")
public class ShopeeController {

    @Autowired
    private KafkaTemplate<String, String> kafkaTemplate;

    @Value("${spring.kafka.shopee.data.topic}")
    private String topic;

    @PostMapping("/json")
    ResponseEntity<String> testJsonPost(@RequestBody String json) {
        kafkaTemplate.send(topic, json);
        return ResponseEntity.ok("OK");
    }
}
