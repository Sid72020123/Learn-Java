package com.vit.basics;

class Vehicle {
	String brandName;
	String model;
	int manufactureYear;
	int numOfTyres;
	boolean safetyQualification;
	double price;

	String getVehicleType() {
		return "Vehicle";
	}

	public Vehicle() {
		brandName = "N / A";
		model = "N / A";
		manufactureYear = 0;
		numOfTyres = 0;
		safetyQualification = false;
		price = 0;
	}

	public Vehicle(String brandName, String model, int manufactureYear, int numOfTyres, boolean safetyQualification,
			double price) {
		this.brandName = brandName;
		this.model = model;
		this.manufactureYear = manufactureYear;
		this.numOfTyres = numOfTyres;
		this.safetyQualification = safetyQualification;
		this.price = price;
	}

	void displayInfo() {
		System.out.printf(
				"\n===== %s Info =====\n[Type]: %s\n[Brand]: %s\n[Model]: %s\n\n[Manufacture Year]: %d\n[Number of Tyres]: %d\n\n[Safety Test Passed?]: %s\n\n[Price]: %.2f\n",
				getVehicleType(), getVehicleType(), brandName, model, manufactureYear, numOfTyres,
				safetyQualification ? "Yes" : "No", price);
	}
}

class Car extends Vehicle {
	public Car() {
		super();
	}

	public Car(String brandName, String model, int manufactureYear, int numOfTyres, boolean safetyQualification,
			double price) {
		super(brandName, model, manufactureYear, numOfTyres, safetyQualification, price);
	}

	String getVehicleType() {
		return "Car";
	}
}

class ElectricCar extends Car {
	public ElectricCar() {
		super();
	}

	public ElectricCar(String brandName, String model, int manufactureYear, int numOfTyres, boolean safetyQualification,
			double price) {
		super(brandName, model, manufactureYear, numOfTyres, safetyQualification, price);
	}

	String getVehicleType() {
		return "Electric Car";
	}
}

public class Transport {
	public static void main(String[] args) {
		Vehicle car1 = new Car("Toyota", "Camry", 2024, 4, true, 28500.00);

		Vehicle car2 = new Car("BMW", "3 Series", 2023, 4, true, 48000.00);

		Vehicle electricCar1 = new ElectricCar("Tesla", "Model 3", 2024, 4, true, 38990.00);

		Vehicle electricCar2 = new ElectricCar("Hyundai", "Ioniq 5", 2023, 4, true, 41700.00);

		car1.displayInfo();
		car2.displayInfo();

		electricCar1.displayInfo();
		electricCar2.displayInfo();
	}
}
