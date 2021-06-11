package com.cg.fms.controller;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.cg.fms.dto.TrainingProgramDetails;
import com.cg.fms.entites.Program;
import com.cg.fms.request.ProgramRequest;
import com.cg.fms.service.IEmployeeService;
import com.cg.fms.service.ITrainingProgramService;
import com.cg.fms.util.TrainingProgramUtil;

@RequestMapping
@RestController("/program")
@Validated

public class TrainingProgramController {
	@Autowired 
	private ITrainingProgramService tService;
	
	@Autowired
	private TrainingProgramController tUtil;
	
	@Autowired
	private IEmployeeService uServ;
	
	@GetMapping("/hello")
	
	public String greet() {

		return "Hello!! from topic controller";
	}
	
	@ResponseStatus(code = HttpStatus.CREATED)
	@PostMapping("/add")
	public TrainingProgramDetails addProgram(@RequestBody @Valid ProgramRequest programDetails) {
		Program prog = new Program(programDetails.getTrainingId(),programDetails.getStartDate(), programDetails.getEndDate());
			Program prgm = tService.createProgram(prog);
		return TrainingProgramUtil.toProgram(prgm);
}

	
	
	
	

}
