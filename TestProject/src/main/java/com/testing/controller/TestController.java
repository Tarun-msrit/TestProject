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
		return "Good Bye Tarun,see you next time";
	}


	@GetMapping("/welcome")
	public String getWelcome() {
		return "Hello Tarun,how are you";
	}
	
	@GetMapping("/")
	public String home() {
		return ("<h1>Welcome</h1>");
	}
	
	@GetMapping("/user")
	public String user() {
		return ("<h1>Welcome user</h1>");
	}
	
	@GetMapping("/admin")
	public String admin() {
		return ("<h1>Welcome admin</h1>");
	}
}
