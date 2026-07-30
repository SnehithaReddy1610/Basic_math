package com.studentResult;

public class studentResult {

	String studentname;
	int studentId;
	String courseName;
	double totalMarks;

	public studentResult(String studentname, int studentId, String courseName, double totalMarks) {

		this.studentname = studentname;
		this.studentId = studentId;
		this.courseName = courseName;
		this.totalMarks = totalMarks;
		System.out.println("Student Record Created Successfully");

	}

	public String getStudentname() {
		return studentname;
	}

	public int getStudentId() {
		return studentId;
	}

	public String getCourseName() {
		return courseName;
	}

	public double getTotalMarks() {
		return totalMarks;
	}

	public void setStudentname(String studentname) {
		this.studentname = studentname;
	}

	public void setStudentId(int studentId) {
		this.studentId = studentId;
	}

	public void setCourseName(String courseName) {
		this.courseName = courseName;
	}

	public void setTotalMarks(double totalMarks) {
		this.totalMarks = totalMarks;
	}

	public void addMarks(double marks) {
		if (marks > 0) {
			setTotalMarks(getTotalMarks() + marks);
			System.out.println("Marks updated"+getTotalMarks());
		} else {
			System.out.println("Invalid Marks");
		}

	}
	public void calculateGrade() {
		
		if(totalMarks <= 0) {
			System.out.println("No marks available to calculate");
			System.out.println("Total Marks:"+getTotalMarks());

			return;
		}
		
		double total = getTotalMarks();
		if(total >= 90) {
			System.out.println("Student Grade is 'A' ");
		}else if(total >=80 && total <=89) {
			System.out.println("Student Grade is 'B and ");
		}else if(total >= 70 && total <= 79) {
			System.out.println("Student Grade is 'C");
		}else if(total >= 60 && total <= 69) {
			System.out.println("Student Grade is 'D'");
		}else if(total < 60) {
			System.out.println("Fail");
		}else {
			System.out.println("Invalid Marks");
		}
		
	}

	public void viewTotalMarks() {
		System.out.println("Total Marks:"+getTotalMarks());
	}
}
