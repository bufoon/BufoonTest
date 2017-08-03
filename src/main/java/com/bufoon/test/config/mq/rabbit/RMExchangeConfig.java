package com.bufoon.test.config.mq.rabbit;

import org.springframework.amqp.core.DirectExchange;
import org.springframework.amqp.rabbit.core.RabbitAdmin;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.bufoon.test.config.mq.rabbit.prop.MqProperties;

/**
 * 交换机配置
* @ClassName: RMExchangeConfig  
* @Description: 交换机配置 
* @author anling.song  
* @date 2017年7月10日 下午3:13:46
 */
@Configuration
public class RMExchangeConfig {
	@Autowired
	private MqProperties properties;
	
	@Bean("jqmTestExchange")
	public DirectExchange jqmTestExchange(@Qualifier("jqmRabbitAdmin")RabbitAdmin jqmRabbitAdmin){
		DirectExchange directExchange = new DirectExchange(properties.getJqmVhost().getTestJqm().getExchange(), true, false);
		directExchange.setAdminsThatShouldDeclare(jqmRabbitAdmin);
		jqmRabbitAdmin.declareExchange(directExchange);
		return directExchange;
	}
	
	@Bean("clfTestExchange")
	public DirectExchange clfTestExchange(@Qualifier("clfRabbitAdmin")RabbitAdmin clfRabbitAdmin){
		DirectExchange directExchange = new DirectExchange(properties.getClfVhost().getTestClf().getExchange(), true, false);
		directExchange.setAdminsThatShouldDeclare(clfRabbitAdmin);
		clfRabbitAdmin.declareExchange(directExchange);
		return directExchange;
	}
}
