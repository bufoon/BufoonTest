package com.bufoon.test.mq;

import java.io.IOException;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.amqp.core.Message;
import org.springframework.amqp.rabbit.annotation.RabbitHandler;
import org.springframework.amqp.support.AmqpHeaders;
import org.springframework.messaging.handler.annotation.Header;

import com.alibaba.fastjson.JSON;
import com.bufoon.test.config.mq.RMQReceiverException;
import com.rabbitmq.client.Channel;

/**
 * RabbitMq 消息接收抽象类
* @ClassName: AbstractRMQSender  
* @Description:  消息接收统一继承这个类
* @author anling.song  
* @date 2017年7月12日 下午4:22:49
 */
public abstract class AbstractRMQReceiver<D> implements MQReceiver<D> {

	//slf4j 日志
	protected Logger logger = LoggerFactory.getLogger(getClass());
	
	@RabbitHandler
	@Override
	public void receive(D message,@Header(AmqpHeaders.DELIVERY_TAG)long deliveryTag, Channel channel) {
		logger.info("receive Message start......................");
		logger.debug("receive message Data: {}", JSON.toJSONString(message));
		try {
			try {
				doProcess(message);
				channel.basicAck(deliveryTag, false);
				logger.info("message process success.");
			} catch (RMQReceiverException e) {
				channel.basicNack(deliveryTag, false, true);
				logger.error("message process error, requeue.");
			}
		} catch (IOException e) {
			logger.error("message ack or Nack error. {}" , "");
		}
	}
	
	protected abstract void doProcess(D d) throws RMQReceiverException;
}
