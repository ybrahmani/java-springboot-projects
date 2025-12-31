package com.tcs.springsecurity.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import com.tcs.springsecurity.entity.User;
import com.tcs.springsecurity.repo.UserRepo;

@Service
public class UserService implements UserDetailsService {
	
	@Autowired
	private UserRepo repo;
	
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException{
        User user=repo.findByUsername(username);
        return user;
    }

}
