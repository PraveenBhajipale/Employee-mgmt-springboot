package com.spring.mongo.demo.service;

import java.util.List;

import com.spring.mongo.demo.model.Employee;

public interface EmployeeQueryService {
	
	List<Employee> getAll();

	Employee getSingleEmployeeByLastName(String lastName);

	List<Employee> getEmployeeBySalaryGreaterThan(int salary);

}
