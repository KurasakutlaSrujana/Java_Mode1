package com.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HelloController {
	@GetMapping(value = "/bb")
	public String sayHello() {
		return "Success";
	}
}
