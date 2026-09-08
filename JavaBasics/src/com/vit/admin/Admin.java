package com.vit.admin;

public class Admin {
	int id;
	String name;

	public Admin(int id, String name, String branch, char division) {
		this.id = id;
		this.name = name;
	}

	public void displayInfo() {
		System.out.println("\n=== Admin Information ===");
		System.out.println("Admin ID: " + this.id);
		System.out.println("Admin Name: " + this.name);
	}
}
