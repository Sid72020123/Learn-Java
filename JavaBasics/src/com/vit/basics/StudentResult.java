package com.vit.basics;

import java.util.Scanner;

class StudentRecord {
	private int rollNo;
	private String name;
	private int marks;
	private char grade;

	public int getRollNo() {
		return rollNo;
	}

	public void setRollNo(int rollNo) {
		this.rollNo = rollNo;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getMarks() {
		return marks;
	}

	public void setMarks(int marks) {
		this.marks = marks;
		calculateGrade();
	}

	public char getGrade() {
		return grade;
	}
	// grade variable setter not required...
	// public void setGrade(char grade) {
	// this.grade = grade;
	// }

	private void calculateGrade() {
		if (marks >= 90)
			grade = 'A';
		else if (marks >= 75)
			grade = 'B';
		else if (marks >= 60)
			grade = 'C';
		else if (marks >= 50)
			grade = 'D';
		else if (marks >= 45)
			grade = 'P';
		else
			grade = 'F';
	}

}

public class StudentResult {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		StudentRecord s = new StudentRecord();

		System.out.println("=== Enter Student Record === \n");
		
		System.out.print("Enter the roll no. of student: ");
		s.setRollNo(sc.nextInt());
		System.out.print("Enter the name of student: ");
		s.setName(sc.next());
		System.out.print("Enter the marks of student: ");
		s.setMarks(sc.nextInt());
		
		System.out.println("\n\n=== Final Student Record === \n");
		System.out.println("Student Roll No.: " + s.getRollNo());
		System.out.println("Student Name: " + s.getName());
		System.out.println("Student Marks: " + s.getMarks());
		System.out.println("Student Grade: " + s.getGrade());
		
		sc.close();
	}

}
