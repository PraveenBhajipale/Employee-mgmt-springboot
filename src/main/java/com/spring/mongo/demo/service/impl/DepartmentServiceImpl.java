package com.spring.mongo.demo.service.impl;

import com.spring.mongo.demo.model.Department;
import com.spring.mongo.demo.repository.DepartmentRepository;
import com.spring.mongo.demo.service.EmployeeService;
import com.spring.mongo.demo.service.DepartmentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class DepartmentServiceImpl implements DepartmentService {

    @Autowired
    private DepartmentRepository repository;
    @Autowired
    private EmployeeService employeeService;

    @Override
    public List<Department> findAll() {

        List<Department> depts = repository.findAll();
        for (Department s : depts) {
            s.setEmployeeList(employeeService.getEmployeeBydeptId(s.getId()));
        }
        return depts;
    }

    @Override
    public Department findById(String id) {
        return repository.findById(id).get();
    }

    @Override
    public String save(Department dept) {
        return "Added successfully";
    }

    @Override
    public String update(Department dept) {
        return "Updated successfully";
    }

    @Override
    public String delete(String id) {
       repository.findById(id).ifPresent(dept -> repository.delete(dept));
       return "deleted";
    }
}
