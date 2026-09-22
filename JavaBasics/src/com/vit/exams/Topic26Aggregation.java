package com.vit.exams;

public class Topic26Aggregation {
    public static void main(String[] args) {
        Address address = new Address("Chennai"); // Address exists independently of Employee.
        Employee employee = new Employee("Isha", address);
        employee.showAddress();
    }
}
class Address { final String city; Address(String city) { this.city = city; } }
class Employee { final String name; final Address address; Employee(String name, Address address) { this.name = name; this.address = address; } void showAddress() { System.out.println(name + " lives in " + address.city); } }
