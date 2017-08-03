package com.bufoon.test.config.mq.rabbit;

import org.springframework.amqp.core.AcknowledgeMode;
import org.springframework.amqp.rabbit.config.SimpleRabbitListenerContainerFactory;
import org.springframework.amqp.rabbit.connection.ConnectionFactory;
import org.springframework.amqp.support.converter.Jackson2JsonMessageConverter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.autoconfigure.amqp.SimpleRabbitListenerContainerFactoryConfigurer;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class RMListenerContainerFactoryConfig {

	@Autowired
	private SimpleRabbitListenerContainerFactoryConfigurer configurer;
	/**
	 * 借钱么队列监听容器工厂
	 * @param jqmConnectionFactory
	 * @return
	 */
	@Bean("jqmListenerContainerFactory")
    public SimpleRabbitListenerContainerFactory jqmListenerContainerFactory(
    		@Qualifier("jqmConnectionFactory")ConnectionFactory jqmConnectionFactory) {
        return this.getSRLCFactory(jqmConnectionFactory, true, 1, true);
    }
	
	/**
	 * 现金贷队列监听工厂
	 * @param clfConnectionFactory
	 * @return
	 */
	@Bean("clfListenerContainerFactory")
    public SimpleRabbitListenerContainerFactory clfListenerContainerFactory(@Qualifier("clfConnectionFactory")ConnectionFactory clfConnectionFactory) {
        return this.getSRLCFactory(clfConnectionFactory, true, 1, true);
    }
	
	/**
	 * 获取一个监听工厂实例
	 * @param cf 连接工厂
	 * @param ack 消息确认模式，true手动，false自动
	 * @param consumers 消费者个数
	 * @return
	 */
	private SimpleRabbitListenerContainerFactory getSRLCFactory(ConnectionFactory cf, boolean ack, int consumers, boolean isMessageConverter){
		 SimpleRabbitListenerContainerFactory factory = new SimpleRabbitListenerContainerFactory();
		 factory.setConnectionFactory(cf);
	     factory.setAcknowledgeMode(ack?AcknowledgeMode.MANUAL:AcknowledgeMode.AUTO); //消息确认方式
	     factory.setConcurrentConsumers(consumers);
	     if (isMessageConverter) {
	    	 factory.setMessageConverter(new Jackson2JsonMessageConverter());
		 }
	     configurer.configure(factory, cf);
	     return factory;
	}
}
