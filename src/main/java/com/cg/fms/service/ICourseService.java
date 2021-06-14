package com.cg.fms.service;

import com.cg.fms.entites.Course;

public interface ICourseService {

	
	public Course addCourse(Course course);

	public Course updateCourse(Course course);

	public Course removeCourse(Course course);

	public Course viewCourse(Course course);

	public Course viewAllCourses(Course course);
}
