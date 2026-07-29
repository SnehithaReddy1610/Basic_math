package com.employeedetails;

public class Employee {
	private int EmployeeID;
	private String EmployeeName;
	private String EmployeeDesignation;
	private double salary;
	
	public Employee(int employeeID, String employeeName, String employeeDesignation, double salary) {
		
		EmployeeID = employeeID;
		EmployeeName = employeeName;
		EmployeeDesignation = employeeDesignation;
		this.salary = salary;
		System.out.println("Account created successfully");
	}

	
	public int getEmployeeID() {
		return EmployeeID;
	}

	public String getEmployeeName() {
		return EmployeeName;
	}

	public String getEmployeeDesignation() {
		return EmployeeDesignation;
	}

	public double getSalary() {
		return salary;
	}
	
	
	

	public void setEmployeeID(int employeeID) {
		EmployeeID = employeeID;
	}

	public void setEmployeeName(String employeeName) {
		EmployeeName = employeeName;
	}

	public void setEmployeeDesignation(String employeeDesignation) {
		EmployeeDesignation = employeeDesignation;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}
	
	

}
