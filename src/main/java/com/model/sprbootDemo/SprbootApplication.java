package com.model.sprbootDemo;

import org.apache.log4j.Logger;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SprbootApplication {

	private static Logger logger = Logger.getLogger(SprbootApplication.class);
	
	public static void main(String[] args) {
		
		logger.info("devopsDemo is begin running.........................");
		
		SpringApplication.run(SprbootApplication.class, args);
	}
}











