package com.vit.employee;

public class PermanentEmployee extends Employee {
	protected double salary;

	public PermanentEmployee(int id, String name, double salary) {
		super(id, name);
		this.salary = salary;
		System.out.println("PermanentEmployee Class Constructor");
	}

	public void display() {
		super.display();
		System.out.println("Employee Salary: " + this.salary);
	}
}
