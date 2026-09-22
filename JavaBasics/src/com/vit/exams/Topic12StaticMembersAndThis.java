package com.vit.exams;

public class Topic12StaticMembersAndThis {
	static int createdCount; // static: shared across every Employee object
	private final String name;

	Topic12StaticMembersAndThis(String name) {
		this.name = name;
		createdCount++;
	} // this.name resolves field vs parameter

	void showName() {
		System.out.println(this.name);
	}

	public static void main(String[] args) {
		Topic12StaticMembersAndThis employee = new Topic12StaticMembersAndThis("Meera");
		employee.showName();
		System.out.println("Objects created: " + Topic12StaticMembersAndThis.createdCount);
	}
}
