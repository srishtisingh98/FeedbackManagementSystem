package com.cg.fms.dto;

import java.time.LocalDate;

import com.cg.fms.entites.Course;
import com.cg.fms.entites.Employee;

public class ProgramRequest {

	private LocalDate startDate;
	private LocalDate endDate;
	private Course course;
	private Employee faculty;

	public ProgramRequest(LocalDate startDate, LocalDate endDate, Course course, Employee faculty) {
		this.startDate = startDate;
		this.endDate = endDate;
		this.course = course;
		this.faculty = faculty;
	}

	public ProgramRequest() {
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

	public Course getCourse() {
		return course;
	}

	public void setCourse(Course course) {
		this.course = course;
	}

	public Employee getFaculty() {
		return faculty;
	}

	public void setFaculty(Employee faculty) {
		this.faculty = faculty;
	}

}
