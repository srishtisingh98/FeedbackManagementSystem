package com.cg.fms.service;

import java.util.List;

import com.cg.fms.entites.Feedback;
import com.cg.fms.entites.Program;

public interface IFeedbackService {

public Feedback addFeedback(Feedback fd);
public Feedback updateFeedback(Feedback fd);

public List<Feedback> viewTrainerFeedback(int trainerid);
public List<Feedback> viewProgramFeedback(Program program);

}
