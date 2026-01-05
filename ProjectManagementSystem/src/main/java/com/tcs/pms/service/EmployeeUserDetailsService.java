package com.tcs.pms.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import com.tcs.pms.bean.Employee;
import com.tcs.pms.repo.EmployeeRepo;

@Service
public class EmployeeUserDetailsService implements UserDetailsService{

   @Autowired
    private EmployeeRepo repo;

    @Override
    public UserDetails loadUserByUsername(String username)
            throws UsernameNotFoundException {

        Employee emp = repo.findByUsername(username);

        if (emp == null) {
            throw new UsernameNotFoundException("Employee not found");
        }

        return new org.springframework.security.core.userdetails.User(
                emp.getUsername(),
                emp.getPassword(),
                List.of(new SimpleGrantedAuthority("ROLE_EMPLOYEE"))
        );
    }
}


