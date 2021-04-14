package com.mayank.kafka;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;
@Service

public class Producer{
	
	private static final String Topic = "test_topic";
	@Autowired
	private KafkaTemplate<String,String> kafkaTemplate;
	public Producer() {
	}
	public void sendMessage(String message)
	{
		 this.kafkaTemplate.send(Topic,message);
	}
}