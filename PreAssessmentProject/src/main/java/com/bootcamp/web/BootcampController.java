package com.bootcamp.web;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.bootcamp.model.Employee;
import com.bootcamp.service.BootcampService;


@RestController
public class BootcampController {

	
	private final BootcampService BootcampService;
	
	@Autowired
	public BootcampController(BootcampService BootcampService) {
		this.BootcampService = BootcampService;
	}
	

	/*
	 * @RequestMapping (value = "/employees", method = RequestMethod.GET)
	 * 
	 * @ResponseBody
	 */
	@GetMapping("/employee")
	public ResponseEntity<List<Employee>> getEmployees(){
		
		return BootcampService.getEmployees();
	}
	
	//http://localhost:8080/hello?name=
	@GetMapping("/hello")
	public String hello(@RequestParam(value = "name", defaultValue = "World") String name) {
	return String.format("Hello %s!", name);
	}
	
}
