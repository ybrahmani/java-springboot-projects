package com.tcs.springsecurity.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.tcs.springsecurity.entity.User;

@Repository
public interface UserRepo extends JpaRepository<User, String>{
	
	User findByUsername(String username);

}
