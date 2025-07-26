package com.leverx.kafkademo;

import org.junit.jupiter.api.Test;
import org.mockito.Mock;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.kafka.core.KafkaTemplate;

@SpringBootTest
class KafkaDemoApplicationTests {

  @Mock
  private KafkaTemplate<String, String> kafkaTemplate;

  @Autowired
  void setKafkaTemplate(KafkaTemplate<String, String> kafkaTemplate) {
    this.kafkaTemplate = kafkaTemplate;
  }

  @Test
  void contextLoads() {
  }

}
