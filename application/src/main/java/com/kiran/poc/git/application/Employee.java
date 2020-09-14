package com.kiran.poc.git.application;

public class Employee {
	private Integer empId;
	private String employeeName;
	private String lastName;
	private String empDesignation;
	private String empEmailId;
	private String qualification1;

	
	public Integer getEmpId() {
		return empId;
	}

	public void setEmpId(Integer empId) {
		this.empId = empId;
	}

	public String getEmployeeName() {
		return employeeName;
	}

	public void setEmployeeName(String employeeName) {
		this.employeeName = employeeName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getEmpDesignation() {
		return empDesignation;
	}

	public void setEmpDesignation(String empDesignation) {
		this.empDesignation = empDesignation;
	}

	public String getEmpEmailId() {
		return empEmailId;
	}

	public void setEmpEmailId(String empEmailId) {
		this.empEmailId = empEmailId;
	}

	public String getQualification1() {
		return qualification1;
	}

	public void setQualification(String qualification1) {
		this.qualification1 = qualification1;

	}

	public Employee() {
		// No arg constructor
	}

	@Override
	public String toString() {
		return "Employee [id=" + empId + ", employeeName=" + employeeName + ", lastName=" + lastName + ", empDesignation="
				+ empDesignation + "]";
	}

}
