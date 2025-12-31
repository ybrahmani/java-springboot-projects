package com.tcs.pms.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;

import com.tcs.pms.bean.Project;
import com.tcs.pms.repo.ProjectRepo;

import jakarta.validation.Valid;



@Service
public class ProjectService {
	
	@Autowired
	private ProjectRepo repo;
	
	public void saveProject(@Valid @RequestBody Project p) {
		repo.save(p);
	}
	
	public Project getProjectById(String id) {
		 return repo.findById(id)
				.orElseThrow(()-> new RuntimeException("There is some Runtime Exception"));
	}
	
	public Project getProjectByClientName(String name) {
		return repo.getByClientName(name);
	}
	
	public List<Project> getAll(){
		return repo.findAll();
	}
	

}
