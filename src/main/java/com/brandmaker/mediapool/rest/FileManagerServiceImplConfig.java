package com.brandmaker.mediapool.rest;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class FileManagerServiceImplConfig {
	
	@Bean
	FileManagerService getFileManagerService() {
		return new FileManagerServiceImpl();
	}
	
}
