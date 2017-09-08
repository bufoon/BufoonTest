package com.bufoon.test.mq.send;

import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bufoon.test.mq.AbstractRMQSender;

@Service
public class CashCustomerOptSend extends AbstractRMQSender {

	@Autowired
	private RabbitTemplate gdpRabbitTemplate;

	@Override
	protected RabbitTemplate rabbitTemplate() {
		
		return gdpRabbitTemplate;
	}
	
}
