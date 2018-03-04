package com.example.demo.user.service;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@Controller
public class HelloController2 {

    private static final Logger logger = LoggerFactory.getLogger(HelloController2.class);

    @Value("${property.hello}")
    private String propertyHello;

    @Value("${property.hi}")
    private String propertyHi;

    @Value("${property.hey}")
    private String propertyHey;


	@RequestMapping("/service")
	public String hello(Model model,@RequestParam(value = "name", defaultValue = "Unknown", required = false) String name) {

		logger.trace("1");
		logger.debug("2");
		logger.info("3");
		logger.warn("4");
		logger.error("5");
		
		return "hello";
	}
}
