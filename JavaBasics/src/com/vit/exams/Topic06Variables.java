package com.vit.exams;

public class Topic06Variables {
	static int classCounter = 0; // Static/class variable: shared by all objects.
	int instanceCounter; // Instance variable: one copy per object.

	public static void main(String[] args) {
		Topic06Variables example = new Topic06Variables();
		int localNumber = 10; // Local variable: exists only during this method call.
		example.instanceCounter++;
		classCounter++;
		System.out.println(localNumber + ", " + example.instanceCounter + ", " + classCounter);
	}
}
