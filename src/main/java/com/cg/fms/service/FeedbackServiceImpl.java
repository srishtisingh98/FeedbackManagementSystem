package com.cg.fms.service;

import java.util.List;
import java.util.Optional;

import org.apache.log4j.Logger;
import org.apache.log4j.spi.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;

import com.cg.fms.dto.FeedbackDetails;
import com.cg.fms.entites.Feedback;
import com.cg.fms.entites.Program;
import com.cg.fms.repository.IFeedbackRepository;
import com.cg.fms.utility.FeedbackUtil;

public class FeedbackServiceImpl implements IFeedbackService {

	@Autowired
	private IFeedbackRepository fRepo;
	

	private Logger logger = LoggerFactory.getLogger(FeedbackServiceImpl.class);
	
	
	
	@Override
	public Feedback addFeedback(Feedback fd) {

		return null;
	}

	@Override
	public Feedback updateFeedback(Feedback fd) {

		return null;
	}

	@Override
	public List<Feedback> viewTrainerFeedback(int trainerid) {
		logger.info(fRepo.findById(trainerid));
		return fRepo.viewTrainerFeedback(trainerid);
	}
	
	

	@Override
	public List<Feedback> viewProgramFeedback(Program program) {
		logger.info(fRepo.viewProgramFeedback().toString());
		return fRepo.viewProgramFeedback(program);
	}

	
}
