package com.gl.glca29maycol;

import java.util.Collection;
import java.util.Enumeration;
import java.util.Hashtable;
import java.util.Iterator;

import com.gl.glca28maycol.Employee;

public class HashTableSample {

	
	Hashtable<String,Employee> myTable = new Hashtable<String,Employee>();
	
	public void populateHashtable()
	{
		myTable.put("E000", new Employee(100,"Harsha","RtNagar",10000));
		myTable.put("E001", new Employee(101,"Keerthana","Koramangala",15000));
		myTable.put("E002", new Employee(102,"Suman","Vijayanagar",12000));
		myTable.put("E003", new Employee(103,"Rakesh","Jayanagar",20000));
		myTable.put("E004", new Employee(104,"Rajesh","Malleswaram",35000));
		//myTable.put("E004", new Employee(204,"Poornima","Rajajinagar",45000));
	}
	public void fetchUsingEnumerator()
	{
		Enumeration <String> myKeys = myTable.keys();
		while(myKeys.hasMoreElements())
		{
			String myKey = myKeys.nextElement();
			System.out.println("The Value object for the Key "+myKey+" is "+myTable.get(myKey));
			
		}
	}
	public void fetchUsingKeysValues()
	{
		Collection <Employee> employees = myTable.values();
	
		Iterator empIter = employees.iterator();
		while(empIter.hasNext())
		{
			System.out.println("The Value Object is "+empIter.next());
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashTableSample hts  = new HashTableSample();
		hts.populateHashtable();
		hts.fetchUsingEnumerator();
		System.out.println("----------------Value Object--------------");
		hts.fetchUsingKeysValues();

	}

}
