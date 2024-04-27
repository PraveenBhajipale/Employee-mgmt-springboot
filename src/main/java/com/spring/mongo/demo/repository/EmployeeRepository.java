package com.spring.mongo.demo.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.spring.mongo.demo.model.Employee;

import java.util.List;

public interface EmployeeRepository extends MongoRepository<Employee, String> {


}
