package com.spring.mongo.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import com.spring.mongo.demo.model.Employee;
import com.spring.mongo.demo.service.EmployeeService;

@RestController
@RequestMapping("/employee-jpa")
public class EmployeeController {
	
	@Autowired
	private EmployeeService employeeService;
	
	@GetMapping("/getAll")
	public List<Employee> getAll() {
		return employeeService.getAll();
	}

	@GetMapping("/{empId}")
	public Employee getEmployeeById(@PathVariable String empId ) {
		return employeeService.getEmployeeById(empId);
	}
	
	@GetMapping("/getByDeptId/{deptId}")
	public List<Employee> getEmployeeByName(@PathVariable String deptId ) {
		return employeeService.getEmployeeBydeptId(deptId);
	}

	@PostMapping("/addEmployee")
	public String addEmployee(@RequestBody List<Employee> list ) {
		return employeeService.addEmployee(list);
	}


	@DeleteMapping("/{id}")
	public String delete(@PathVariable String id) {
		return employeeService.delete(id);
	}

}




