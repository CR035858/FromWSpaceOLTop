package com.gl.colls2;

import java.util.Iterator;
import java.util.TreeSet;

public class TreeSetSample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TreeSet<String> tree_set = new TreeSet<String>();
		  tree_set.add("Bangalore");
		  tree_set.add("Dharwad");
		  tree_set.add("Coimbatore");
		  tree_set.add("Ernakulam");
		  tree_set.add("Faridabad");
		  tree_set.add("Guwahati");
		  tree_set.add("Ahmedabad");
		  System.out.println("Tree set: ");
		  System.out.println(tree_set);
		  System.out.println("---------Iterate TreeSet Through Iterator---------");
		  for (String element : tree_set) {
			    System.out.println(element);
			    }
		  System.out.println("Iterate TreeSet using Iterator");
		  Iterator <String> tSetIter = tree_set.iterator();
		  while(tSetIter.hasNext())
		  {
			  String city = tSetIter.next();
			  System.out.println(city);
		  }
		  
		  	System.out.println("-----------Original tree set:----------" + tree_set);  
		     Iterator it = tree_set.descendingIterator();
		     // Print list elements in reverse order
		     System.out.println("----------Elements in Reverse Order:-----------");
		     while (it.hasNext()) {
		        System.out.println(it.next());
		     }

	}

}
