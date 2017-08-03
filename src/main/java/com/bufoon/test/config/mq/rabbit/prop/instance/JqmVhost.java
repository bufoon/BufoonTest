package com.bufoon.test.config.mq.rabbit.prop.instance;

import com.bufoon.test.config.mq.rabbit.prop.AbstractMqProperties;
import com.bufoon.test.config.mq.rabbit.prop.MqConnProperties;

/**
 * 借钱么属性配置
* @ClassName: JqmVhost  
* @Description: 关于借钱么的相关MQ属性配置
* @author anling.song  
* @date 2017年7月10日 下午2:10:40
 */
public class JqmVhost extends MqConnProperties {
	private TestJqm testJqm; //队列属性，test1是具体的消息类型
	
	public TestJqm getTestJqm() {
		return testJqm;
	}

	public void setTestJqm(TestJqm testJqm) {
		this.testJqm = testJqm;
	}

	public static class TestJqm extends AbstractMqProperties{}
	
}
