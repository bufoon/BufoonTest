package com.bufoon.test.mq.model;

public class TestChild extends TestParent {

	private int age;
	private String gender;
	
	public TestChild(String id, String name, int age, String gender) {
		super(id, name);
		this.age = age;
		this.gender = gender;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	
}
