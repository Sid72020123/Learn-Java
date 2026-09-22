package com.vit.exams;

public class Topic20FinalWithInheritance {
	public static void main(String[] args) {
		PremiumPlan plan = new PremiumPlan();
		plan.describe();
		System.out.println(plan.getId());
	}
}

class Plan {
	final String getId() {
		return "PLAN-001";
	} // A final method cannot be overridden.
}

class PremiumPlan extends Plan {
	final void describe() {
		System.out.println("Premium plan");
	} // This method cannot be overridden by a subclass.
}
// A final class cannot be extended: final class ImmutablePlan { }
