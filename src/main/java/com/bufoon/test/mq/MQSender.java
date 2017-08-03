package com.bufoon.test.mq;

import com.bufoon.test.config.mq.RMQSenderException;
import com.bufoon.test.mq.send.AbstractMessage;

/**
 * MQ发送消息接口
* @ClassName: MQSender  
* @Description: MQ发送消息接口
* @author anling.song  
* @date 2017年7月12日 上午10:57:00
 */
public interface MQSender {
	/**
	 * 发送消息，发送的消息对象继承抽象消息类
	 * @param message 抽象消息类
	 * @throws RMQSenderException 
	 */
	void send(AbstractMessage message) throws RMQSenderException;
	
	/**
	 * 发送消息，任意数据消息
	 * @param uniqueKey 消息唯一标识
	 * @param data 发送的数据
	 * @throws RMQSenderException 
	 */
	void send(String uniqueKey, Object data) throws RMQSenderException;
}
