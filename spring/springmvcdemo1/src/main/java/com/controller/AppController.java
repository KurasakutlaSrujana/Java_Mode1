package com.controller;

import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;

import com.model.Employee;
//import org.springframework.web.bind.annotation.RequestMapping;
//import org.springframework.web.bind.annotation.RequestMethod;



@Controller
public class AppController {
	//@RequestMapping(value="/abc", method=RequestMethod.POST)
	@GetMapping(value={"/abc","efg"})
	public String firstFunction() {
		System.out.println("inside first function");
		return "Anyname";
	}
	
	@GetMapping("hij")
	public String secFunction(@RequestParam("userName")String val) {
		System.out.println("inside second function " +val);
		return "Anyname";
	}
	@GetMapping("sru")
	public String function(@RequestParam Map<String, String>val) {
		//System.out.println("inside second function " +val);
		String user = val.get("userName");
		String password = val.get("password");
		System.out.println("User Name "+user);
		System.out.println("Password "+password);
		return "Anyname";
	}
	
	@GetMapping("lmn/{alias}/{alias1}")
	public String thirdFunction(@PathVariable("alias") String val,@PathVariable("alias1") String val1) {
		System.out.println("inside third function " +val);
		System.out.println(val1);
		return "Anyname";
	}
	//carry data from controller to jsp
	@GetMapping("carry")
	public String fourthFunction(Model model) {
		
		model.addAttribute("key1","student");
		return "Success";
	}
	
	@GetMapping("emp")
	public String fifthFunction(Model model) {
		
		Employee employee = new Employee();
		employee.setEmpId(10);
		employee.setEmpName("srujana");
		model.addAttribute("key",employee);
		return "Success";
	}
}
