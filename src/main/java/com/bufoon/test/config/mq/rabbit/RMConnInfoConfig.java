package com.bufoon.test.config.mq.rabbit;

import org.springframework.amqp.rabbit.annotation.EnableRabbit;
import org.springframework.amqp.rabbit.connection.CachingConnectionFactory;
import org.springframework.amqp.rabbit.connection.ConnectionFactory;
import org.springframework.amqp.rabbit.core.RabbitAdmin;
import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.amqp.support.converter.Jackson2JsonMessageConverter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
import org.springframework.context.annotation.Scope;

import com.bufoon.test.config.mq.FastJsonMessageConverter;
import com.bufoon.test.config.mq.rabbit.prop.MqProperties;

/**
 * MQ连接相关信息配置
* @ClassName: RMConnInfoConfig  
* @Description: MQ连接信息，操作模板，管理等配置  
* @author anling.song  
* @date 2017年7月10日 下午3:12:34
 */
@Configuration
@EnableRabbit
public class RMConnInfoConfig {
	
	@Autowired
	private MqProperties mqProperties;
	
	/**
	 * 借钱么连接工厂
	 * @return
	 */
	@Bean("jqmConnectionFactory")  
	@Primary
    public ConnectionFactory jqmConnectionFactory() {  
        CachingConnectionFactory connectionFactory = new CachingConnectionFactory();  
        connectionFactory.setHost(mqProperties.getJqmVhost().getConnection().getHost());
        connectionFactory.setPort(mqProperties.getJqmVhost().getConnection().getPort());
        connectionFactory.setUsername(mqProperties.getJqmVhost().getConnection().getUsername());  
        connectionFactory.setPassword(mqProperties.getJqmVhost().getConnection().getPassword());  
        connectionFactory.setVirtualHost(mqProperties.getJqmVhost().getConnection().getVirtualHost());  
        connectionFactory.setPublisherConfirms(true); //必须要设置 
        return connectionFactory;  
    } 
	
	/**
	 * 借钱么admin管理工具
	 * @return
	 */
	@Bean("jqmRabbitAdmin")
	public RabbitAdmin jqmRabbitAdmin(@Qualifier("jqmConnectionFactory")ConnectionFactory jqmConnectionFactory) {
		RabbitAdmin rabbitAdmin = new RabbitAdmin(jqmConnectionFactory);
	    return rabbitAdmin;
	}
	
	/**
	 * 借钱么 rabbit 操作模板
	 * @param jqmConnectionFactory
	 * @return
	 */
	@Bean("jqmRabbitTemplate")
	@Scope(ConfigurableBeanFactory.SCOPE_PROTOTYPE)  
	public RabbitTemplate jqmRabbitTemplate(@Qualifier("jqmConnectionFactory")ConnectionFactory jqmConnectionFactory) {  
		RabbitTemplate template = new RabbitTemplate(jqmConnectionFactory);
		template.setMessageConverter(new Jackson2JsonMessageConverter());
	    return template;  
	}
	
	
	/**
	 * 现金贷连接工厂
	 * @return
	 */
	@Bean("clfConnectionFactory")  
    public ConnectionFactory clfConnectionFactory() {  
        CachingConnectionFactory connectionFactory = new CachingConnectionFactory();  
        connectionFactory.setHost(mqProperties.getClfVhost().getConnection().getHost());
        connectionFactory.setPort(mqProperties.getClfVhost().getConnection().getPort());
        connectionFactory.setUsername(mqProperties.getClfVhost().getConnection().getUsername());  
        connectionFactory.setPassword(mqProperties.getClfVhost().getConnection().getPassword());  
        connectionFactory.setVirtualHost(mqProperties.getClfVhost().getConnection().getVirtualHost());  
        connectionFactory.setPublisherConfirms(true); //必须要设置
        return connectionFactory;  
    } 
	
	/**
	 * 现金贷admin管理工具
	 * @return
	 */
	@Bean("clfRabbitAdmin")
	public RabbitAdmin clfRabbitAdmin(@Qualifier("clfConnectionFactory")ConnectionFactory clfConnectionFactory) {
		RabbitAdmin rabbitAdmin = new RabbitAdmin(clfConnectionFactory);
		rabbitAdmin.afterPropertiesSet();
	    return rabbitAdmin; 
	}
	
	/**
	 * 现金贷rabbit 操作模板
	 * @param clfConnectionFactory
	 * @return
	 */
	@Bean("clfRabbitTemplate")
	@Scope(ConfigurableBeanFactory.SCOPE_PROTOTYPE)  
	public RabbitTemplate clfRabbitTemplate(@Qualifier("clfConnectionFactory")ConnectionFactory clfConnectionFactory) {  
		RabbitTemplate template = new RabbitTemplate(clfConnectionFactory);
		template.setMessageConverter(new FastJsonMessageConverter());
	    return template;  
	}
}