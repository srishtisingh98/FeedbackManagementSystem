package com.cg.fms.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.cg.fms.dto.ProgramDetails;
import com.cg.fms.dto.ProgramRequest;
import com.cg.fms.entites.Program;
import com.cg.fms.repository.ITrainerManagementRepository;
import com.cg.fms.service.ICourseService;
import com.cg.fms.service.ITrainerManagementService;
import com.cg.fms.service.ITrainingProgramService;
import com.cg.fms.utility.ProgramUtil;

@RestController
@RequestMapping("/program")
public class ProgramController {

	@Autowired
	private ITrainingProgramService pServ;

	@Autowired
	private ICourseService cServ;

	@Autowired
	private ITrainerManagementService eServ;

	@Autowired
	private ProgramUtil pUtil;

	@PostMapping("/add")
	@ResponseStatus(code = HttpStatus.CREATED)
	public ProgramDetails createProgram(@RequestBody Program program) {
		Program prog = pServ.createProgram(program);
		return pUtil.toProgram(prog);
	}

	@PostMapping("/update")
	public ProgramDetails updateProgram(@RequestBody Program program) {
		Program prog = new Program(program.getTrainingId(), program.getStartDate(), program.getEndDate(),
				cServ.findById(program.getCourse().getCourseId()), eServ.findById(program.getFaculty().getEmployeeId));
		Program pro = pServ.updateProgram(prog);
		return pUtil.toProgram(pro);
	}

	@ResponseStatus(code = HttpStatus.OK)
	@DeleteMapping("/delete/{trainingId}")
	public boolean removeProgram(@PathVariable("trainingId") int id) {
		Program rProg = pServ.removeProgram(id);
		if (rProg.getTrainingId() == id) {
			return true;
		}
		return false;
	}
	
	
	@ResponseStatus(code = HttpStatus.OK)
	@GetMapping("/all")
	public List<ProgramDetails> viewAllPrograms() {
		List<ProgramDetails> list = pServ.viewAllPrograms();
		List<ProgramDetails> detailList = pUtil.toProgramDetailsList(list);
		return detailList;
}
}
