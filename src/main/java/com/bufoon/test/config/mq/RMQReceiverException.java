package com.bufoon.test.config.mq;

import com.bufoon.test.base.BaseException;

/**
 * rabbitmq 消息接收异常类
* @ClassName: RMQReceiverException  
* @Description: rabbitmq 消息接收异常类 
* @author anling.song  
* @date 2017年7月13日 上午11:05:43
 */
public class RMQReceiverException extends BaseException {

	private static final long serialVersionUID = 3474276360330727351L;

	public RMQReceiverException() {
		super();
	}

	public RMQReceiverException(String systemName, String errorCode, String message, Object data, Throwable cause) {
		super(systemName, errorCode, message, data, cause);
	}

	public RMQReceiverException(String systemName, String errorCode, String message, Object data) {
		super(systemName, errorCode, message, data);
	}

	public RMQReceiverException(String systemName, String errorCode, String message, Throwable cause) {
		super(systemName, errorCode, message, cause);
	}

	public RMQReceiverException(String systemName, String errorCode, Throwable cause) {
		super(systemName, errorCode, cause);
	}

	public RMQReceiverException(String systemName, String errorCode) {
		super(systemName, errorCode);
	}

	public RMQReceiverException(String message, Throwable th) {
		super(message, th);
	}

	public RMQReceiverException(String message) {
		super(message);
	}

	public RMQReceiverException(Throwable th) {
		super(th);
	}
	
	
}
