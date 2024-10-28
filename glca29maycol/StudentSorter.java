package com.gl.glca29maycol;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class StudentSorter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList <Student> students = new ArrayList<Student>();
		students.add(new Student("S003","Kiran Kumar","Faridabad",86));
		students.add(new Student("S005","Amarnath","Ahmedabad",76));
		students.add(new Student("S002","Zeenath","Coimbatore",96));
		students.add(new Student("S001","Harish","Ernakulam",66));
		students.add(new Student("S004","Guru Kiran","Gandhinagar",79));
		System.out.println("-------------Before Sorting------------");
		Iterator <Student> studIter = students.iterator();
		while(studIter.hasNext())
		{
			System.out.println(studIter.next());
		}
		/*System.out.println("-------------After  Sorting ID------------");*/
		/*System.out.println("-------------After  Sorting City------------");*/
		System.out.println("-------------After  Sorting Score------------");
		Collections.sort(students);
		Iterator <Student> studIter1 = students.iterator();
		while(studIter1.hasNext())
		{
			System.out.println(studIter1.next());
		}

	}

}
