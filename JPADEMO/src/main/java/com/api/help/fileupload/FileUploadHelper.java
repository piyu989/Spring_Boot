package com.api.help.fileupload;

import java.io.File;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;

import org.springframework.stereotype.Component;
import org.springframework.web.multipart.MultipartFile;

@Component
public class FileUploadHelper {
	public final String upload_dir="D:\\Spring_Boot_Work_Space\\JPADEMO\\src\\main\\resources\\static//Images";
	
	public boolean uploadFile(MultipartFile fi) {
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
			
			Files.copy(fi.getInputStream(), Paths.get(upload_dir+File.pathSeparator+fi.getOriginalFilename()),StandardCopyOption.REPLACE_EXISTING);
			
			
			f=true;
			
		} catch (Exception e) {
			// TODO: handle exception
		}
		
		return f;
	}
	
}