package com.leverx.kafkademo;

import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;

@Component
public class KafkaListeners {
  @KafkaListener(topics = "leverX-kafka-topic", groupId = "group_id")
  void listener(String data) {
    System.out.println("Listener received: " + data);
  }
}
