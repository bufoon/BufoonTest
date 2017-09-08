package com.bufoon.test.config.mq.rabbit.prop.instance;

import com.bufoon.test.config.mq.rabbit.prop.AbstractMqProperties;
import com.bufoon.test.config.mq.rabbit.prop.MqConnProperties;

public class GdpVhost extends MqConnProperties {

	private TestGdp testGdp;
	
	public TestGdp getTestGdp() {
		return testGdp;
	}
	public void setTestGdp(TestGdp testGdp) {
		this.testGdp = testGdp;
	}

	public static class TestGdp extends AbstractMqProperties{
		
	}
}
