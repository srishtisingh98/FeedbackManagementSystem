package com.cg.fms.exception;

import org.springframework.data.jpa.repository.JpaRepository;

import com.cg.fms.entites.Course;

public interface ICourseRepository extends JpaRepository<Course, Integer> {

}
