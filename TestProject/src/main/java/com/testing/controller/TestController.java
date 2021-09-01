package com.testing.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/")
public class TestController {

	@GetMapping("/hello")
	public String getHello() {
		return "Hello Tarun";
	}
	
	@GetMapping("/fruit")
	public String getFruit() {
		return "Mango";
	}
	

	@GetMapping("/bye")
	public String getBye() {
		return "Good Bye Tarun";
	}


	@GetMapping("/welcome")
	public String getWelcome() {
		return "Hello Tarun,how are you";
	}

}
