package com.spring.mongo.demo;

import com.spring.mongo.demo.model.Department;
import com.spring.mongo.demo.model.Employee;
import com.spring.mongo.demo.repository.EmployeeRepository;
import com.spring.mongo.demo.repository.DepartmentRepository;
import com.spring.mongo.demo.utils.HelperUtil;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;
import org.springframework.transaction.annotation.EnableTransactionManagement;

import java.util.List;


@SpringBootApplication
@EnableMongoRepositories
public class SpringBootMongoDBApplication {

	private final Logger LOGGER = LoggerFactory.getLogger(getClass());

	public static void main(String[] args) {
		SpringApplication.run(SpringBootMongoDBApplication.class, args);
	}



	@Autowired
	private EmployeeRepository employeeRepository;

	@Autowired
	private DepartmentRepository departmentRepository;

	
	@Bean
	CommandLineRunner runner() {
		return args -> {
			List<Employee> employees = employeeRepository.findAll();
				if (employees.size() == 0) {
					LOGGER.info("******* Inserting Employees to DB *******");
					employeeRepository.saveAll(HelperUtil.empData.get());
				} else {
					LOGGER.info("******* Employees stored in DB Size :: {}", employees.size());
					LOGGER.info("******* Employees stored in DB :: {}", employees);
				}

			List<Department> dept = departmentRepository.findAll();
			if (dept.size() == 0) {
				LOGGER.info("******* Inserting dept to DB *******");
				departmentRepository.saveAll(HelperUtil.deptData.get());
			} else {
				LOGGER.info("******* dept stored in DB Size :: {}", dept.size());
				LOGGER.info("******* dept stored in DB :: {}", dept);
			}
		};
	}

}
