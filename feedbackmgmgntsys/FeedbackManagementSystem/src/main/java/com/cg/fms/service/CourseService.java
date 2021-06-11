package com.cg.fms.service;

import java.util.Optional;

import javax.transaction.Transactional;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cg.fms.entites.Course;
import com.cg.fms.exception.IdNotFoundException;
import com.cg.fms.repository.ICourseRepository;

@Service
@Transactional
public class CourseService implements ICourseService {
	
	private Logger logger = Logger.getLogger(CourseService.class);
	@Autowired
	private ICourseRepository cRepo;

	@Override
	public Course addCourse(Course course) {
		System.out.println(course);
		Course crs = cRepo.save(course);
		logger.info("Course Added: "+ crs);
		return crs;
	}

	@Override
	public Course updateCourse(Course course) {
			Optional<Course> opt = cRepo.findById(course.getCourseId());
			if (!opt.isPresent()) {
				throw new IdNotFoundException("ID NOT FOUND");
			}
			Course rCourse = cRepo.save(course);
			logger.info("Course Updated : " + rCourse);
			return rCourse;
	}

	@Override
	public Course removeCourse(Course course) {
		
		Optional<Course> opt = cRepo.findById(course.getCourseId());
		if (!opt.isPresent()) {
			throw new IdNotFoundException();		//Exception message to be added
		}
		cRepo.deleteById(course.getCourseId());
		logger.info("Logger Deleted : " + opt.get());
		return opt.get();
	}

	@Override
	public Course viewCourse(Course course) {
		
		return cRepo.viewCourse(course);
	}

	@Override
	public Course viewAllCourses(Course course) {
		return cRepo.viewAllCourses(course);
	}
	
	
	
	

}
