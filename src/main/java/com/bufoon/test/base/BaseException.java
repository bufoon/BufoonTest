package com.bufoon.test.base;

import java.util.List;

/**
 * Created by Panda on 2016/9/27.
 *
 * @version 1.0
 * @description com.bqjr.base.BaseException
 */
public class BaseException extends Exception {

    private static final long serialVersionUID = 7626850112855859907L;
	private String systemName;
    private String errorCode;
    private String message;
    private List<String> messages;
    private Object data;

    public BaseException(String systemName, String errorCode, String message, Object data, Throwable cause) {
        super(message, cause);
        this.message = message;
        this.data = data;
        this.systemName = systemName;
        this.errorCode = errorCode;
    }
    public BaseException(String systemName, String errorCode, String message, Object data) {
    	super(message);
        this.message = message;
        this.data = data;
        this.systemName = systemName;
        this.errorCode = errorCode;
    }
    public BaseException(String systemName, String errorCode, String message, Throwable cause) {
        super(message, cause);
        this.message = message;
        this.systemName = systemName;
        this.errorCode = errorCode;
    }

    public BaseException(String systemName, String errorCode, Throwable cause) {
        super("BaseException", cause);
        this.errorCode = errorCode;
        this.systemName = systemName;
    }


    public BaseException(String systemName, String errorCode) {
        this.errorCode = errorCode;
        this.systemName = systemName;
    }

    public BaseException() {
        super();
    }

    public BaseException(String message) {
        super(message);
        this.message = message;
    }

    public BaseException(Throwable th) {
        super(th);
    }

    public BaseException(String message, Throwable th) {
        super(message, th);
        this.message = message;
    }


    public String getSystemName() {
        return systemName;
    }

    public void setSystemName(String systemName) {
        this.systemName = systemName;
    }

    public String getErrorCode() {
        return errorCode;
    }

    public void setErrorCode(String errorCode) {
        this.errorCode = errorCode;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public List<String> getMessages() {
        return messages;
    }

    public void setMessages(List<String> messages) {
        this.messages = messages;
    }

	public Object getData() {
		return data;
	}

	public void setData(Object data) {
		this.data = data;
	}
    
}
