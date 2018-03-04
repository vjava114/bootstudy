package com.example.demo;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class Study1Application {

    private static final Logger logger = LoggerFactory.getLogger(Study1Application.class);

    @Value("${property.hello}")
    private String propertyHello;

    @Value("${property.hi}")
    private String propertyHi;

    @Value("${property.hey}")
    private String propertyHey;
    
    @Value("${spring.profiles.active}")
    private String activeProfiles;
    
    
	public static void main(String[] args) {
		SpringApplication.run(Study1Application.class, args);
	}
	
	@Bean
	public CommandLineRunner runner() {

	    return (a) -> {

	    	logger.info("CommandLineRunner: " + activeProfiles);
	        logger.info("CommandLineRunner: " + propertyHello);
	        logger.info("CommandLineRunner: " + propertyHi);
	        logger.info("CommandLineRunner: " + propertyHey);
	    };
	};
}
