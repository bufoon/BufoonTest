package com.bufoon.test.mq.send;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.bufoon.test.App;
import com.bufoon.test.config.mq.RMQUniqueKeyHelp;
import com.bufoon.test.config.mq.rabbit.prop.MqProperties;
import com.bufoon.test.mq.model.TestChild;
import com.bufoon.test.mq.model.TestParent;

@SpringBootTest(classes={App.class})
@RunWith(SpringRunner.class)
public class MQSendServiceTest {

	@Autowired
	private MqProperties properties;
	@Autowired
	private JqmSenderMgr jqmSenderMgr;
	
	
	@Test
	public void send(){
		System.out.println(properties.getJqmVhost().getConnection().getHost()
				+ ":" + properties.getJqmVhost().getConnection().getPort() + "/"
				+ properties.getJqmVhost().getConnection().getVirtualHost() + "@"
				+ properties.getJqmVhost().getConnection().getUsername() + "+"
				+ properties.getJqmVhost().getConnection().getPassword()
				+ properties.getJqmVhost().getTestJqm().getQueue());
		try {
			String uk = properties.getJqmVhost().getTestJqm().getUniqueKey();
			jqmSenderMgr.send(uk, new TestParent("1", "parent"));
			jqmSenderMgr.send(uk, new TestChild("2", "child", 22, "man"));
		} catch (Exception e) {
			e.printStackTrace();
		};
	}
	
}
