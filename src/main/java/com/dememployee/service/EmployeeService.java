package com.dememployee.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dememployee.dao.EmployeeDao;
import com.dememployee.entity.Employee;

@Service
public class EmployeeService {
	@Autowired EmployeeDao ed;
	
	public String saveAll(List<Employee> e) {
		return ed.saveAll(e);
	}
	
	public String getUpdate(int i,Employee n) {
		return ed.getUpdate(i,n);
	}
	
	public Employee findById(int n) {
		return ed.findById(n);
	}
	
	public List<Employee> getAll(){
		return ed.getAll();
	}
}
