package com.bootcamp.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.bootcamp.model.Employee;


@Service
public class BootcampServiceImpl implements BootcampService{

	@Autowired
	public BootcampServiceImpl() {

	}

    @Override
	public ResponseEntity<List<Employee>> getEmployees()
	{
		List<Employee> listEmployees = new ArrayList<>();
		listEmployees.add(new Employee(1, "venkat"));
		listEmployees.add(new Employee(2, "rao"));
		return ResponseEntity.status(HttpStatus.OK).body(listEmployees);
	}
    
}
