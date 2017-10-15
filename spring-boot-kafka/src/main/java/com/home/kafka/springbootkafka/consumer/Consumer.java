package com.home.kafka.springbootkafka.consumer;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.kafka.annotation.KafkaListener;

public class Consumer
{
	private static final Logger LOGGER = LoggerFactory.getLogger(Consumer.class);

	@KafkaListener(topics = "${kafka.topic.test}")
	public void receive(String payload)
	{
		System.out.println("Payload received " + payload);
		LOGGER.info("received payload='{}'", payload);
	}
}
