package com.vit.basics;

class University {
	String universityName;
	
	public University(String name) {
		this.universityName = name;
	}
	
	void displayUniversityDetails() {
		System.out.println("\n=== [University Details] ===\n\tUniversity Name: " + this.universityName);
	}
	
	final void displayUniversityRules() {
		System.out.println("\n=== [University Rules] ===\n\t1. Wear ID card in campus.\n\t2. Maintain 75% attendance.\n\t3. Respect faculty & non-faculty staff.");
	}
}

class Student1 extends University {
	String studentName;
	int rollNo;
	String branch;
	char division;
	
	public Student1(String universityName, String studentName, int rollNo, String branch, char division) {
		super(universityName);
		this.studentName = studentName;
		this.rollNo = rollNo;
		this.branch = branch;
		this.division = division;
	}
	
	void displayStudentDetails() {
		super.displayUniversityDetails();
		System.out.println("\n=== [Student Details] ===");
		System.out.println("\tStudent Name: " + this.studentName);
		System.out.println("\tStudent Roll No.: " + this.rollNo);
		System.out.println("\tStudent Branch: " + this.branch);
		System.out.println("\tStudent Division: " + this.division);
		super.displayUniversityRules();
	}
}

public class UniversitySystem {
	public static void main(String[] args) {
		Student1 s = new Student1("SPPU", "Student A", 1, "Computer Science", 'A');
		Student1 s2 = new Student1("SPPU", "Student B", 1, "Electrical", 'A');
		
		s.displayStudentDetails();
		s2.displayStudentDetails();
	}
}
