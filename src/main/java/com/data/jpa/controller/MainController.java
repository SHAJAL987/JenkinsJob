package com.data.jpa.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/actuator/api")
public class MainController {
	
	public String checkApiHealth() {
		return "API Health is Ok!!";
	}
}
