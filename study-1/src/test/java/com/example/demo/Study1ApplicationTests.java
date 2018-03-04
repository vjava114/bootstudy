package com.example.demo;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.example.demo.model.User;
import com.example.demo.repository.UserDao;

@RunWith(SpringRunner.class)
@SpringBootTest
public class Study1ApplicationTests {

    @Autowired
    private UserDao userRepository;

	@Test
	public void contextLoads() {
		
		System.out.println("ttt");
		User u = userRepository.getUser(1);
		System.out.println(u.getUserKey());
	}

}
