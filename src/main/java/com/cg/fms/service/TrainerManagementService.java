package com.cg.fms.service;

import java.util.Optional;

import javax.transaction.Transactional;
import javax.validation.Valid;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cg.fms.repository.ITrainerManagementRepository;
import com.cg.fms.entites.Employee;
import com.cg.fms.exception.EmployeeIDNotFoundException;

@Service
@Transactional
public class TrainerManagementService implements ITrainerManagementService {

	@Autowired
	private ITrainerManagementRepository sDao;

	private Logger logger = LoggerFactory.getLogger(TrainerManagementService.class);

	@Override
	public Employee addTrainer(Employee emp) {
		logger.info("*** adding : " + emp);
		Employee e = sDao.save(emp);
		return e;
	}

	@Override
	public Employee getTrainer(int id) {
		logger.info("***Retrieving Student by Id: " + id + "***");
		Optional<Employee> opt = sDao.findById(id);
		if (!opt.isPresent()) {
			throw new EmployeeIDNotFoundException("Student not found for id: " + id);
		}
		Employee emp = opt.get();
		return emp;
	}

	@Override
	public Employee removeTrainer(int id) {
		logger.info("***Deleting Student by Id: " + id + "***");
		Optional<Employee> opt = sDao.findById(id);
		if (!opt.isPresent()) {
			throw new EmployeeIDNotFoundException("Student not found for id: " + id);
		}
		Employee emp = opt.get();
		sDao.delete(emp);
		return emp;
	}

	@Override
	public Employee updateEmployee(@Valid Employee employee) {
		logger.info("*** udating : " + employee);
		Employee emp = sDao.save(employee);
		return emp;
	}

	@Override
	public Employee signIn(Employee employee) {
		return null;
	}


}
