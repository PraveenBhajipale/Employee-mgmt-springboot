package com.spring.mongo.demo.controller;


import com.spring.mongo.demo.model.Department;
import com.spring.mongo.demo.service.DepartmentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/department")
public class DepartmentController {

    @Autowired
    private DepartmentService departmentService;

    @GetMapping("/getdept")
    public List<Department> findAll() {
         return departmentService.findAll();
    }


    @GetMapping("/{id}")
    public Department findById(@PathVariable String id) {
        Department department = departmentService.findById(id);
        return department;
    }


    @PostMapping
    public String save(@RequestBody Department data) {
        return departmentService.save(data);
    }


    @PutMapping
    public String update(@RequestBody Department dept) {
        return departmentService.update(dept);
    }


    @DeleteMapping("/{id}")
    public String delete(@PathVariable String id) {
        return departmentService.delete(id);
    }
}
