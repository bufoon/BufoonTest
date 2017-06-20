package com.bufoon.test.mq.receive;

import org.springframework.amqp.rabbit.annotation.RabbitHandler;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Service;

@Service
@RabbitListener(queues = "hello")
public class MQReceive {

	@RabbitHandler
	public void receive(String hello){
		System.out.println("receive: " + hello);
	}
}
