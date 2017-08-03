package com.bufoon.test.mq;

import java.lang.reflect.Field;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.amqp.rabbit.support.CorrelationData;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.util.ReflectionUtils;
import org.springframework.util.StringUtils;

import com.alibaba.fastjson.JSON;
import com.bufoon.test.config.mq.RMQSenderException;
import com.bufoon.test.config.mq.rabbit.prop.AbstractMqProperties;
import com.bufoon.test.config.mq.rabbit.prop.MqProperties;
import com.bufoon.test.mq.send.AbstractMessage;

/**
 * RabbitMq 消息发送抽象类
* @ClassName: AbstractRMQSender  
* @Description: 消息发送统一继承这个抽象类  
* @author anling.song  
* @date 2017年7月12日 下午4:22:49
 */
public abstract class AbstractRMQSender implements MQSender {

	//slf4j 日志
	protected Logger logger = LoggerFactory.getLogger(getClass());
	
	@Autowired
	private MqProperties properties;
	
	/**
	 * 接口实现
	 * @throws Exception 
	 */
	@Override
	public void send(AbstractMessage message) throws RMQSenderException {
		logger.info("Abstract Message Send UniqueKey: {}",message.getUniqueKey());
		logger.debug("Abstract Message Data: ", JSON.toJSONString(message));
		sendMessage(message);
	}
	
	/**
	 * 接口实现
	 * @throws Exception 
	 */
	@Override
	public void send(String uniqueKey, Object data) throws RMQSenderException {
		logger.info("Any Message Send UniqueKey: {}",uniqueKey);
		logger.debug("Any Message Data: ", JSON.toJSONString(data));
		sendMessage(uniqueKey, data);
	}
	/**
	 * 发送消息
	 * @param p 配置的消息定义属性 {@link #AbstractMqProperties}
	 * @param d 发送的数据
	 * @throws Exception 
	 */
	private void sendMessage(AbstractMessage d) throws RMQSenderException {
		sendMessage(d.getUniqueKey(), d);
	}
	
	/**
	 * 发送消息
	 * @param uniqueKey
	 * @param data
	 * @throws Exception
	 */
	private void sendMessage(String uniqueKey, Object data) throws RMQSenderException {
		sendMessage(getProperties(uniqueKey), data);
	}
	
	/**
	 * 发送消息
	 * @param p 消息属性
	 * @param d 发送的数据
	 */
	private void sendMessage(AbstractMqProperties p, Object d){
		CorrelationData correlationData = new CorrelationData(p.getUniqueKey());
		rabbitTemplate().convertAndSend(p.getExchange(), p.getRk(), d, correlationData);
	}
	
	/**
	 * 根据消息唯一标识找到该条消息属性
	 * @param uniqueKey
	 * @return
	 * @throws Exception
	 */
	private AbstractMqProperties getProperties(String uniqueKey) throws RMQSenderException{
		if (StringUtils.isEmpty(uniqueKey)) {
			throw new RMQSenderException("消息唯一标识为空");
		}
		String uniqueKeyArr[] = uniqueKey.split("\\.");
		if (uniqueKeyArr.length < 2) {
			throw new RMQSenderException("消息唯一标识命名有误");
		}
		String vhost = uniqueKeyArr[0];
		String message = uniqueKeyArr[1];
		
		AbstractMqProperties temp = null;
		try {
			Field fieldVhost = ReflectionUtils.findField(properties.getClass(), vhost);
			fieldVhost.setAccessible(true);
			Object vhostObj = ReflectionUtils.getField(fieldVhost, properties);
			
			Field fieldMessage = ReflectionUtils.findField(vhostObj.getClass(), message);
			fieldMessage.setAccessible(true);
			temp = (AbstractMqProperties) ReflectionUtils.getField(fieldMessage, vhostObj);
		} catch (Exception e) {
			throw new RMQSenderException("消息定义属性读取不到，请配置");
		}
		return temp;
	}
	
	/**
	 * 获取操作模板,注意操作模板变量的命名，需要对应配置里面的名称
	 * @return
	 */
	protected abstract RabbitTemplate rabbitTemplate();

}
