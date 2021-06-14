package com.cg.fms.utility;

import java.util.ArrayList;
import java.util.List;

import com.cg.fms.dto.FeedbackDetails;
import com.cg.fms.entites.Feedback;

public class FeedbackUtil {

		public List<FeedbackDetails> toDetails(List<Feedback> feedbacks) {
			List<FeedbackDetails> feedDetails = new ArrayList();
			for (Feedback feedback : feedbacks) {
				feedDetails.add(toDetails(feedback));
			}
			return feedDetails;
		}
	}


