package com.cg.fms.entites;

import java.time.LocalDate;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import com.fasterxml.jackson.annotation.JsonFormat;


@Entity
public class Program {
	@Id
	@GeneratedValue
	private int trainingId;
//	@Temporal(TemporalType.DATE)
	@JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd")
	private LocalDate startDate;
//	@Temporal(TemporalType.DATE)
	@JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd")
	private LocalDate endDate;
	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(referencedColumnName = "courseId")
	private List <Course> course;
	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(referencedColumnName = "employeeId")
	private Employee faculty;
	
	public Program() {
	}

	public Program(int trainingId, LocalDate startDate, LocalDate endDate, List <Course> course, Employee faculty) {
		this.trainingId = trainingId;
		this.startDate = startDate;
		this.endDate = endDate;
		this.course = course;
		this.faculty = faculty;
	}

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

	public List <Course> getCourse() {
		return course;
	}

	public void setCourse(List <Course> course) {
		this.course = course;
	}

	public Employee getFaculty() {
		return faculty;
	}

	public void setFaculty(Employee faculty) {
		this.faculty = faculty;
	}
	
	
	
	
}
