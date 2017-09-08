package com.bufoon.test.config.mq.rabbit.prop;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

import com.bufoon.test.config.mq.rabbit.prop.instance.ClfVhost;
import com.bufoon.test.config.mq.rabbit.prop.instance.GdpVhost;
import com.bufoon.test.config.mq.rabbit.prop.instance.JqmVhost;

/**
 * 与MQ配置映射的java类
* @ClassName: MqProperties  
* @Description: 与MQ配置映射的java类
* @author anling.song  
* @date 2017年7月10日 下午2:09:29
 */
@Configuration
@PropertySource(value = "classpath:configs/rabbit-mq.properties")
@ConfigurationProperties(prefix="mq")
public class MqProperties {
	private JqmVhost jqmVhost; //借钱么
	private ClfVhost clfVhost; //现金贷
	private GdpVhost gdpVhost; //淘金项目

	public JqmVhost getJqmVhost() {
		return jqmVhost;
	}

	public void setJqmVhost(JqmVhost jqmVhost) {
		this.jqmVhost = jqmVhost;
	}

	public ClfVhost getClfVhost() {
		return clfVhost;
	}

	public void setClfVhost(ClfVhost clfVhost) {
		this.clfVhost = clfVhost;
	}

	public GdpVhost getGdpVhost() {
		return gdpVhost;
	}

	public void setGdpVhost(GdpVhost gdpVhost) {
		this.gdpVhost = gdpVhost;
	}
	
}
