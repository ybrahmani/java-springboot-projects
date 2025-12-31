package com.tcs.pms.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;

import com.tcs.pms.bean.Employee;
import com.tcs.pms.repo.EmployeeRepo;

import jakarta.validation.Valid;

@Service
public class EmployeeService {
	
	@Autowired
	private EmployeeRepo repo;
	
	public void saveEmp(@Valid @RequestBody Employee e) {
		repo.save(e);
	}
	
	public Employee getByEmpno(Integer id) {
		return repo.findById(id)
				.orElseThrow(()-> new RuntimeException("Invalid employee number"));
	}
	
	public List<Employee> getAll(){
		return repo.findAll();
	}
	

}
