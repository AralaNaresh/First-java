package com.example.spring.first_app;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Homecontroller {

	@RequestMapping("/hello")
	public String hello() {
		return "hello java";
	}
}
