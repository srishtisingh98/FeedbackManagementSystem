package com.cg.fms.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.cg.fms.entites.Feedback;
import com.cg.fms.entites.Program;

@Repository
public interface IFeedbackRepository extends JpaRepository<Feedback, Integer>{


}
