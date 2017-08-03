package com.bufoon.test.config.mq.rabbit;

import org.springframework.amqp.core.Queue;
import org.springframework.amqp.rabbit.core.RabbitAdmin;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.bufoon.test.config.mq.rabbit.prop.MqProperties;

/**
 * 队列配置
* @ClassName: RMQueueConfig  
* @Description: 队列配置  
* @author anling.song  
* @date 2017年7月10日 下午3:14:10
 */
@Configuration
public class RMQueueConfig {

	@Autowired
	private MqProperties properties;
	
	@Bean("jqmTestQueue")
	public Queue jqmTestQueue(@Qualifier("jqmRabbitAdmin") RabbitAdmin jqmRabbitAdmin){
		Queue queue = new Queue(properties.getJqmVhost().getTestJqm().getQueue(), true);
		queue.setAdminsThatShouldDeclare(jqmRabbitAdmin);
		jqmRabbitAdmin.declareQueue(queue);
		return queue;
	}
}
