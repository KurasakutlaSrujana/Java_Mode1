package com.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;

import com.model.Employee;
import com.service.EmployeeService;

@Controller
public class EmployeeController {
	@Autowired
	private EmployeeService employeeService;
	@GetMapping(value="/add")
	public String add(@ModelAttribute Employee employee,Model model) {
		Employee employee1 = employeeService.addEmployee(employee);
		model.addAttribute("key1", employee1);
		return "addemployee";
		}
	
	@GetMapping(value="/read")
	public String read(@PathVariable("id")int number,Model model) {
		Employee employee2 = employeeService.readEmployeeById(number);
		model.addAttribute("key2", employee2);
		return "readview";
	}
	
	@GetMapping(value="/display")
	public String displayAllEmployees(Model model) {
		List<Employee> employees = employeeService.listEmployee();
		return "displayall";
	}
}
