package com.gl.colls2;

import java.util.HashSet;

public class HashSetSize {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashSet<String> h_set = new HashSet<String>();
		   // use add() method to add values in the hash set
		          h_set.add("Karnataka");
		          h_set.add("TamilNadu");
		          h_set.add("Andhra Pradesh");
		          h_set.add("Uttar Pradesh");
		          h_set.add("Rajasthan");
		          h_set.add("Madhya Pradesh");
		    System.out.println("Original Hash Set: " + h_set);
		    System.out.println("Size of the Hash Set: " + h_set.size());

	}

}
