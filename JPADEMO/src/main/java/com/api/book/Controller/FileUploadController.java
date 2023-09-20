package com.api.book.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RequestPart;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import com.api.book.help.FileUploadHelper;

import jakarta.servlet.Servlet;

@RestController
public class FileUploadController {
	@Autowired
	private FileUploadHelper fi=new FileUploadHelper();
	
	@PostMapping(value="upload-file")
//	@PostMapping(value="upload-file",produces = MediaType.APPLICATION_JSON_VALUE, consumes = MediaType.MULTIPART_FORM_DATA_VALUE)
	public ResponseEntity<String> uploadFile(@RequestPart(value="file") MultipartFile file){
//		public ResponseEntity<String> uploadFile(@RequestPart(value="file", required = false) MultipartFile file){
		
		try {
			if(file.isEmpty()) {
				return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body("file not found");
				
			}
			if(file.getContentType().equals("image/jpg")) {
				return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body("file is not good");
			}
			boolean f=fi.uploadFile(file);
			if(f) {
				return ResponseEntity.ok(ServletUriComponentsBuilder.fromCurrentContextPath().path("/Images/").path(file.getOriginalFilename()).toUriString());
//				return ResponseEntity.ok("uploaded succesfully");
			}
		}catch (Exception e) {
			// TODO: handle exception
		}
		return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body("not working properly");
	}
}
