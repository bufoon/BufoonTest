package com.bufoon.test.mq.send;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.*;

import com.bufoon.test.App;

@SpringBootTest(classes={App.class})
@RunWith(SpringRunner.class)
public class MQSendServiceTest {

	@Autowired
	private MQSendService mqSendService;
	
	@Test
	public void send(){
		mqSendService.send();
	}
	
}
