package com.springboot;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/first")
public class MyController {
	
	@GetMapping
	public String returnValue() {
		return "Hi, Welcome to your first Springboot application Aniket";
	}
	

}
