package com.bufoon.test.config.mq.rabbit.prop;

/**
 * 一个消息属性，exchange，queue，Rk
* @ClassName: AbstractMqProperties  
* @Description: 消息属性  
* @author anling.song  
* @date 2017年7月10日 下午2:08:10
 */
public class AbstractMqProperties {
	
	private String uniqueKey; //定义唯一标识
	private String exchange; //交换机
	private String queue; //队列
	private String rk; //路由键
	
	
	public String getUniqueKey() {
		return uniqueKey;
	}
	public void setUniqueKey(String uniqueKey) {
		this.uniqueKey = uniqueKey;
	}
	public String getExchange() {
		return exchange;
	}
	public void setExchange(String exchange) {
		this.exchange = exchange;
	}
	public String getQueue() {
		return queue;
	}
	public void setQueue(String queue) {
		this.queue = queue;
	}
	public String getRk() {
		return rk;
	}
	public void setRk(String rk) {
		this.rk = rk;
	}
}
