package com.dememployee.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.dememployee.entity.Employee;

public interface EmployeeRepository extends JpaRepository<Employee, Integer> {

}
