package com.project.services.controller;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;

@RestController
public class MyController {

	@GetMapping("/web/microservices")
	public String getData() {
		
		return "This is a small springboot app microservices";
	}
	
}
