package com.spring.mongo.demo.service;


import java.util.List;

import com.spring.mongo.demo.model.Employee;

public interface EmployeeService {
	
	List<Employee> getAll();

	Employee getEmployeeById(String empId);

	List<Employee> getEmployeeBydeptId(String deptId);

	String addEmployee(List<Employee> list);

    String delete(String id);
}
