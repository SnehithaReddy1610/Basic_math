package com.studentResult;

import java.util.Scanner;

public class StudentMain {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter the student Name:");
		String name = sc.nextLine();

		System.out.println("Enter the student Id:");
		int id = sc.nextInt();
		sc.nextLine();

		System.out.println("Enter the course name:");
		String course = sc.nextLine();
	

		System.out.println("Enter the marks:");
		double marks = sc.nextDouble();
		
		
		studentResult st = new studentResult(name, id, course, marks);


		int options;
		do {
			System.out.println("1. Add more subject marks\r\n" + "2. Calculate grade\r\n" + "3. View total marks\r\n"
					+ "4. Exit\r\n");
			options = sc.nextInt();

			switch (options) {
			case 1:
				System.out.println("Adding more Marks");
				st.addMarks(st.getTotalMarks());
				break;
			case 2:
				System.out.println("Calculating your grade ");
				st.calculateGrade();
				break;
			case 3:
				System.out.println("your total marks:");
				st.viewTotalMarks();
				break;
			case 4:
				System.out.println("Thank you ! Result Processing Completed.");
				break;
			default:
				System.out.println("Invalid option");
				break;
			}
		}while(options!=4);

		sc.close();

	}

}
