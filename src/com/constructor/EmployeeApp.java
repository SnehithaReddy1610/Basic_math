package com.constructor;

import java.util.Scanner;

public class EmployeeApp {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter the Employee ID:");
		int EmployeeID = sc.nextInt();
		sc.nextLine();
		System.out.println("Enter the Employee Name:");
		String EmployeeName = sc.nextLine();
		System.out.println("Enter the Employee Salary:");
		double basic_salary = sc.nextDouble();

		double HRA = basic_salary * 0.20;
		double DA = basic_salary * 0.10;
		double Gross_salary = basic_salary + HRA + DA;

		System.out.println("Employee Details");
		System.out.println("---------------------");
		System.out.println("Employye Id is:" + EmployeeID);
		System.out.println("Employee Name is:" + EmployeeName);
		System.out.println("Employee Basic salary is:" + basic_salary);
		System.out.println("Employee Gross Salary is:" + Gross_salary);

		sc.close();

	}

}
