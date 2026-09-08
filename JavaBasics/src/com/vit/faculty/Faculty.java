package com.vit.faculty;

public class Faculty {
	int id;
	String name;
	String branch;
	char division;

	public Faculty(int id, String name, String branch, char division) {
		this.id = id;
		this.name = name;
		this.branch = branch;
		this.division = division;
	}

	public void displayInfo() {
		System.out.println("\n=== Faculty Information ===");
		System.out.println("Faculty ID: " + this.id);
		System.out.println("Faculty Name: " + this.name);
		System.out.println("Faculty Branch: " + this.branch);
		System.out.println("Faculty Division: " + this.division);
	}
}
