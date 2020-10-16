package com.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.model.Employee;
@Service
public class EmployeeServiceImpl implements EmployeeService {

	@Override
	public Employee addEmployee(Employee employee) {
		String value = employee.getEmployeeName();
		employee.setEmployeeName(value);
		return employee;
	}

	@Override
	public Employee readEmployeeById(int employeeNumber) {
		Employee employee = null;
		if(employeeNumber == 10) {
			employee = new Employee(10,"srujana",40000);
		}
		else if(employeeNumber == 20){
			employee = new Employee(20,"vijju",50000);
		}
		return employee;
	}

	@Override
	public List<Employee> listEmployee() {
	    Employee employee1 = new Employee(30,"sruthi",70000);
	    Employee employee2 = new Employee(50,"seetha",10000);
	    Employee employee3 = new Employee(40,"vikky",30000);
	    List<Employee> employees = new ArrayList<Employee>();
	    employees.add(employee1);
	    employees.add(employee2);
	    employees.add(employee3);
		return employees;
	}

}
