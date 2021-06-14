package com.cg.fms.dto;

import java.time.LocalDate;

import com.cg.fms.entites.Course;
import com.cg.fms.entites.Employee;

public class ProgramDetails {
	
	private int trainingId;
	private LocalDate startDate;
	private LocalDate endDate;
//	private Course course;
//	private Employee faculty;
	public int getTrainingId() {
		return trainingId;
	}
	public void setTrainingId(int trainingId) {
		this.trainingId = trainingId;
	}
	public LocalDate getStartDate() {
		return startDate;
	}
	public void setStartDate(LocalDate startDate) {
		this.startDate = startDate;
	}
	public LocalDate getEndDate() {
		return endDate;
	}
	public void setEndDate(LocalDate endDate) {
		this.endDate = endDate;
	}
//	public Course getCourse() {
//		return course;
//	}
//	public void setCourse(Course course) {
//		this.course = course;
//	}
//	public Employee getFaculty() {
//		return faculty;
//	}
//	public void setFaculty(Employee faculty) {
//		this.faculty = faculty;
	
	public ProgramDetails(int trainingId, LocalDate startDate, LocalDate endDate) {
		super();
		this.trainingId = trainingId;
		this.startDate = startDate;
		this.endDate = endDate;
//		this.course = course;
//		this.faculty = faculty;
	}
	
	
	
	

}
