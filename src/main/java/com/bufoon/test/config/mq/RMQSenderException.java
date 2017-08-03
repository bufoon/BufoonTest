package com.bufoon.test.config.mq;

import com.bufoon.test.base.BaseException;

/**
 * rabbitmq 消息发送异常类
* @ClassName: RMQSenderException  
* @Description: rabbitmq 消息发送异常类 
* @author anling.song  
* @date 2017年7月13日 上午11:06:08
 */
public class RMQSenderException extends BaseException {

	private static final long serialVersionUID = 4841461836197652041L;

	public RMQSenderException() {
		super();
	}

	public RMQSenderException(String systemName, String errorCode, String message, Object data, Throwable cause) {
		super(systemName, errorCode, message, data, cause);
	}

	public RMQSenderException(String systemName, String errorCode, String message, Object data) {
		super(systemName, errorCode, message, data);
	}

	public RMQSenderException(String systemName, String errorCode, String message, Throwable cause) {
		super(systemName, errorCode, message, cause);
	}

	public RMQSenderException(String systemName, String errorCode, Throwable cause) {
		super(systemName, errorCode, cause);
	}

	public RMQSenderException(String systemName, String errorCode) {
		super(systemName, errorCode);
	}

	public RMQSenderException(String message, Throwable th) {
		super(message, th);
	}

	public RMQSenderException(String message) {
		super(message);
	}

	public RMQSenderException(Throwable th) {
		super(th);
	}
	
}
