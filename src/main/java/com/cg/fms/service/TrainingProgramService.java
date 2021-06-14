package com.cg.fms.service;

import java.time.LocalDate;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cg.fms.entites.Course;
import com.cg.fms.entites.Program;
import com.cg.fms.repository.ITrainingProgramRepository;

@Service
public class TrainingProgramService implements ITrainingProgramService {

	@Autowired
	private ITrainingProgramRepository pRepo;
	
	@Override
	public Program createProgram(Program pr) {
		return pRepo.save(pr);
	}

	@Override
	public Program updateProgram(Program pr) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Program removeProgram(int programid) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Program viewProgram(int programid) {
		// TODO Auto-generated method stub
		return null;
	}

//	@Override
//	public Course addCourse(Course course) {
//		// TODO Auto-generated method stub
//		return null;
//	}
//
//	@Override
//	public Course removeCourse(int courseid) {
//		// TODO Auto-generated method stub
//		return null;
//	}
//
//	@Override
//	public Course updateCourse(Course course) {
//		// TODO Auto-generated method stub
//		return null;
//	}
//
//	@Override
//	public Course viewCourse(int cid) {
//		// TODO Auto-generated method stub
//		return null;
//	}

//	@Override
//	public List<Course> viewAllCourses() {
//		// TODO Auto-generated method stub
//		return null;
//	}

	@Override
	public List<Program> viewAllPrograms() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Program> viewAllProgramsByDate(LocalDate date) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Program> viewAllProgramsByFaculty(int facultyid) {
		// TODO Auto-generated method stub
		return null;
	}

}
