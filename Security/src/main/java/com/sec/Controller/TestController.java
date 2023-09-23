package com.sec.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.sec.Models.User;
import com.sec.services.UserServices;
@RestController
@RequestMapping("/users")
public class TestController {
	@Autowired
	private UserServices userservise=new UserServices();
	
	@GetMapping("/")
	public List<User> getAllUser(){
		return this.userservise.getAllUser();
	}
	
	@GetMapping("/{u}")
	public User getUser(@PathVariable("u") String username) {
		return this.userservise.getUserById(username);
	}
	
	@PostMapping("/")
	public User addUser(@RequestBody User u) {
		this.userservise.addUser(u);
		return u;
	}
	
}
