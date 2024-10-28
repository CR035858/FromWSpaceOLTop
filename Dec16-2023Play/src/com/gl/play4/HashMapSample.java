package com.gl.play4;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeMap;

public class HashMapSample {

	HashMap <String,Customer> customerHMap = new HashMap<>();
	TreeMap <String,Customer> customerTMap = new TreeMap<>();
	ArrayList <Customer> cList = new ArrayList<>();
	public void populateHashMap()
	{
		customerHMap.put("C003", new Customer("C003","Harsha"));
		customerHMap.put("C001", new Customer("C001","Keerthy"));
		customerHMap.put("C002", new Customer("C002","Suman"));
	}
	public void populateTreeMap()
	{
		customerTMap.put("C003", new Customer("C003","Harsha"));
		customerTMap.put("C001", new Customer("C001","Keerthy"));
		customerTMap.put("C002", new Customer("C002","Suman"));
	}
	public void populateArrayList()
	{
		cList.add(new Customer("C003","Harsha"));
		cList.add(new Customer("C001","Keerthy"));
		cList.add(new Customer("C002","Suman"));
	}
	public void manipulateAList()
	{
		System.out.println(cList.get(1));
		
		System.out.println(cList.remove(1));
		System.out.println(cList);
	}
	
	public void fetchHashMapData()
	{
		Set <String> myKeySet = customerHMap.keySet();
		Iterator <String> keyIter = myKeySet.iterator();
		while(keyIter.hasNext())
		{
			String myKey = keyIter.next();
			System.out.println("The Customer Value for the Key "+myKey+" is "+customerHMap.get(myKey));
			
		}
		
	}
	public void fetchTreeMapData()
	{
		Set <String> myKeySet = customerTMap.keySet();
		Iterator <String> keyIter = myKeySet.iterator();
		while(keyIter.hasNext())
		{
			String myKey = keyIter.next();
			System.out.println("The Customer Value for the Key "+myKey+" is "+customerHMap.get(myKey));
		}
		
	}
	public void fetchTreeMapThruEntrySet()
	{
		Set <Entry <String,Customer>> myEntrySet = customerTMap.entrySet();
		Iterator <Entry <String,Customer>> entryIter =  myEntrySet.iterator();
		while(entryIter.hasNext())
		{
			Entry <String,Customer> myEntry = entryIter.next();
			System.out.println("The Key is "+myEntry.getKey());
			System.out.println("The Value Object is "+myEntry.getValue());
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		HashMapSample hms = new HashMapSample();
	/*	hms.populateHashMap();
		hms.fetchHashMapData();
		System.out.println("---------------------");
		hms.populateTreeMap();
		hms.fetchTreeMapData();
		hms.populateArrayList();
		hms.manipulateAList();*/
		hms.populateTreeMap();
		hms.fetchTreeMapThruEntrySet();
	}

}
