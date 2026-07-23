package com.constructor;

public class Employee {
	int empId;
	String name;
	String designation;
	double salary;
	int performanceRating;
	
	public Employee(int empId,String name,String designation,double salary,int performanceRating) {
		this.empId = empId;
		this.name = name;
		this.designation = designation;
		this.salary = salary;
		this.performanceRating = performanceRating;
	}
	
	public void setDesignation(String designation) {
		this.designation = designation;
	}


	public void setSalary(double salary) {
		this.salary = salary;
	}



	public int getEmpId() {
		return empId;
	}

	public String getName() {
		return name;
	}

	public String getDesignation() {
		return designation;
	}

	public double getSalary() {
		return salary;
	}

	public int getPerformanceRating() {
		return performanceRating;
	}

	
	public void promoteEmployee(String designation) {
		if(performanceRating >= 4) {
			salary *= 1.20; 
			this.designation = designation;
			
		System.out.println("After Promotion");
		System.out.println("Designation:"+designation);
		System.out.println("Developer Updated");
		System.out.println("New Salary:$"+salary);
		}
		else {
			System.out.println("Designation and salary remain Unchanged");
		}
	}
}
