package com.ankit.springboot.service.impl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ankit.springboot.exception.ResourceNotFoundException;
import com.ankit.springboot.model.Employee;
import com.ankit.springboot.repository.EmployeeRepository;
import com.ankit.springboot.service.EmployeeService;

@Service
public class EmployeeServiceImpl implements EmployeeService
{

	private EmployeeRepository employeeRepository;
	
	@Autowired
	public EmployeeServiceImpl(EmployeeRepository employeeRepository) 
	{
		super();
		this.employeeRepository = employeeRepository;
	}


	@Override
	public List<Employee> getAllEmployees() 
	{
		return employeeRepository.findAll();
	}

	@Override
	public Employee getEmployeeById(long id) 
	{
		Optional<Employee> employee = employeeRepository.findById(id);
		if(employee.isPresent()) 
		{
			return employee.get();
		}
		else 
		{
			throw new ResourceNotFoundException("Employee", "Id", id);
		}
		//return employeeRepository.findById(id).orElseThrow(() -> new ResourceNotFoundException("Employee", "Id", id));
		
	}
	
}
