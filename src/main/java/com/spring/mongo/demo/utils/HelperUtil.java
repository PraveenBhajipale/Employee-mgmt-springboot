package com.spring.mongo.demo.utils;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Supplier;

import com.spring.mongo.demo.model.Employee;
import com.spring.mongo.demo.model.Department;

public class HelperUtil {

	private HelperUtil() {
	}


	public static Supplier<List<Employee>> empData = () ->
			Arrays.asList(
					new Employee("1234", "Praveen", "praveen.pg@gmail.com", 40000, "1234", "Supervisor"),
					new Employee("1232", "rahul", "rahul@gmail.com", 50000, "1234","Manager"),
					new Employee("3412", "Rocky", "rocky@gmail.com", 23000,"1234", "junior engineer"),
					new Employee("1231", "Kiran", "kiran@gmail.com", 34000,"1234", "senior engineer"),
					new Employee("1312", "Rinky", "rinky@gmail.com", 34200, "1234","consultant")

			);

	public static Supplier<List<Department>> deptData = () ->
			Arrays.asList(
					new Department("1234", "HR", "1234", "Bangalore",  new ArrayList<>()),
					new Department("2342", "Support", "2342", "Pune",  new ArrayList<>())
			);


}