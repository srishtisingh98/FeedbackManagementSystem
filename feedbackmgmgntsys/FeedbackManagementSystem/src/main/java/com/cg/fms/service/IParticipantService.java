package com.cg.fms.service;

import java.util.List;

import com.cg.fms.entites.Course;
import com.cg.fms.entites.Employee;

public interface IParticipantService {

	public Employee enrollParticipant(Employee emp,Course course);
	public List<Employee> viewParticipantList(Course id);

}
