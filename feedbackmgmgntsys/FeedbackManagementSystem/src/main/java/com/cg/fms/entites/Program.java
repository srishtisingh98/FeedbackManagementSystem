package com.cg.fms.entites;

import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonFormat;

@Entity
@Table(name = "program")
public class Program {
	@Id
	@GeneratedValue
	@Column(name = "training_id")
	private int trainingId;
	@JsonFormat(pattern = "dd-MMM-yyyy", timezone = "Asia/Calcutta")
	private LocalDate startDate;
	@JsonFormat(pattern = "dd-MMM-yyyy", timezone = "Asia/Calcutta")
	private LocalDate endDate;
	@OneToMany(mappedBy = "courseID")
	private Course course;
	@OneToOne
	private Employee faculty;

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

	@Override
	public String toString() {
		return "Program [trainingId=" + trainingId + ", startDate=" + startDate + ", endDate=" + endDate + ", course="
				+ course + ", faculty=" + faculty + "]";
	}

	public Program(int trainingId, LocalDate startDate, LocalDate endDate) {
		super();
		this.trainingId = trainingId;
		this.startDate = startDate;
		this.endDate = endDate;
	}

	public Program(LocalDate startDate, LocalDate endDate, Course course, Employee faculty) {
		super();
		this.startDate = startDate;
		this.endDate = endDate;
		this.course = course;
		this.faculty = faculty;
	}

	public Program(int trainingId) {
		this.trainingId = trainingId;
	}

}
