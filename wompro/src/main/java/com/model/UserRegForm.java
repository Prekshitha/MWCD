package com.model;



import org.springframework.web.multipart.MultipartFile;

public class UserRegForm {

	private MultipartFile files[];
	
	

	public MultipartFile[] getFiles() {
		return files;
	}

	public void setFiles(MultipartFile files[]) {
		this.files = files;
	}

	
}
