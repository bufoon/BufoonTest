package com.bufoon.test.config.mq.rabbit.prop;

/**
 * MQ连接信息
* @ClassName: MqConnection  
* @Description:  MQ连接信息 
* @author anling.song  
* @date 2017年7月10日 下午2:09:04
 */
public class MqConnProperties {
	private String host;
	private int port;
	private String username;
	private String password;
	private String virtualHost;
	
	private MqConnProperties connection;
	
	public String getHost() {
		return host;
	}
	public void setHost(String host) {
		this.host = host;
	}
	public int getPort() {
		return port;
	}
	public void setPort(int port) {
		this.port = port;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getVirtualHost() {
		return virtualHost;
	}
	public void setVirtualHost(String virtualHost) {
		this.virtualHost = virtualHost;
	}
	public MqConnProperties getConnection() {
		return connection;
	}
	public void setConnection(MqConnProperties connection) {
		this.connection = connection;
	}
	
}
