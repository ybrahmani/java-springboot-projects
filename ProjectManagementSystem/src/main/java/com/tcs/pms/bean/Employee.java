package com.tcs.pms.bean;

import org.hibernate.validator.constraints.Length;

import com.fasterxml.jackson.annotation.JsonManagedReference;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import jakarta.validation.constraints.Min;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name="employee")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Employee {
	
	public Integer getEmpNo() {
		return empNo;
	}

	public void setEmpNo(Integer empNo) {
		this.empNo = empNo;
	}

	public String geteName() {
		return eName;
	}

	public void seteName(String eName) {
		this.eName = eName;
	}

	public Integer getSal() {
		return sal;
	}

	public void setSal(Integer sal) {
		this.sal = sal;
	}

	public String getDetails() {
		return details;
	}

	public void setDetails(String details) {
		this.details = details;
	}

	@Id
	@Min(value=1,message="provide proper employee number")
	private Integer empNo;
	
	@Column
	@Length(min=5,max=10,message="Provide proper employee name")
	private String eName;
	
	@Column
	@Min(value=10000,message="Salary should be greater than 10000")
	private Integer sal;
	
	@Column
	@Length(min=5,message="Provide proper details of employee")
	private String details;

	@Column
	private String username;

	@Column
	private String password;
	
	@ManyToOne
	@JoinColumn(name="project_id")
	@JsonManagedReference
	private Project project;

	

}
