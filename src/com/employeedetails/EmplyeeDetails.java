package com.employeedetails;

import java.util.Scanner;

public class EmplyeeDetails {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		
		System.out.println("Enter Employee ID:");
		int EmployeeID = sc.nextInt();
		
		sc.nextLine();
		System.out.println("Enter Employee Name:");
		String EmployeeName = sc.nextLine();
		
		System.out.println("Enter Employee Designation:");
		String EmployeeDesignation = sc.nextLine();
		
		System.out.println("Enter Employee Initial Salary:");
		double salary = sc.nextDouble();
		
		
		Employee emp = new Employee(EmployeeID, EmployeeDesignation, EmployeeDesignation, salary);
		
		sc.nextLine();
		System.out.println("Enter the manager Name:");
		String ManagerName = sc.nextLine();
		
		Manager manager = new Manager(ManagerName);
		
		manager.displayEmployee(emp);
		
		System.out.println("Updated salary:"+emp.getSalary());
		
		
		sc.close();
	}

}
