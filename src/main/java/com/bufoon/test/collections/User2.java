package com.bufoon.test.collections;

public class User2 {
	private String id;
	private String name;

	public User2() {

	}

	public User2(String id, String name) {
		this.id = id;
		this.name = name;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public boolean equals(Object obj) {
		if (obj == null)
			return false;
		if (this == obj)
			return true;
		if (obj instanceof User2) {
			User2 user2 = (User2) obj;
			return user2.getId().equals(this.id);
		}
		return false;
	}

	@Override
	public int hashCode() {

		return id.hashCode(); // 只比较id，id一样就不添加进集合
		// return id.hashCode() * username.hashCode();
	}

}
