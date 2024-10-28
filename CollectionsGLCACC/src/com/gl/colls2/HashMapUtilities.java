package com.gl.colls2;

import java.util.HashMap;

public class HashMapUtilities {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashMap<Integer,String> hash_map= new HashMap<Integer,String>();  
		  hash_map.put(1, "Red");
		  hash_map.put(2, "Green");
		  hash_map.put(3, "Black");
		  hash_map.put(4, "White");
		  hash_map.put(5, "Blue");
		  System.out.println("Size of the hash map: "+hash_map.size());
		  //-------------------CHECKING FOR KEY AVAILABILITY------------
		  System.out.println("----------------------CHECKING FOR KEY AVLBLTY-----------------");
		  HashMap < String, Integer > hash_map1 = new HashMap < String, Integer > ();
		  hash_map1.put("Red", 1);
		  hash_map1.put("Green", 2);
		  hash_map1.put("Black", 3);
		  hash_map1.put("White", 4);
		  hash_map1.put("Blue", 5);
		  // print the map
		  System.out.println("The Original map: " + hash_map1);
		  System.out.println("1. Is key 'Green' exists?");
		  if (hash_map1.containsKey("Green")) {
		   //key exists
		   System.out.println("yes! - " + hash_map1.get("Green"));
		  } else {
		   //key does not exists
		   System.out.println("no!");
		  }

		  System.out.println("\n2. Is key 'orange' exists?");
		  if (hash_map1.containsKey("orange")) {
		   System.out.println("yes! - " + hash_map1.get("orange"));
		  } else {
		   System.out.println("no!");
		  }
		  
		  //------------------CHECKING FOR EMPTINESS
		  System.out.println("----------------------CHECKING FOR MAP EMPTINESS-----------------");
		  // check if map is empty
		  boolean result = hash_map.isEmpty();
		  // check the result
		  System.out.println("Is hash map empty: " + result);
		  // Removing all the elements from the linked map
		  hash_map.clear();
		  // check if map is empty
		  result = hash_map.isEmpty();
		  // check the result
		  System.out.println("Is hash map empty: " + result);
		  
		  //------------------------Printing the Values------------
		  System.out.println("--------------Printing Only Values--------------");
		  System.out.println("Collection view is: "+ hash_map1.values());

	}

}
