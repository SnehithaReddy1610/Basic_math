package com.constructor;

import java.util.Scanner;

public class student {
	
	int StudentId;
	String StudentName;
	int Age;
	String Course;


	
	public student(int studentId, String studentName, int age, String course) {
		super();
		StudentId = studentId;
		StudentName = studentName;
		Age = age;
		Course = course;
	}



	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Student ID:");
		int StudentId = sc.nextInt();
		System.out.println("Enter Student Name:");
		String StudentName = sc.next();
		System.out.println("Enter Student Age:");
		int Age = sc.nextInt();
		sc.nextLine();
		System.out.println("Enter the Student Course:");
		String Course = sc.nextLine();
		
		System.out.println("Student Detials");
		System.out.println("------------------");
		System.out.println("Student ID is:"+StudentId);
		System.out.println("Student Name is:"+StudentName);
		System.out.println("Student Age is:"+Age);
		System.out.println("Student Course :"+Course);
		
		
		
		
		sc.close();
	}

}
