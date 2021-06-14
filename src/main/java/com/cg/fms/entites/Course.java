package com.cg.fms.entites;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotBlank;

@Entity
@Table (name ="Course")
public class Course {

	@Id
	@GeneratedValue
	private int courseId;
	@NotBlank
	@Column(name= "Course_Name")
	private String courseName;
	@Column(name="Course_Description")
	private String courseDescription;
	@NotBlank
	private int noOfDays;
	
	public Course() {
	}

	public Course(int courseId, String courseName, String courseDescription, int noOfDays) {
		this.courseId = courseId;
		this.courseName = courseName;
		this.courseDescription = courseDescription;
		this.noOfDays = noOfDays;
	}

	public int getCourseId() {
		return courseId;
	}

	public void setCourseId(int courseId) {
		this.courseId = courseId;
	}

	public String getCourseName() {
		return courseName;
	}

	public void setCourseName(String courseName) {
		this.courseName = courseName;
	}

	public String getCourseDescription() {
		return courseDescription;
	}

	public void setCourseDescription(String courseDescription) {
		this.courseDescription = courseDescription;
	}

	public int getNoOfDays() {
		return noOfDays;
	}

	public void setNoOfDays(int noOfDays) {
		this.noOfDays = noOfDays;
	}

	@Override
	public String toString() {
		return "Course [courseId=" + courseId + ", courseName=" + courseName + ", courseDescription="
				+ courseDescription + ", noOfDays=" + noOfDays + "]";
	}
	
	
	
}
