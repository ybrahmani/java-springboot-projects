package com.tcs.pms.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.tcs.pms.bean.Project;
@Repository
public interface ProjectRepo extends JpaRepository<Project,String>{

	public Project getByClientName(String clientName);
}
