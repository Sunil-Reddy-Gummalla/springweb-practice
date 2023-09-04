package com.practice.spring.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
	
	@GetMapping("/")
	public String getHello() {
		return "Welcome to my Page Success";
	}
	
	@GetMapping("/reddy")
	public String getReddy() {
		return "Hi Sunil Reddy";
	}

}
