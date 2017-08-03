package com.bufoon.test.mq.send;

import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.bufoon.test.mq.AbstractRMQSender;

@Component
public class JqmSenderMgr extends AbstractRMQSender {
	
	// 注入借钱么的rabbit操作模板，注意变量命名
	@Autowired
	private RabbitTemplate jqmRabbitTemplate;
	
	@Override
	protected RabbitTemplate rabbitTemplate() {
		return jqmRabbitTemplate;
	}

}
