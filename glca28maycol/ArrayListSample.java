package com.gl.glca28maycol;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListSample {

	ArrayList <Employee> employees = new ArrayList<Employee>();
	public void populateArrayList()
	{
		employees.add(new Employee(100,"Harsha","RtNagar",10000));
		employees.add(new Employee(101,"Keerthana","Koramangala",15000));
		employees.add(new Employee(102,"Suman","Vijayanagar",12000));
		employees.add(new Employee(103,"Rakesh","Jayanagar",20000));
		employees.add(new Employee(104,"Rajesh","Malleswaram",35000));
	}
	public void fetchArrayList()
	{
		System.out.println("Fetching directly");
		System.out.println(employees);
		System.out.println("---------Using Iterator---------");
		Iterator <Employee> empIter = employees.iterator();
		while(empIter.hasNext())
		{
			Employee e = empIter.next();
			System.out.println(e);
		}
		System.out.println("---------Using For Each---------");
		for(Employee e: employees)
		{
			System.out.println(e);
		}
	Employee eFour =	employees.get(4);
	System.out.println("Employee 4th Index "+eFour);
	employees.remove(3);
	System.out.println("Display Post Removing index 3");
	for(Employee e: employees)
	{
		System.out.println(e);
	}
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayListSample als = new ArrayListSample();
		als.populateArrayList();
		als.fetchArrayList();

	}

}
