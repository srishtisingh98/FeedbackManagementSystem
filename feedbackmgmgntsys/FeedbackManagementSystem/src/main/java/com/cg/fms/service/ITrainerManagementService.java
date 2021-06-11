package com.cg.fms.service;

import java.util.List;

import com.cg.fms.entites.Employee;

public interface ITrainerManagementService {

	public Employee addTrainer(Employee emp);
	public Employee updateTrainer(Employee emp);
	public Employee removeTrainer(Employee emp);
	public Employee viewTrainer(Employee emp);
	public List <Employee> viewAllTrainers(String skill);
	public List <Employee> viewAllTrainers();
	
}
