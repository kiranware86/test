package com.kiran.poc.git.application;

public class Employee {
	private Integer id;
	private String employeeName;
	private String lastName;
	private String empDesignation;
	private String empEmailId;
	private String qualification;

	public Employee() {
		// No arg constructor
	}

	@Override
	public String toString() {
		return "Employee [id=" + id + ", employeeName=" + employeeName + ", lastName=" + lastName + ", empDesignation="
				+ empDesignation + "]";
	}

}
