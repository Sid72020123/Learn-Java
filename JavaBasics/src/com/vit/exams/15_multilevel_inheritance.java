package com.vit.exams;

class MultilevelInheritance {
    public static void main(String[] args) { Puppy puppy = new Puppy(); puppy.eat(); puppy.bark(); puppy.weep(); }
}
class LivingAnimal { void eat() { System.out.println("Eats"); } }
class Canine extends LivingAnimal { void bark() { System.out.println("Barks"); } }
class Puppy extends Canine { void weep() { System.out.println("Weeps"); } }
