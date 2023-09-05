package com.springpractice.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PracticeController {

	@GetMapping("/home")
	public String getStringResponse() {
		return"ram ram ";
	}
}
