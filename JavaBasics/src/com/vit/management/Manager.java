package com.vit.management;

import com.vit.employee.PermanentEmployee;

public class Manager extends PermanentEmployee {
	protected String department;

	public Manager(int id, String name, double salary, String department) {
		super(id, name, salary);
		this.department = department;
		System.out.println("Manager Class Constructor");
	}

	public void display() {
		super.display();
		System.out.println("Employee Department: " + this.department);
	}
}
