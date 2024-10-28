package com.gl.colls2;

import java.util.HashSet;
import java.util.Iterator;

public class HashSetSample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	     // Create a empty hash set
	     HashSet<String> h_set = new HashSet<String>();
	   // use add() method to add values in the hash set
	          h_set.add("India");
	          h_set.add("United States Of America");
	          h_set.add("England");
	          h_set.add("Pakistan");
	          h_set.add("Nepal");
	          h_set.add("Australia");

	  // set Iterator 
	    Iterator<String> p = h_set.iterator();
	  // Iterate the hash set
	   while (p.hasNext()) {
	   System.out.println(p.next());
	   }

	}

}
