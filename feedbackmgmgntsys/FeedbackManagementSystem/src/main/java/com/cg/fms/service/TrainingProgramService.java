package com.cg.fms.service;

import java.time.LocalDate;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

import javax.transaction.Transactional;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.cg.fms.entites.Course;
import com.cg.fms.entites.Program;
import com.cg.fms.exception.IdNotFoundException;
import com.cg.fms.repository.ITrainingProgramRepository;

@Service("pService")
@Transactional
public class TrainingProgramService implements ITrainingProgramService {

	private Logger logger = Logger.getLogger(TrainingProgramService.class);

	@Autowired
	private ITrainingProgramRepository pRepo;

//	@Autowired
//	private ICourseRepository cRepo;

	@Override
	public Program createProgram(Program pr) {
		Optional<Program> progOpt = pRepo.findById(pr.getTrainingId());
		Program returnPrgm = pRepo.save(pr);
		logger.info("Post Created : " + returnPrgm);
		return returnPrgm;
	}

	@Override
	public Program updateProgram(Program pr) {
		Optional<Program> opt = pRepo.findById(pr.getTrainingId());
		if (!opt.isPresent()) {
			throw new IdNotFoundException("ID NOT FOUND");
		}
		Program uPrgm = opt.get();
		uPrgm.setCourse(pr.getCourse());
		uPrgm.setEndDate(pr.getEndDate());
		uPrgm.setStartDate(pr.getStartDate());
		Program updatedPrgm = pRepo.save(uPrgm);
		Optional<Program> prgmOpt = pRepo.findById(pr.getTrainingId());
		pRepo.save(prgmOpt.get());
		logger.info("Program Updated : " + updatedPrgm);
		return updatedPrgm;
	}

	@Override
	public Program removeProgram(int programid) {
		Optional<Program> opt = pRepo.findById(programid);
		if (!opt.isPresent()) {
			throw new IdNotFoundException(); // Exception message to be added
		}
		pRepo.deleteById(programid);
		logger.info("Logger Deleted : " + opt.get());
		return opt.get();
	}

	@Override
	public Program viewProgram(int programid) {
		return viewProgram(programid);
	}

//	@Override
//	public Course addCourse(Course course) {
//		System.out.println(course);
//		Course crs = cRepo.save(course);
//		logger.info("Course Added: " + crs);
//		return crs;
//	}
//
//	@Override
//	public Course removeCourse(int courseid) {
//		Optional<Course> opt = cRepo.findById(courseid);
//		if (!opt.isPresent()) {
//			throw new IdNotFoundException(); // Exception message to be added
//		}
//		cRepo.deleteById(courseid);
//		logger.info("Logger Deleted : " + opt.get());
//		return opt.get();
//
//	}

//	@Override
//	public Course updateCourse(Course course) {
//		Optional<Course> opt = cRepo.findById(course.getCourseId());
//		if (!opt.isPresent()) {
//			throw new IdNotFoundException("ID NOT FOUND");
//		}
//		Course uCourse = opt.get();
//		uCourse.setCourseDescription(course.getCourseDescription());
//		uCourse.setCourseName(course.getCourseName());
//		uCourse.setNoOfDays(course.getNoOfDays());
//		Course updatedCourse = cRepo.save(uCourse);
//		Optional<Course> crsOpt = cRepo.findById(course.getCourseId());
//		cRepo.save(crsOpt.get());
//		logger.info("Course Updated : " + updatedCourse);
//		return updatedCourse;
//	}
//
//	@Override
//	public Course viewCourse(int cid) {
//		return viewCourse(cid);
//	}
//
//	@Override
//	public List<Course> viewAllCourses() {
//		List<Course> crs = cRepo.findAll();
//		return crs;
//	}

	@Override
	public List<Program> viewAllPrograms() {
		List<Program> prgm = pRepo.findAll();
		return prgm;
	}

	@Override
	public List<Program> viewAllProgramsByDate(LocalDate startDate) {
		List<Program> prgm = pRepo.findAll();
		logger.info("Finding programs by Start Date");
		return prgm.
		stream().
		filter(sdate -> sdate.getStartDate().equals(startDate)).
		collect(Collectors.toList());

	}

	@Override
	public List<Program> viewAllProgramsByFaculty(int facultyid) {
		List<Program> prgm = pRepo.findAll();
		logger.info("getting Programs by faculty");
		return prgm.
		stream().
		filter(faculty -> faculty.getFaculty().equals(faculty)).
		collect(Collectors.toList());

	}

	@Override
	public Course addCourse(Course course) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Course removeCourse(int courseid) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Course updateCourse(Course course) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Course viewCourse(int cid) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Course> viewAllCourses() {
		// TODO Auto-generated method stub
		return null;
	}

}
