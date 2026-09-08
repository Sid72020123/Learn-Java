package com.vit.management;

import com.vit.student.Student;
import com.vit.admin.Admin;
import com.vit.faculty.Faculty;

public class Management {
	public static void main(String[] args) {
		Student s = new Student("Siddhesh", 44, "S.Y. CS(SE)", 'C');
		Faculty f = new Faculty(101, "Teacher A", "S.Y. CS(SE)", 'C');
		Admin a = new Admin(101, "ADMIN");
		
		a.displayInfo();
		f.displayInfo();
		s.displayInfo();
		
	}
}
