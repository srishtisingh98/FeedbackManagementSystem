package com.cg.fms.entites;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.Size;

@Entity
@Table(name = "Course")
public class Course {
	@Id
	@GeneratedValue
	@Column(name = "course_id")
	private int courseId;
	@Size(min = 5, max = 20, message = "Course name should be between 5 to 20 characters long")
	private String courseName;
	@Size(min = 5, max = 20, message = "Course description should be between 5 to 40 characters long")
	private String courseDescription;
	private int noOfDays;

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

	public int getCourseId() {
		return courseId;
	}

	public void setCourseId(int courseId) {
		this.courseId = courseId;
	}

	public Course(int courseId) {
		super();
		this.courseId = courseId;
	}

	public Course(
			@Size(min = 5, max = 20, message = "Course name should be between 5 to 20 characters long") String courseName,
			@Size(min = 5, max = 20, message = "Course description should be between 5 to 40 characters long") String courseDescription,
			int noOfDays) {
		super();
		this.courseName = courseName;
		this.courseDescription = courseDescription;
		this.noOfDays = noOfDays;
	}

	@Override
	public String toString() {
		return "Course [courseId=" + courseId + ", courseName=" + courseName + ", courseDescription="
				+ courseDescription + ", noOfDays=" + noOfDays + "]";
	}

}
