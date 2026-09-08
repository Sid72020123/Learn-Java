package com.vit.student;

public class Student {
	String name;
	int rollNo;
	String branch;
	char division;

	public Student(String name, int rollNo, String branch, char division) {
		this.name = name;
		this.rollNo = rollNo;
		this.branch = branch;
		this.division = division;
	}

	public void displayInfo() {
		System.out.println("\n=== Student Information ===");
		System.out.println("Student Name: " + this.name);
		System.out.println("Student Roll No.: " + this.rollNo);
		System.out.println("Student Branch: " + this.branch);
		System.out.println("Student Division: " + this.division);
	}
}
