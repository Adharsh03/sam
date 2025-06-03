package com.dememployee.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.dememployee.entity.Employee;
import com.dememployee.service.EmployeeService;

@RestController
public class EmployeeController {
	@Autowired
	EmployeeService es;
	
	@PostMapping(value="/postAll")
	public String saveAll(@RequestBody List<Employee> e) {
		return es.saveAll(e);
	}
	
	@PutMapping(value="/setObject/{i}")
	public String getUpdate(@PathVariable int i, @RequestBody Employee n) {
		return es.getUpdate(i,n);
	}
	
	@GetMapping(value="/find/{n}")
	public Employee findById(@PathVariable int n) {
		return es.findById(n);
	}
	
	@GetMapping(value="/findAll")
	public List<Employee> getAll(){
		return es.getAll();
	}
}
