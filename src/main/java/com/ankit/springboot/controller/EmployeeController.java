package com.ankit.springboot.controller;

import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ankit.springboot.model.Employee;
import com.ankit.springboot.service.EmployeeService;

@RestController
@RequestMapping("/api/employees")
public class EmployeeController 
{
	
	private EmployeeService employeeService;

	public EmployeeController(EmployeeService employeeService) 
	{
		super();
		this.employeeService = employeeService;
	}
	
	
	// build get all employees REST API
	@GetMapping
	public List<Employee> getAllEmployees()
	{
		return employeeService.getAllEmployees();
	}
	
	// build get employee by id REST API
	// http://localhost:8080/api/employees/1
	@GetMapping("{id}")
	public ResponseEntity<Employee> getEmployeeById(@PathVariable("id") long employeeId)
	{
		return new ResponseEntity<Employee>(employeeService.getEmployeeById(employeeId), HttpStatus.OK);
	}
	
}