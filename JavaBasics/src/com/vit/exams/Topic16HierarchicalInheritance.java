package com.vit.exams;

public class Topic16HierarchicalInheritance {
	public static void main(String[] args) {
		new Circle().draw();
		new Rectangle().draw();
	}
}

class Shape {
	void draw() {
		System.out.println("Drawing a shape");
	}
}

class Circle extends Shape {
}

class Rectangle extends Shape {
}
