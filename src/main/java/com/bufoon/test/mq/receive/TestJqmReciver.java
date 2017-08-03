package com.bufoon.test.mq.receive;

import java.io.UnsupportedEncodingException;

import org.springframework.amqp.core.Message;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;

import com.alibaba.fastjson.JSON;
import com.bufoon.test.config.mq.RMQReceiverException;
import com.bufoon.test.mq.AbstractRMQReceiver;
import com.bufoon.test.mq.model.TestParent;

@Component
@RabbitListener(queues="#{mqProperties.jqmVhost.testJqm.queue}", containerFactory="jqmListenerContainerFactory")
public class TestJqmReciver extends AbstractRMQReceiver<Message> {

	@Override
	protected void doProcess(Message message) throws RMQReceiverException {
		String bodyStr="";
		try {
			bodyStr = new String(message.getBody(), "UTF-8");
			TestParent parent = JSON.parseObject(bodyStr, TestParent.class);
		} catch (UnsupportedEncodingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		// 具体的业务。。。。。
		if (!bodyStr.equals("")) {
			throw new RMQReceiverException("test exception****************************");
		} else{
			logger.info("receive message data： {}", bodyStr); 
		}
		
	}

}
