package com.gl.play4;

import java.util.ArrayList;
import java.util.Collections;

public class EmployeeSorter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employee e2 = new Employee("E002","Harsha","Bangalore");
		Employee e1 = new Employee("E001","Chandu","Ernakulam");
		Employee e3 = new Employee("E003","Amar","Ahmedabad");
		ArrayList <Employee> employees = new ArrayList<Employee>();
		
		employees.add(e2);
		employees.add(e1);
		employees.add(e3);
		
		System.out.println("-----------Employee Sorted By Id-----------");
		Collections.sort(employees, new EmployeeIdSorter());
		for(Employee e: employees)
		{
			System.out.println(e);
		}
		System.out.println("-----------Employee Sorted By City---------");
		Collections.sort(employees, new EmployeeCitySorter());
		for(Employee e: employees)
		{
			System.out.println(e);
		}

	}

}
