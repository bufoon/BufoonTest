package com.bufoon.test.mq.send;

/**
 * 抽象消息类
* @ClassName: AbstractMessage  
* @Description: 发送消息的数据对象统一集成这个抽象类  
* @author anling.song  
* @date 2017年7月12日 上午9:34:10
 */
public class AbstractMessage{
	
	private String uniqueKey; //消息唯一表示

	/**
	 * 消息唯一标识，消息定义用于找到该条消息属性
	 * @return
	 */
	public String getUniqueKey() {
		return uniqueKey;
	}

	public void setUniqueKey(String uniqueKey) {
		this.uniqueKey = uniqueKey;
	}

}
