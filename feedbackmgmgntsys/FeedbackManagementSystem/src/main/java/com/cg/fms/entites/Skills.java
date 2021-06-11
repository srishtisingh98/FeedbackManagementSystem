package com.cg.fms.entites;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.validation.constraints.NotBlank;

@Entity
@Table(name = "skills")
public class Skills {

	@OneToOne(mappedBy = "employee_id")
	private Employee employeeId;
	@NotBlank
	private List<String> skill;

	public Employee getEmployeeId() {
		return employeeId;
	}

	public void setEmployeeId(Employee employeeId) {
		this.employeeId = employeeId;
	}

	public List<String> getSkill() {
		return skill;
	}

	public void setSkill(List<String> skill) {
		this.skill = skill;
	}

	public Skills(Employee employeeId, @NotBlank List<String> skill) {
		super();
		this.employeeId = employeeId;
		this.skill = skill;
	}

	@Override
	public String toString() {
		return "Skills [employeeId=" + employeeId + ", skill=" + skill + "]";
	}

}
