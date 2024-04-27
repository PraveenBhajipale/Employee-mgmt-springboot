package com.spring.mongo.demo.service;

import com.spring.mongo.demo.model.Department;

import java.util.List;

public interface DepartmentService {

    List<Department> findAll();

    Department findById(String id);

    String save(Department dept);

    String update(Department dept);

    String  delete(String id);
}
