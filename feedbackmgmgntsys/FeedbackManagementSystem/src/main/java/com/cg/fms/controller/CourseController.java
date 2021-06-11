package com.cg.fms.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cg.fms.entites.Course;
import com.cg.fms.service.ICourseService;

import java.util.*;

@RestController
@RequestMapping("/course")
public class CourseController {

	@Autowired
	private ICourseService cRepo;

	@PostMapping("/add")
	public Course addCourse(Course course) {
		
		return cRepo.addCourse(course);
	}

	@PutMapping("/update")
	public Course updateCourse(Course course) {
		return cRepo.updateCourse(course);
	}

	@DeleteMapping("/delete")
	public Course removeCourse(Course course) {
		return cRepo.removeCourse(course);
	}

	@GetMapping("/viewAll")
	public Course viewAllCourses(Course course) {
		return cRepo.viewAllCourses(course);
	}

	@GetMapping("/viewCourse")
	public Course viewCourse(Course course) {
		return cRepo.viewCourse(course);
	}
}
