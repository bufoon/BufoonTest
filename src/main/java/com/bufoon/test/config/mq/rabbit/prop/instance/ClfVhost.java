package com.bufoon.test.config.mq.rabbit.prop.instance;

import com.bufoon.test.config.mq.rabbit.prop.AbstractMqProperties;
import com.bufoon.test.config.mq.rabbit.prop.MqConnProperties;

public class ClfVhost extends MqConnProperties {
	
	private TestClf testClf; //队列属性，test1是具体的消息类型
	
	public TestClf getTestClf() {
		return testClf;
	}

	public void setTestClf(TestClf testClf) {
		this.testClf = testClf;
	}

	public static class TestClf extends AbstractMqProperties{
		
	}
}
