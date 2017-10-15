package com.home.kafka.springbootkafka;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.home.kafka.springbootkafka.consumer.Consumer;
import com.home.kafka.springbootkafka.producer.Producer;

@RunWith(SpringRunner.class)
@SpringBootTest
public class SpringBootKafkaApplicationTests
{

	@Autowired
	private Producer producer;

	@Autowired
	private Consumer consumer;

	@Test
	public void contextLoads() throws InterruptedException
	{
		producer.send("test", "My first kafka message !!!!");

		Thread.sleep(60000);
	}

}
