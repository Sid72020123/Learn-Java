package com.vit.basics;

class Employee {
	// static variable is shared across different objects and new memory space is not allocated for this variable per object. Each object uses a shared memory for this variable.
	static String companyName = "Company";
	String name;
	int age;
	double salary;
	
	public void setDetails(String name, int age, double salary) {
		this.name = name;
		this.age = age;
		this.salary = salary;
	}
	
	public void displayDetails() {
		System.out.println("=== *** Employee Details *** ===");
		System.out.println("\t[*] Employee Name: " + this.name);
		System.out.println("\t[*] Employee Age: " + this.age);
		System.out.println("\t[*] Employee Salary: " + this.salary);
		System.out.println("\t[*] Employee Company Name: " + companyName + "\n\n");
	}
}

public class EmployeeDetails {
	public static void main(String[] args) {
		Employee employee_1 = new Employee();
		Employee employee_2 = new Employee();
		Employee employee_3 = new Employee();
		Employee employee_4 = new Employee();
		
		employee_1.setDetails("Person A", 19, 20000);
		employee_2.setDetails("Person B", 20, 30000);
		employee_3.setDetails("Person C", 21, 50000);
		employee_4.setDetails("Person D", 22, 100000);
		
		employee_1.displayDetails();
		employee_2.displayDetails();
		employee_3.displayDetails();
		employee_4.displayDetails();
	}
}
