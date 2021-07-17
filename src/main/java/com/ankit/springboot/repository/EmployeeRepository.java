package com.ankit.springboot.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ankit.springboot.model.Employee;

public interface EmployeeRepository extends JpaRepository<Employee, Long> // Internally provides @Repository and @Transactional annotation
{

}
