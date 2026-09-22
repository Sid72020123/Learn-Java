package com.vit.exams;

public class Topic17MethodOverriding {
	public static void main(String[] args) {
		Vehicle vehicle = new Car();
		vehicle.start();
	}
}

class Vehicle {
	void start() {
		System.out.println("Vehicle starts");
	}
}

class Car extends Vehicle {
	@Override
	void start() {
		System.out.println("Car starts with a key or button");
	}
}
