package com.cg.fms.repository;

import java.time.LocalDate;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.cg.fms.entites.Course;
import com.cg.fms.entites.Program;

@Repository
public interface ITrainingProgramRepository extends JpaRepository<Program, Integer>{

//	public Program updateProgram(Program pr);
//	public Program removeProgram(int programid);
//	public Program viewProgram(int programid);
//	public Course addCourse(Course course);
//	public Course removeCourse(int courseid);
//	public Course updateCourse(Course course);
//	public Course viewCourse(int cid);
//	public List<Course> viewAllCourses();
//	public List<Program> viewAllPrograms();
//	public List<Program> viewAllProgramsByDate(LocalDate date);
//	public List<Program> viewAllProgramsByFaculty(int facultyid);
}
