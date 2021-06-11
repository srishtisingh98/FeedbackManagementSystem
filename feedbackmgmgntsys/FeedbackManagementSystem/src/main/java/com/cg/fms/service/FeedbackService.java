package com.cg.fms.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.stereotype.Service;

import com.cg.fms.entites.Feedback;
import com.cg.fms.entites.Program;


@Service 
@Transactional
public class FeedbackService implements IFeedbackService {

	@Override
	public Feedback addFeedback(Feedback fd) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Feedback updateFeedback(Feedback fd) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Feedback> viewTrainerFeedback(int trainerid) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Feedback> viewProgramFeedback(Program program) {
		// TODO Auto-generated method stub
		return null;
	}

}
