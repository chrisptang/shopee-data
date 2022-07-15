package com.tangp.shopee.data.kafka;

import java.util.List;
import lombok.extern.slf4j.Slf4j;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.kafka.support.Acknowledgment;
import org.springframework.stereotype.Component;

@Component
@Slf4j
public class SimpleListener {

    @KafkaListener(topics = {"#{'${spring.kafka.shopee.data.topic}'}"}, groupId = "from-java")
    public void processMessage(String record, Acknowledgment acknowledgment) {
        log.info("receiving message from kafka:");
        log.info(record);

        acknowledgment.acknowledge();
    }
}
