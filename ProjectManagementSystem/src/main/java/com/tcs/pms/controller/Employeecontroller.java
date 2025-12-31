package com.tcs.pms.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.tcs.pms.bean.Employee;
import com.tcs.pms.service.EmployeeService;

import jakarta.validation.Valid;

@RestController
public class Employeecontroller {
	
	@Autowired
	private EmployeeService ser;
	
	@PostMapping("/saveemp")
	public ResponseEntity<String> saveEmployee(@Valid @RequestBody Employee e){
		ser.saveEmp(e);
		return new ResponseEntity<>("Employee saved successfully",HttpStatus.OK);
	}
	
	@GetMapping("/getbyempnno/{id}")
	public ResponseEntity<Employee> getByEmpno(Integer id){
		return new ResponseEntity<Employee>(ser.getByEmpno(id),HttpStatus.OK);
	}
	
	@GetMapping("/getall")
	public ResponseEntity<List<Employee>> getAll(){
		return new ResponseEntity<List<Employee>>(ser.getAll(),HttpStatus.OK);
	}

}
