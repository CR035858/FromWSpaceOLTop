package com.gl.glca28maycol;

import java.util.Collection;
import java.util.Iterator;
import java.util.Set;
import java.util.TreeMap;

public class TreeMapSample {
	
	TreeMap <String,Employee> myEmpTree = new TreeMap<String,Employee>();
	public void populateHashMap()
	{
		myEmpTree.put("E005", new Employee(100,"Harsha","RtNagar",10000));
		myEmpTree.put("E001", new Employee(101,"Keerthana","Koramangala",15000));
		myEmpTree.put("E006", new Employee(102,"Suman","Vijayanagar",12000));
		myEmpTree.put("E003", new Employee(103,"Rakesh","Jayanagar",20000));
		myEmpTree.put("E002", new Employee(104,"Rajesh","Malleswaram",35000));
		myEmpTree.put("E004", new Employee(204,"Poornima","Rajajinagar",45000));
		
	}
	public void fetchTreeMapData()
	{
		Set <String> myKeys = myEmpTree.keySet();
		Iterator <String> myKeyIter = myKeys.iterator();
		while(myKeyIter.hasNext())
		{
			String myKey = myKeyIter.next();
			Employee e = myEmpTree.get(myKey);
			System.out.println("The Employee for the Key :"+myKey+" is  :"+e);
		}
		
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TreeMapSample tms = new TreeMapSample();
		tms.populateHashMap();
		tms.fetchTreeMapData();
	}

}
