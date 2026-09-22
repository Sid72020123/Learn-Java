package com.vit.exams;

public class Topic09ClassAndObject {
	public static void main(String[] args) {
		Student student = new Student("Ravi", 101); // Object created from the Student class.
		student.introduce();
	}
}

class Student {
	String name;
	int rollNumber;

	Student(String name, int rollNumber) {
		this.name = name;
		this.rollNumber = rollNumber;
	}

	void introduce() {
		System.out.println(name + ", roll no. " + rollNumber);
	}
}
