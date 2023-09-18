package com.jpa.db.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FileUploadController {
	@PutMapping("/upload")
	public ResponseEntity<String>ans(){
		return ResponseEntity.status(HttpStatus.OK).body("working");
	}
}
