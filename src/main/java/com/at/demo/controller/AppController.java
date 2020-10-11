package com.at.demo.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AppController {
	@RequestMapping("/welcome")
	public String getWelcome() {
		return "Welcome Human";
	}

}
