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
	
	@GetMapping("/bye")
	public String getBye() {
		return "Bye Tarun";
	}

}
