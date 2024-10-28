package com.gl.colls1;

import java.util.LinkedList;

public class LinkedListSample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 // create an empty linked list
	     LinkedList <String> l_list = new LinkedList<String>();
	   // use add() method to add values in the linked list
	          l_list.add("Karnataka");
	          l_list.add("Uttar Pradesh");
	          l_list.add("Madhya Pradesh");
	          l_list.add("Andhra Pradesh");
	          l_list.add("Kerala");
	         // Print the linked list
	  for (String element : l_list) {
	    System.out.println(element);


	}
	}

}
