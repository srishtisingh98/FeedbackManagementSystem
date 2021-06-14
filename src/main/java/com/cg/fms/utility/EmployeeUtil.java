package com.cg.fms.utility;

import org.springframework.stereotype.Component;

import com.cg.fms.dto.EmployeeDetails;
import com.cg.fms.entites.Employee;

@Component
public class EmployeeUtil {

	public EmployeeDetails toDetails(Employee emp) {

		EmployeeDetails empDetails = new EmployeeDetails(emp.getEmployeeId(),emp.getEmpName(),emp.getPassword());

return empDetails;
}
}
