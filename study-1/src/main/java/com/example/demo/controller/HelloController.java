package com.example.demo.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.example.demo.model.User;
import com.example.demo.repository.UserDao;

@Controller
public class HelloController {

    private static final Logger logger = LoggerFactory.getLogger(HelloController.class);
    
    @Autowired
    private UserDao userRepository;
    
	@RequestMapping("/hello")
	public String hello(Model model,@RequestParam(value = "name", defaultValue = "Unknown", required = false) String name) {

		logger.debug("DEBUG message test!! text : {}" , name);
		model.addAttribute("name", name);

		return "hello";
	}
	
	@RequestMapping("/controller")
	public String controller(Model model) {
		
		logger.trace("1");
		logger.debug("2");
		logger.info("3");
		logger.warn("4");
		logger.error("5");
		
		return "hello";
	}
	
	
	@RequestMapping("/getUser")
	public String getUser(Model model) {

		User u = userRepository.getUser(1);
		logger.debug("userRepository : "+ u);

		
		return "hello";
	}
}
