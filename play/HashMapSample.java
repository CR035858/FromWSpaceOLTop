package com.gl.play;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map.Entry;
import java.util.Set;

import com.gl.glca28maycol.Employee;

public class HashMapSample {

	HashMap <String,Employee> myMap = new HashMap<String,Employee>();
	public void populateHashMap()
	{
		
		myMap.put("E001", new Employee(101,"Keerthana","Koramangala",15000));
		myMap.put("E002", new Employee(102,"Suman","Vijayanagar",12000));
		myMap.put("E003", new Employee(103,"Rakesh","Jayanagar",20000));
		myMap.put("E004", new Employee(104,"Poornima","Rajajinagar",45000));
		myMap.put("E005", new Employee(105,"Harsha","RtNagar",10000));
	}
	public void fetchHashMapdata()
	{
		Set <Entry <String,Employee>> myEntrySet = myMap.entrySet();
		Iterator <Entry<String,Employee>> myEntrySetIter = myEntrySet.iterator();
		while(myEntrySetIter.hasNext())
		{
			Entry <String,Employee> myEntry = myEntrySetIter.next();
			
			System.out.println("The Key "+myEntry.getKey()+" Has a Value Object  of "+myEntry.getValue());
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		HashMapSample hms = new HashMapSample();
		hms.populateHashMap();
		hms.fetchHashMapdata();

	}

}
