package com.spring.mongo.demo.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;

//import javax.persistence.JoinColumn;
//import javax.persistence.ManyToOne;
import java.io.Serializable;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Employee implements Serializable {

	@Id
	private String id;
	private  String name;
	private String email;
	private String position;
	private String deptId;
	private float salary;

	public String getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPosition() {
		return position;
	}

	public void setPosition(String position) {
		this.position = position;
	}
	public float getSalary() {
		return salary;
	}
	public void setId(String id) {
		this.id = id;
	}
	public void setSalary(float salary) {
		this.salary = salary;
	}
	public String getDeptId() {
		return deptId;
	}
	public void setDeptId(String deptId) {
		this.deptId = deptId;
	}
	public Employee(String id, String name, String email, float salary, String deptId, String position) {
		this.id = id;
		this.deptId = deptId;
		this.name = name;
		this.email = email;
		this.salary = salary;
		this.position = position;
	}
}
