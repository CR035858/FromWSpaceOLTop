package com.gl.glca;

import java.util.Enumeration;
import java.util.Hashtable;

public class HashTableSample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		   Hashtable hash_table = new Hashtable();//creating a hash table
		     hash_table.put("1", "Monday");
		     hash_table.put("2", "Tuesday");
		     hash_table.put("3", "Wednesday");
		     hash_table.put("4", "Thursday");
		     hash_table.put("5", "Friday");
		     hash_table.put("6", "Saturday");
		     hash_table.put("7", "Sunday");
		     Enumeration enumeration_hash_table = hash_table.elements();//creating an enumeration object
		     
		     //while loop runs until the hashtable has more entries in it
		     while(enumeration_hash_table.hasMoreElements()) {
		        System.out.println(enumeration_hash_table.nextElement());
		     }
	}

}
