package com.ankit.springboot.service;

import java.util.List;

import com.ankit.springboot.model.Employee;

public interface EmployeeService 
{
	List<Employee> getAllEmployees();
	Employee getEmployeeById(long id);
	Employee saveEmployee(Employee employee);
	Employee updateEmployee(Employee employee, long id);
	void deleteEmployee(long id);

}