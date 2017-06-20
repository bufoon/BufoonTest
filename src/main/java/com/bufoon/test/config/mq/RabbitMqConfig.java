package com.bufoon.test.config.mq;

import org.springframework.amqp.core.AmqpTemplate;
import org.springframework.amqp.core.DirectExchange;
import org.springframework.amqp.core.FanoutExchange;
import org.springframework.amqp.core.HeadersExchange;
import org.springframework.amqp.core.Queue;
import org.springframework.amqp.core.TopicExchange;
import org.springframework.amqp.rabbit.connection.CachingConnectionFactory;
import org.springframework.amqp.rabbit.connection.ConnectionFactory;
import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

@Configuration
public class RabbitMqConfig {
	
	@Value("${spring.rabbitmq.host}")
	private String host; //ip
	@Value("${spring.rabbitmq.port}")
	private int port; //端口
	@Value("${spring.rabbitmq.username}")
	private String username; //用户名
	@Value("${spring.rabbitmq.password}")
	private String password; //密码
	@Value("${spring.rabbitmq.virtualHost}")
	private String virtualHost; //虚拟主机
	
	public static final String QUEUE_FILE_UPLOAD = "queue_file_upload";
	public static final String DIRECT_EXCHANGE_JQM = "direct_exchange_jqm";
	public static final String TOPIC_EXCHANGE_JQM = "topic_exchange_jqm";
	public static final String FANOUT_EXCHANGE_JQM = "fanout_exchange_jqm";
	public static final String HEADERS_EXCHANGE_JQM = "headers_exchange_jqm";
	public static final String ROUTKEY_FILE_UPLOAD = "routkey_file_upload";

	@Bean
	public Queue fileUploadQueue(){
		return new Queue(RabbitMqConfig.QUEUE_FILE_UPLOAD, true);
	}
	
	@Bean  
    public ConnectionFactory connectionFactory() {  
        CachingConnectionFactory connectionFactory = new CachingConnectionFactory();  
        connectionFactory.setHost(host);
        connectionFactory.setPort(port);
        connectionFactory.setUsername(username);  
        connectionFactory.setPassword(password);  
        connectionFactory.setVirtualHost(virtualHost);  
        connectionFactory.setPublisherConfirms(true); //必须要设置 
        return connectionFactory;  
    }  
	
	@Bean  
	@Scope(ConfigurableBeanFactory.SCOPE_PROTOTYPE)  
	public AmqpTemplate rabbitTemplate() {  
		RabbitTemplate template = new RabbitTemplate(connectionFactory());
		FastJsonMessageConverter messageConverter = new FastJsonMessageConverter();
		template.setMessageConverter(messageConverter);
	    return template;  
	}
	
	//默认的交换机类型，根据路由键去寻找队列推送消息
	@Bean
	public DirectExchange directExchange(){
		return new DirectExchange(RabbitMqConfig.DIRECT_EXCHANGE_JQM, true, false);
	}
	
	//同direct类似，只不过支持通配符，.匹配一个，*匹配一个，#匹配0个或多个
	@Bean
	public TopicExchange topicExchange(){
		return new TopicExchange(RabbitMqConfig.TOPIC_EXCHANGE_JQM, true, false);
	}
	
	//键值对
	@Bean
	public FanoutExchange fanoutExchange(){
		return new FanoutExchange(RabbitMqConfig.FANOUT_EXCHANGE_JQM, true, false);
	}
	
	//广播模式，直接跟绑定的队列推送消息，无视路由键
	@Bean
	public HeadersExchange headersExchange(){
		return new HeadersExchange(RabbitMqConfig.HEADERS_EXCHANGE_JQM, true, false);
	}
	
	
}
