package com.cg.fms.repository;

import java.time.LocalDate;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.cg.fms.entites.Course;
import com.cg.fms.entites.Program;


@Repository
public interface ITrainingProgramRepository extends JpaRepository<Program, Integer>{

}
