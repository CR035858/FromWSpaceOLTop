package com.gl.colls2;

import java.util.HashSet;

public class HashSetIsEmpty {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	     // Create a empty hash set
	     HashSet<String> h_set = new HashSet();
	   // use add() method to add values in the hash set
	          h_set.add("Bangalore");
	          h_set.add("New Delhi");
	          h_set.add("Chennai");
	          h_set.add("Hubli");
	          h_set.add("Kanpur");
	          h_set.add("Nagpur");
	    System.out.println("Original Hash Set: " + h_set);
	    System.out.println("Checking the above array list is empty or not! "+h_set.isEmpty());
	    System.out.println("Remove all the elements from a Hash Set: ");
	    h_set.removeAll(h_set);
	    System.out.println("Hash Set after removing all the elements "+h_set);   
	   

	}

}
