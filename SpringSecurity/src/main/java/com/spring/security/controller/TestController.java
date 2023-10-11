package com.spring.security.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/home")
public class TestController {
	@GetMapping("normal")
	public ResponseEntity<String>normalUser(){
		return ResponseEntity.ok("this is for normal user");
	}

	@GetMapping("admin")
	public ResponseEntity<String>admin(){
		return ResponseEntity.ok("this is for admin");
	}

	@GetMapping("public")
	public ResponseEntity<String>owner(){
		return ResponseEntity.ok("this is for public user");
	}
}
