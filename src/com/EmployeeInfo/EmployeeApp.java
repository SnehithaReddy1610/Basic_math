package com.EmployeeInfo;

import java.util.Scanner;

public class EmployeeApp {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		Employee emp = new Employee();
		
		System.out.println("Enter the Employee ID:");
		int employeeId = sc.nextInt();
		emp.setEmployeeId(employeeId);
		sc.nextLine();
		
		System.out.println("Enter the Employee Name:");
		String employeeName = sc.nextLine();
		emp.setEmployeename(employeeName);
		
		System.out.println("Enter the Emplyee Department:");
		String department = sc.nextLine();
		emp.setDepartment(department);
		
		System.out.println("Enter the Employee Salary:");
		double salary = sc.nextDouble();
		emp.setSalary(salary);
		
		System.out.println("Employee Details");
		System.out.println("-------------------");
		
		System.out.println("Employee ID:"+emp.getEmployeeId());
		System.out.println("Employee Name:"+emp.getEmployeename());
		System.out.println("Department:"+emp.getDepartment());
		System.out.println("Salary:"+emp.getSalary());
		
		
		
		
		sc.close();
	}

}
