package com.constructor;

public class EmployeeProcessor {
	

	public static void main(String[] args) {

		Employee e = new Employee(10, "Rahul", "sd", 50000, 5);
		System.out.println("Before Promotion");
		System.out.println("Employee ID:"+e.getEmpId());
		System.out.println("Employee Name:"+e.getName());
		System.out.println("Employee Designation:"+e.getDesignation());
		System.out.println("Salary:$"+e.getSalary());
		System.out.println("Performance Rating:"+e.getPerformanceRating());
		e.promoteEmployee("senior");
		
	}

}
