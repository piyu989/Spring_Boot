package com.api.book.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

@RestController
public class FileUploadController {
	@Autowired
	public FileUploadController obj;
	
	@PostMapping("/upload-file")
	public ResponseEntity<String> uploadFile(@RequestParam("file") MultipartFile file)
	{
//		System.out.println(file.getName());
//		System.out.println(file.getOriginalFilename());
//		System.out.println(file.getSize());
		
//		return ResponseEntity.ok("working..");.
		
		try {
			obj.uploadFile(file);
			return ResponseEntity.ok("done...");
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body("wrong");
	}
}
