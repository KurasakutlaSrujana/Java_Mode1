package com.service;



import java.util.List;

import com.model.Employee;

public interface EmployeeService {
	public Employee addEmployee(Employee employee);
	public Employee readEmployeeById(int employeeNumber);
	public List<Employee> listEmployee();
}
