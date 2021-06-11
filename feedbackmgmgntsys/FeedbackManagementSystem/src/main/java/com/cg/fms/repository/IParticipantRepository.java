package com.cg.fms.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.cg.fms.entites.Course;
import com.cg.fms.entites.Employee;

@Repository
public interface IParticipantRepository extends JpaRepository<Employee, Integer> {

}
