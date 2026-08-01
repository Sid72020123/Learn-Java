package com.vit.basics;

import java.util.Scanner;

class Student {
	private int rollNo;
	private String name;
	private String branch;
	private char division;
	
	public void accept_info(Scanner sc) {
		System.out.print("\t> Enter student roll number: ");
		this.rollNo = sc.nextInt();
		System.out.print("\t> Enter student name: ");
		this.name = sc.next();
		System.out.print("\t> Enter student branch: ");
		this.branch = sc.next();
		System.out.print("\t> Enter student division: ");
		this.division = sc.next().charAt(0);
	}
	
	public void display_info() {
		System.out.printf("| %-10d | %-20s | %-10s | %-10c |\n", this.rollNo, this.name, this.branch, this.division);
	}
}

public class StudentInfo {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter the total number of students: ");
		int total_students = sc.nextInt();
		
		Student[] students = new Student[total_students];
		
		for (int i = 0; i < total_students; i++) {
			students[i] = new Student();
			System.out.println("\n[*] Enter the details of student no. " + (i+1)+":");
			students[i].accept_info(sc);
		}
		
		System.out.println("\n\n=================== *** STUDENT DETAILS *** ===================");
		System.out.printf("| %-10s | %-20s | %-10s | %-10s |\n", "Roll No.", "Name", "Branch", "Division");
		System.out.println("===============================================================");
							
		for(Student student: students) {
			student.display_info();
			System.out.println("---------------------------------------------------------------");
		}
		
		sc.close();
	}

}
