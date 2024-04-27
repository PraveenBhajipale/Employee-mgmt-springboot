package com.spring.mongo.demo.service.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.spring.mongo.demo.model.Employee;
import com.spring.mongo.demo.repository.EmployeeRepository;
import com.spring.mongo.demo.service.EmployeeService;

@Service
public class EmployeeServiceImpl implements EmployeeService {

	@Autowired
	private EmployeeRepository repository;
	
	@Override
	public List<Employee> getAll() {
		return repository.findAll();
	}


	@Override
	public Employee getEmployeeById(String empId) {
		List<Employee> employees = repository.findAll();
		for (Employee emp : employees) {
			if (empId.equalsIgnoreCase(emp.getId()))
				return emp;
		}
		return null;

	}

	@Override
	public List<Employee> getEmployeeBydeptId(String deptId) {
		List<Employee> employees = new ArrayList<>();
		List<Employee> list = repository.findAll();
		for (Employee emp : list) {
			if (emp.getDeptId().equalsIgnoreCase(deptId))
				employees.add(emp);
		}
		return employees;
	}

	@Override
	public String addEmployee(List<Employee> list){
		List<Employee> l = repository.saveAll(list);
		return "Added successfully";
	};



	@Override
	public String delete(String id) {
		System.out.println(id+" -==================================");
		repository.findById(id).ifPresent(employee -> repository.delete(employee));
		return "deleted";
	}

}
