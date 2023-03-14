package com.nagarro.springdevops.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {
@GetMapping("/user")
	public String message() {	
	return "Hello World Shailya!!!";
		
	}
}
