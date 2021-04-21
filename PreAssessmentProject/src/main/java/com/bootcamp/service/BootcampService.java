package com.bootcamp.service;

import java.util.List;

import org.springframework.http.ResponseEntity;

import com.bootcamp.model.Employee;


public interface BootcampService {
	
	ResponseEntity<List<Employee>> getEmployees();
	
}
