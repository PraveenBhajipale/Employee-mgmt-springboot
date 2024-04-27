package com.spring.mongo.demo.repository;

import com.spring.mongo.demo.model.Department;
import org.springframework.data.mongodb.repository.MongoRepository;


public interface DepartmentRepository extends MongoRepository<Department, String> {

}
