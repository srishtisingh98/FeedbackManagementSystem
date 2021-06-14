package com.cg.fms.utility;

import java.util.List;

import org.springframework.stereotype.Component;

import com.cg.fms.dto.ProgramDetails;
import com.cg.fms.entites.Program;

@Component
public class ProgramUtil {

	public ProgramDetails toProgram(Program prog) {

		ProgramDetails pDto = new ProgramDetails(prog.getTrainingId(), prog.getStartDate(), prog.getEndDate(),
				prog.getCourse(), prog.getFaculty());
		return pDto;

	}

	public List<ProgramDetails> toProgramDetailsList(Program prog) {
	ProgramDetails pViewAll = new ProgramDetails(prog.getTrainingId(), prog.getStartDate(), prog.getEndDate(),
				prog.getCourse(), prog.getFaculty());
		return detailList;
	}

}
