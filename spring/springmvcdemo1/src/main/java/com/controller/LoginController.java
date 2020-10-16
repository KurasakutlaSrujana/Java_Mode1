package com.controller;

import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class LoginController {

	@GetMapping("/login")
	public String function(@RequestParam Map<String, String> val, Model model) {
		String user = val.get("userName");
		// String password = val.get("password");
		System.out.println("User Name " + user);
		// System.out.println("Password "+password);
		model.addAttribute("key", user);
		return "WelcomeUser";
	}

	@GetMapping("ref/{alias}/{alias1}")
	public String thirdFunction(@PathVariable("alias") String val1, @PathVariable("alias1") String val2) {
		System.out.println("first argument : " + val1);
		System.out.println("secong argument : " + val2);
		return "WelcomeUser";
	}
}
