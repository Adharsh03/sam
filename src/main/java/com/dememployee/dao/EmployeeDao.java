package com.dememployee.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.dememployee.entity.Employee;
import com.dememployee.repository.EmployeeRepository;

@Repository
public class EmployeeDao {
	@Autowired
	EmployeeRepository er;
	
	public String saveAll(List<Employee> e) {
		er.saveAll(e);
		return "Saved Successfully";
	}
	
	public String getUpdate(int i, Employee n) {
		Employee f = er.findById(i).get();
		
		f.setName(n.getName());
		f.setAge(n.getAge());
		f.setDept(n.getDept());
		f.setSalary(n.getSalary());
		er.save(f);
		return "Updated Successfully";
	}
	
	public Employee findById(int n) {
		Employee e = er.findById(n).get();
		return e;
	}
	
	public List<Employee> getAll(){
		return er.findAll();
	}
}
