package com.vit.exams;

public class Topic19SuperKeyword {
	public static void main(String[] args) {
		new Manager("Aman", "Sales").showDetails();
	}
}

class Person {
	protected String name;

	Person(String name) {
		this.name = name;
	}

	void showDetails() {
		System.out.println("Name: " + name);
	}
}

class Manager extends Person {
	private final String department;

	Manager(String name, String department) {
		super(name);
		this.department = department;
	} // Calls parent constructor.

	@Override
	void showDetails() {
		super.showDetails();
		System.out.println("Department: " + department);
	} // Calls parent method.
}
