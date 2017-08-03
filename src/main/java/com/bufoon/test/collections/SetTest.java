package com.bufoon.test.collections;

import java.util.HashSet;
import java.util.Set;

import com.alibaba.fastjson.JSON;

public class SetTest {

	public static void main(String[] args) {
//		User user1 = new User(1, "u1");
//		User user2 = new User(2, "u2");
//		User user3 = new User(3, "u3");
//		User user4 = new User(1, "u1");
//		Set<User> users = new HashSet<>();
//		users.add(user1);
//		users.add(user2);
//		users.add(user3);
//		users.add(user4);
//		System.out.println(JSON.toJSONString(users));
		
		User2 user1 = new User2("1", "u1");
		User2 user2 = new User2("2", "u2");
		User2 user3 = new User2("1", "u3");
		User2 user4 = new User2("1", "u1");
		Set<User2> users = new HashSet<>();
		users.add(user1);
		System.out.println(user1.hashCode() + " | " + user1.equals(user2) + "," + user1.equals(user3) + "," + user1.equals(user4));
		users.add(user2);
		System.out.println(user2.hashCode() + " | " + user2.equals(user1) + "," + user2.equals(user3) + "," + user2.equals(user4));
		users.add(user3);
		System.out.println(user3.hashCode() + " | " + user3.equals(user1) + "," + user3.equals(user2) + "," + user3.equals(user4));
		users.add(user4);
		System.out.println(user4.hashCode() + " | " + user4.equals(user1) + "," + user4.equals(user2) + "," + user4.equals(user3));
		System.out.println(JSON.toJSONString(users));
	}
}
