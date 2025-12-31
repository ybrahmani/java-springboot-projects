package com.tcs.springsecurity.entity;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Entity
@Table
@Data
public class User implements UserDetails{
	
	@Id
	public String username;
	
	@Column
	public String password;
	
	@Column
	public String details;

	@Override
	public Collection<? extends GrantedAuthority> getAuthorities() {
		// TODO Auto-generated method stub
		List<GrantedAuthority> l=new ArrayList<>();
		l.add(new SimpleGrantedAuthority("ADMIN"));
		return l;
	}

}
