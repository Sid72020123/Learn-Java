package com.vit.employee;

public class Employee {
	protected int id;
	protected String name;
	
	public Employee(int id, String name){
		this.id = id;
		this.name = name;
		System.out.println("Employee Class Constructor");
	}
	
	public void display() {
		System.out.println("Employee ID: " + this.id);
		System.out.println("Employee Name: " + this.name);
	}
}
