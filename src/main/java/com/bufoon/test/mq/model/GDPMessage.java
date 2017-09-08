package com.bufoon.test.mq.model;

import java.io.Serializable;
import java.util.Date;

import com.alibaba.fastjson.annotation.JSONField;

public class GDPMessage<T> implements Serializable {

	private static final long serialVersionUID = -3559252670472614687L;
	@JSONField(name="system_time", format="yyyy-MM-dd HH:mm:ss")
	private Date systemTime;
	@JSONField(name="business_date", format="yyyy-MM-dd")
	private Date businessDate;
	private Integer size;
	private T data;
	public Date getSystemTime() {
		return systemTime;
	}
	public void setSystemTime(Date systemTime) {
		this.systemTime = systemTime;
	}
	public Date getBusinessDate() {
		return businessDate;
	}
	public void setBusinessDate(Date businessDate) {
		this.businessDate = businessDate;
	}
	public Integer getSize() {
		return size;
	}
	public void setSize(Integer size) {
		this.size = size;
	}
	public T getData() {
		return data;
	}
	public void setData(T data) {
		this.data = data;
	}
	
}
