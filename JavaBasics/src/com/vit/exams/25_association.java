package com.vit.exams;

class Association {
    public static void main(String[] args) {
        Teacher teacher = new Teacher("Dr. Rao");
        Course course = new Course("Java", teacher); // Independent objects are associated.
        course.showTeacher();
    }
}
class Teacher { final String name; Teacher(String name) { this.name = name; } }
class Course { final String name; final Teacher teacher; Course(String name, Teacher teacher) { this.name = name; this.teacher = teacher; } void showTeacher() { System.out.println(name + " is taught by " + teacher.name); } }
