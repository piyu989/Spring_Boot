package com.sec.services;

import java.util.ArrayList;

import org.springframework.stereotype.Service;

import com.sec.Models.User;

@Service
public class UserServices {
	ArrayList<User>li=new ArrayList<>();
	
	public UserServices() {
		li.add(new User("Piyush","piyush","piyush"));
		li.add(new User("abc","abc","abc"));
		li.add(new User("abs","abs","abs"));
	}
	
	public ArrayList<User> getAllUser(){
		return this.li;
	}
	
	public User getUserById(String s) {
		return this.li.stream().filter(e->e.getName().equals(s)).findAny().orElse(null);
	}
	
	public User addUser(User u) {
		this.li.add(u);
		return u;
	}
	
}
