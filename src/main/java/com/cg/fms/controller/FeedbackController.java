package com.cg.fms.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;

import com.cg.fms.dto.FeedbackDetails;
import com.cg.fms.entites.Feedback;
import com.cg.fms.entites.Program;
import com.cg.fms.service.IFeedbackService;
import com.cg.fms.utility.FeedbackUtil;

public class FeedbackController {

	@Autowired
	private IFeedbackService fServ;
	
	@Autowired FeedbackUtil fUtil;
	
	@GetMapping("/all")
	public List<FeedbackDetails> viewProgramFeedback(Program program) {
		List<Feedback> feedbacks = fServ.viewProgramFeedback(program);
		return fUtil.toDetails(feedbacks);
	}
}
