package com.cg.fms.repository;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.cg.fms.entites.Feedback;

@Repository
public interface IFeedbackRepository extends JpaRepository<Feedback, Integer> {


}
