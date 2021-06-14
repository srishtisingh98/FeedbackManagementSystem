package com.cg.fms.dto;

import javax.persistence.CascadeType;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;

import com.cg.fms.entites.Role;

public class EmployeeDetails {

	private int employeeId;
	private String empName;
	private String password;

	// private Role role;
	public EmployeeDetails() {

	}

	public EmployeeDetails(int employeeId, String empName, String password) {

		this.employeeId = employeeId;
		this.empName = empName;
		this.password = password;
	}

	/*
	 * public EmployeeDetails(int employeeId, String empName, String password, Role
	 * role) {
	 * 
	 * this.employeeId = employeeId; this.empName = empName; this.password =
	 * password; this.role = role; }
	 */
	public int getEmployeeId() {
		return employeeId;
	}

	public void setEmployeeId(int employeeId) {
		this.employeeId = employeeId;
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
	/*
	 * public Role getRole() { return role; } public void setRole(Role role) {
	 * this.role = role; }
	 */
	/*
	 * @Override public String toString() { return "EmployeeDetails [employeeId=" +
	 * employeeId + ", empName=" + empName + ", password=" + password + ", role=" +
	 * role + "]"; }
	 */

	@Override
	public String toString() {
		return "EmployeeDetails [employeeId=" + employeeId + ", empName=" + empName + ", password=" + password + "]";
	}

}
