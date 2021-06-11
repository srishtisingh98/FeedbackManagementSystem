package com.cg.fms.entites;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Pattern;

@Entity
@Table(name = "Employee")
public class Employee {

	@Id
	@GeneratedValue
	@Column(name = "employee_id")
	private int employeeId;
	@NotBlank
	private String empName;
	@NotBlank
	@Pattern(regexp = "^(?=.*[0-9])(?=.*[a-z])(?=.*[A-Z])(?=.*[@#%&*$])(?=\\S+$).{8,16}$", message = "password must be 8 to 16 characters long and consist of at least :"
			+ " one digit, one lowercase alphabet, one Uppercase alphabet and one special character in the bracket with No white space allowed.")
	private String password;
	@Enumerated(EnumType.STRING)
	private Role role;

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

	public Employee(int employeeId) {
		super();
		this.employeeId = employeeId;
	}

	public Employee(
			@NotBlank @Pattern(regexp = "^(?=.*[0-9])(?=.*[a-z])(?=.*[A-Z])(?=.*[@#%&*$])(?=\\S+$).{8,16}$", message = "password must be 8 to 16 characters long and consist of at least : one digit, one lowercase alphabet, one Uppercase alphabet and one special character in the bracket with No white space allowed.") String empName,
			String password, Role role) {
		super();
		this.empName = empName;
		this.password = password;
		this.role = role;
	}

	@Override
	public String toString() {
		return "Employee [employeeId=" + employeeId + ", empName=" + empName + ", password=" + password + ", role="
				+ role + "]";
	}

}
