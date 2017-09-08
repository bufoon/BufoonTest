package com.bufoon.test.fanxing;

import java.io.Serializable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Message<T> implements Serializable {

	private static final long serialVersionUID = -53002020362007099L;
	private String code;
	private T data;
	public String getCode() {
		return code;
	}
	public void setCode(String code) {
		this.code = code;
	}
	public T getData() {
		return data;
	}
	public void setData(T data) {
		this.data = data;
	}
	
	public static void main(String[] args) {
		ExecutorService pool = Executors.newCachedThreadPool();
		
		for (int i = 0; i < 5; i++) {
			pool.submit(new Runnable() {
				@Override
				public void run() {
					try {
						test();
					} catch (Exception e) {
						e.printStackTrace();
					}
				}
			});
		}
	}
	
	public static void test() throws Exception{
		System.out.println(1/0);
	}
	
}
