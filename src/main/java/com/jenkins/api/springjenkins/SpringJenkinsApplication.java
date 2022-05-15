package com.jenkins.api.springjenkins;



import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import javax.annotation.PostConstruct;

import org.slf4j.Logger;


@SpringBootApplication
public class SpringJenkinsApplication {
	
	public static Logger logger = LoggerFactory.getLogger(SpringJenkinsApplication.class);
	 
	 @PostConstruct
	 public void init() {
		 
		 logger.info("App started");
	 }
	
	public static void main(String[] args) {
		
		logger.info("App executed");
		SpringApplication.run(SpringJenkinsApplication.class, args);
	}

}
