package com.api.book.Controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FileUploadController {
	@PostMapping("/upload")
	public ResponseEntity<String> uploadFile()
	{
		return ResponseEntity.ok("working..");
	}
}
