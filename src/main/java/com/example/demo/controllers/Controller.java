package com.example.demo.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path="/test")
public class Controller {
	
	@GetMapping(path="/hello")
	public String hello() {
		return "world";
	}

}
