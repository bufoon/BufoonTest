package com.bufoon.test.mq;

import com.rabbitmq.client.Channel;

/**
 * 消息接收类接口
* @ClassName: MQReceiver  
* @Description: 统一定义消息接收接口  
* @author anling.song  
* @date 2017年7月13日 上午11:17:37  
* @param <D>
 */
public interface MQReceiver<D> {
	
	/**
	 * 消息接收接口
	 * @param message 消息
	 * @param deliveryTag 传输tag 用于确认消息
	 * @param channel mq连接通道
	 */
	public void receive(D message, long deliveryTag, Channel channel);
	
}
