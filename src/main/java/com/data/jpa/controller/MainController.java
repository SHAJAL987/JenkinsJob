package com.data.jpa.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/")
public class MainController {
	
	@GetMapping
	public String checkApiHealth() {
		return "API Health is Ok!!";
	}
	
	@GetMapping("Test")
	public String test() {
		return "API Health is Ok!!";
	}
}
