package com.learn.designpattern.builderpattern.test;

import com.learn.designpattern.builderpattern.User;

public class TestUserBuilderPattern {
	
	public static void main(String args[]) {
		
		User user1 = new User.UserBuilder("Rahul", "Singh").age(30).phone("8971077737").address("Trichy").build();
		System.out.println(user1);
		User user2 = new User.UserBuilder("Vinay", "Sharma").build();
		System.out.println(user2);
		
	}

}
