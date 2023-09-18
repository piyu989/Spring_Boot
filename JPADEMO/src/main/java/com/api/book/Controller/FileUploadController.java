package com.api.book.Controller;

import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RequestPart;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

@RestController
public class FileUploadController {
	@PostMapping(value="upload-file")
//	@PostMapping(value="upload-file",produces = MediaType.APPLICATION_JSON_VALUE, consumes = MediaType.MULTIPART_FORM_DATA_VALUE)
	public ResponseEntity<String> uploadFile(@RequestPart(value="file") MultipartFile file){
//		public ResponseEntity<String> uploadFile(@RequestPart(value="file", required = false) MultipartFile file){

		return ResponseEntity.ok("working..");	
	}
}
