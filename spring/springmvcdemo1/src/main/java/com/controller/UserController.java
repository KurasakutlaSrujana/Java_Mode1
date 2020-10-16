package com.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;

import com.model.User;

@Controller
public class UserController {
	/*
	 * @PostMapping(value="/login") public String loginFunction(@ModelAttribute User
	 * user,Model model) {
	 * 
	 * System.out.println(user.getUserName()); model.addAttribute("key", user);
	 * return "Welcome"; }
	 */
	
	@PostMapping(value="/logins")/*value="/login"*/
	public ModelAndView loginFunction(@ModelAttribute User user,Model model) {
		
		System.out.println(user.getUserName());
		ModelAndView modelAndView;
		if(user.getUserName().equals("srujana")) {
			modelAndView = new ModelAndView("Welcome");
			modelAndView.addObject("key",user);
		}else {
			modelAndView = new ModelAndView("Teabreak");
		}
	
		return modelAndView;
	}
	@GetMapping(value="/one")
	public String one() {
		System.out.println("yuo are in one()");
		return "redirect:two";
	}
	@GetMapping(value="/two")
	public String two() {
		System.out.println("you are also in two()");
		return "Teabreak";
	}
}
