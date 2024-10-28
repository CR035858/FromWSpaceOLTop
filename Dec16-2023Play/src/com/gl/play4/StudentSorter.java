package com.gl.play4;

import java.util.ArrayList;
import java.util.Collections;

public class StudentSorter {

	public static void main(String[] args)
	{
		Student stud4 = new Student(4,"Harsha");
		Student stud3 = new Student(3,"Suman");
		Student stud1 = new Student(1,"Adarsh");
		Student stud5 = new Student(5,"Emanuel");
		Student stud2 = new Student(2,"David");
		
		ArrayList <Student> students = new ArrayList<Student>();
		students.add(stud4);
		students.add(stud3);
		students.add(stud1);
		students.add(stud5);
		students.add(stud2);
		
		Collections.sort(students);
		
		for(Student s:students)
		{
			System.out.println(s);
		}
		

	}
}
