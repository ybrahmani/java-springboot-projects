package com.tcs.pms.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.tcs.pms.bean.Employee;
@Repository
public interface EmployeeRepo extends JpaRepository<Employee, Integer>{

}
