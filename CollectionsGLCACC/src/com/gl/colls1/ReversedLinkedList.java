package com.gl.colls1;

import java.util.Iterator;
import java.util.LinkedList;

public class ReversedLinkedList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		  // create an empty linked list
	     LinkedList<String> l_list = new LinkedList<String>();
	   // use add() method to add values in the linked list
	     l_list.add("Karnataka");
         l_list.add("Uttar Pradesh");
         l_list.add("Madhya Pradesh");
         l_list.add("Andhra Pradesh");
         l_list.add("Kerala");
	      
	        // print original list
	   System.out.println("Original linked list:" + l_list);  
	 
	    Iterator it = l_list.descendingIterator();

	     // Print list elements in reverse order
	     System.out.println("Elements in Reverse Order:");
	     while (it.hasNext()) {
	        System.out.println(it.next());
	     }

	}

}
