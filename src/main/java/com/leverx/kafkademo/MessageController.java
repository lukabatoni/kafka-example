package com.leverx.kafkademo;

import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/messages")
public class MessageController {

  private KafkaTemplate<String, String> kafkaTemplate;

  public void publish(@RequestBody MessageRequest request){
    kafkaTemplate.send("leverX-kafka-topic", request.toString());
  }
}
