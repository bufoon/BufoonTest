package com.bufoon.test.config.mq.rabbit;

import org.springframework.amqp.core.Binding;
import org.springframework.amqp.core.BindingBuilder;
import org.springframework.amqp.core.DirectExchange;
import org.springframework.amqp.core.Queue;
import org.springframework.amqp.rabbit.core.RabbitAdmin;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.bufoon.test.config.mq.rabbit.prop.MqProperties;

/**
 * 绑定配置
 * 
 * @ClassName: RMBindConfig
 * @Description: 绑定配置
 * @author anling.song
 * @date 2017年7月10日 下午3:14:34
 */
@Configuration
public class RMBindConfig {

	@Autowired
	private MqProperties properties;

	@Bean
	public Binding jqmBindTestQueueToTestExchange(@Qualifier("jqmRabbitAdmin") RabbitAdmin jqmRabbitAdmin,
			@Qualifier("jqmTestExchange")DirectExchange jqmTestExchange, @Qualifier("jqmTestQueue")Queue jqmTestQueue) {
		// 绑定方式1
//		Binding binding = new Binding(properties.getJqmVhost().getTestJqm().getQueue(), 
//				DestinationType.QUEUE, 
//				properties.getJqmVhost().getTestJqm().getExchange(), 
//				properties.getJqmVhost().getTestJqm().getRk(), null);
		// 绑定方式2
		Binding binding = BindingBuilder.bind(jqmTestQueue).to(jqmTestExchange)
				.with(properties.getJqmVhost().getTestJqm().getRk());
		binding.setAdminsThatShouldDeclare(jqmRabbitAdmin);
		jqmRabbitAdmin.declareBinding(binding);
		return binding;
	}
}
