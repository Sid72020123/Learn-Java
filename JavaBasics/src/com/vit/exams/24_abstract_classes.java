package com.vit.exams;

class AbstractClasses {
    public static void main(String[] args) { Figure figure = new Square(4); System.out.println("Area: " + figure.area()); }
}
abstract class Figure {
    abstract double area(); // Abstract method: subclasses must supply behavior.
    void showType() { System.out.println("A geometric figure"); } // Concrete methods are allowed too.
}
class Square extends Figure {
    private final double side;
    Square(double side) { this.side = side; }
    @Override double area() { return side * side; }
}
