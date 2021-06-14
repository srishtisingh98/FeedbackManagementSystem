package com.cg.fms.dto;

import javax.persistence.CascadeType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;

import com.cg.fms.entites.Role;

public class EmployeeRequest {
	private String empName;
	private String password;
	private Role role;
	
	public EmployeeRequest() {


	}

	public EmployeeRequest(String empName, String password, Role role) {
		super();
		this.empName = empName;
		this.password = password;
		this.role = role;
	}

	public String getEmpName() {
		return empName;
	}

	public void setEmpName(String empName) {
		this.empName = empName;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public Role getRole() {
		return role;
	}

	public void setRole(Role role) {
		this.role = role;
	}

	@Override
	public String toString() {
		return "EmployeeRequest [empName=" + empName + ", password=" + password + ", role=" + role + "]";
	}
	

}
