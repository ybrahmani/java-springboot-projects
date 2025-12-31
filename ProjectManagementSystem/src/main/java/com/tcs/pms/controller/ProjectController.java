package com.tcs.pms.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.tcs.pms.bean.Project;
import com.tcs.pms.service.ProjectService;

import jakarta.validation.Valid;

@RestController
public class ProjectController {
	
	@Autowired
	private ProjectService ser;
	
	@PostMapping("/savepro")
	public ResponseEntity<String> saveProject(@Valid @RequestBody Project p) {
		ser.saveProject(p);
		return new ResponseEntity<>("Project Saved Successfully",HttpStatus.CREATED);
	}
	
	@GetMapping("/getbyid/{id}")
	public ResponseEntity<Project> getprojectById(@PathVariable String id){
		return new ResponseEntity<>(ser.getProjectById(id),HttpStatus.OK);
	}
	
	@GetMapping("/getbyclientname")
	public ResponseEntity<Project> getProjectByClientName(@RequestParam String name){
		return new ResponseEntity<>(ser.getProjectByClientName(name),HttpStatus.OK);
	}
	
	@GetMapping("/getallprojects")
	public ResponseEntity<List<Project>> getAll(){
		return new ResponseEntity<>(ser.getAll(),HttpStatus.OK);
	}
	

}
