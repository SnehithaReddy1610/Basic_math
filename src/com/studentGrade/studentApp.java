package com.studentGrade;

import java.util.Scanner;

public class studentApp {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Student s = new Student();
		
		
		
		System.out.println("Enter the Student ID:");
		int studentId = sc.nextInt();
		s.setStudentId(studentId);
		sc.nextLine();
		
		System.out.println("Enter the Student Name:");
		String studentName = sc.nextLine();
		s.setStudentName(studentName);
		
		System.out.println("Enter the Course of student:");
		String course = sc.nextLine();
		s.setCourse(course);
		
		System.out.println("Enter the student percentage:");
		double percentage = sc.nextDouble();
		s.setPercentage(percentage);
		
		
		System.out.println("Student Details");
		System.out.println("-----------------");
		
		System.out.println("Student ID is:"+s.getStudentId());
		System.out.println("Student Name is:"+s.getStudentName());
		System.out.println("Student Course :"+s.getCourse());
		System.out.println("Student marks percentage is:"+s.getPercentage());
		
		
		
		
		sc.close();
	}

}
