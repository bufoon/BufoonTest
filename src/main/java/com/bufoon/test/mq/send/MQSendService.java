package com.bufoon.test.mq.send;

import java.util.Date;

import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bufoon.test.config.mq.rabbit.prop.MqProperties;

@Service
public class MQSendService {
	@Autowired
	private RabbitTemplate jqmRabbitTemplate;
	@Autowired
	private MqProperties properties;

	public void send() {
		String context = "hello " + new Date();
		System.out.println("Sender : " + context);
		this.jqmRabbitTemplate.convertAndSend(properties.getJqmVhost().getTestJqm().getExchange(), 
				properties.getJqmVhost().getTestJqm().getRk(), context);
	}
}
