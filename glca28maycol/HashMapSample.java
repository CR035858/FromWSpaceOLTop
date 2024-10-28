package com.gl.glca28maycol;

import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map.Entry;
import java.util.Set;

public class HashMapSample {
	
	HashMap <String,Employee> empMap = new HashMap<String,Employee>();
	/*
	 * employees.add(new Employee(100,"Harsha","RtNagar",10000));
	employees.add(new Employee(101,"Keerthana","Koramangala",15000));
	employees.add(new Employee(102,"Suman","Vijayanagar",12000));
	employees.add(new Employee(103,"Rakesh","Jayanagar",20000));
	employees.add(new Employee(104,"Rajesh","Malleswaram",35000));
	 */
	public void populateHashMap()
	{
		empMap.put("E000", new Employee(100,"Harsha","RtNagar",10000));
		empMap.put("E001", new Employee(101,"Keerthana","Koramangala",15000));
		empMap.put("E002", new Employee(102,"Suman","Vijayanagar",12000));
		empMap.put("E003", new Employee(103,"Rakesh","Jayanagar",20000));
		empMap.put("E004", new Employee(104,"Rajesh","Malleswaram",35000));
	//	empMap.put("E004", new Employee(204,"Poornima","Rajajinagar",45000));
		
	}
	public void fetchHashMapData()
	{
		Set <String> myKeys = empMap.keySet();
		Iterator <String> myKeyIter = myKeys.iterator();
		while(myKeyIter.hasNext())
		{
			String myKey = myKeyIter.next();
			Employee e = empMap.get(myKey);
			System.out.println("The Employee for the Key :"+myKey+" is  :"+e);
		}
		System.out.println("----------Fetched Value Object from hashMap...--------");
		Collection <Employee> myColEmp = empMap.values();
		for(Employee e: myColEmp)
		{
			System.out.println(e);
		}
		
	}
	public void fetchUsingEntrySet()
	{
		
		Set <Entry <String,Employee>> myEntrySet = empMap.entrySet();
		Iterator <Entry <String,Employee>> entrySetIter = myEntrySet.iterator();
		while(entrySetIter.hasNext())
		{
			Entry <String,Employee> myEntry = entrySetIter.next();
			System.out.println("The Key is "+myEntry.getKey()+" And the Corresponding Value object is "+myEntry.getValue());
		}
	}
	public static void main(String[] args)
	{
		HashMapSample hms = new HashMapSample();
		hms.populateHashMap();
		hms.fetchHashMapData();
		System.out.println("--------using entry set-----------");
		hms.fetchUsingEntrySet();
	}
	

}
