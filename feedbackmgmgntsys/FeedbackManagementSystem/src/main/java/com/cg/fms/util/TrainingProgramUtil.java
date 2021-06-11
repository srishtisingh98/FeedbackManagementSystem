package com.cg.fms.util;

import com.cg.fms.dto.TrainingProgramDetails;
import com.cg.fms.entites.Program;

public class TrainingProgramUtil {

	public static TrainingProgramDetails toProgram(Program prgm) {
		return new TrainingProgramDetails(prgm.getTrainingId(), prgm.getStartDate(), prgm.getEndDate());
	}

}
