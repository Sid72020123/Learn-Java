package com.vit.basics;

class Shape {

    // Method Overloading
    double area(double radius) {
        return 3.14 * radius * radius;
    }

    double area(double length, double breadth) {
        return length * breadth;
    }

    double area(double base, double height, int type) {
        return 0.5 * base * height;
    }

    // Method to be overridden
    void display() {
        System.out.println("Calculating Area of Shape");
    }
}

// Circle subclass
class Circle extends Shape {

    @Override
    void display() {
        System.out.println("Area of Circle: " + area(5.0));
    }
}

// Rectangle subclass
class Rectangle extends Shape {

    @Override
    void display() {
        System.out.println("Area of Rectangle: " + area(4.0, 6.0));
    }
}

// Triangle subclass
class Triangle extends Shape {

    @Override
    void display() {
        System.out.println("Area of Triangle: " + area(4.0, 5.0, 1));
    }
}

// Main class
public class ShapeCalculator {

    public static void main(String[] args) {

        Shape s = new Shape();

        System.out.println("Compile-Time Polymorphism:");

        System.out.println("Circle Area: " + s.area(5.0));
        System.out.println("Rectangle Area: " + s.area(4.0, 6.0));
        System.out.println("Triangle Area: " + s.area(4.0, 5.0, 1));

        System.out.println("\nRuntime Polymorphism:");

        Shape s1 = new Circle();
        Shape s2 = new Rectangle();
        Shape s3 = new Triangle();

        s1.display();
        s2.display();
        s3.display();
    }
}