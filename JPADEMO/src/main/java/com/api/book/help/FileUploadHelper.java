package com.api.book.help;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;
import org.springframework.core.io.ClassPathResource;
import org.springframework.stereotype.Component;
import org.springframework.web.multipart.MultipartFile;

@Component
public class FileUploadHelper {
	public final String upload_dir="D:\\Spring_Boot_Work_Space\\JPADEMO\\src\\main\\resources\\static//Images";
//	public final String upload_dir=Paths.get("static/image").toAbsolutePath().toString();
	
	public FileUploadHelper(){
		
	}
	public boolean uploadFile(MultipartFile multipartFile) {
		boolean f=false;
		
		try {
//			InputStream is=fi.getInputStream();
//			byte arr[]=new byte[is.available()];
//			is.read(arr);
//			
//			FileOutputStream fo=new FileOutputStream(upload_dir+File.separator+fi.getOriginalFilename());
//			
//			fo.flush();		
//			fo.close();
			
			Files.copy(multipartFile.getInputStream(), Paths.get(upload_dir+File.separator+multipartFile.getOriginalFilename()),StandardCopyOption.REPLACE_EXISTING);
			
			
			f=true;
			
		} catch (Exception e) {
			// TODO: handle exception
		}
		
		return f;
	}
	
}