package com.tcs.pms.bean;

import java.util.List;


import org.hibernate.validator.constraints.Length;

import com.fasterxml.jackson.annotation.JsonBackReference;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;

import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import jakarta.validation.constraints.Min;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name="project")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Project {
	
	@Id
	@Length(min=5,max=10,message="Provide proper ProjectId")
	private String projectId;
	
	public String getProjectId() {
		return projectId;
	}

	public void setProjectId(String projectId) {
		this.projectId = projectId;
	}

	public String getProjectName() {
		return projectName;
	}

	public void setProjectName(String projectName) {
		this.projectName = projectName;
	}

	public Integer getBillPerHour() {
		return billPerHour;
	}

	public void setBillPerHour(Integer billPerHour) {
		this.billPerHour = billPerHour;
	}

	public String getClientName() {
		return clientName;
	}

	public void setClientName(String clientName) {
		this.clientName = clientName;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public String getCountryCode() {
		return countryCode;
	}

	public void setCountryCode(String countryCode) {
		this.countryCode = countryCode;
	}

	@Column
	@Length(min=5,max=20,message="Provide proper ProjectName")
	private String projectName;
	
	@Column
	@Min(value=1,message="Bill should not be negative")
	private Integer billPerHour;
	
	@Column
	@Length(min=10,max=20,message="Provide proper clientname")
	private String clientName;
	
	@Column
	@Length(min=5,max=20,message="Provide proper country")
	private String country;
	
	@Column
	@Length(min=2,message="Provide proper countryCode")
	private String countryCode;
	

	@OneToMany(mappedBy = "project",cascade = CascadeType.ALL)
	@JsonBackReference
	private List<Employee> Employees;
	

}
