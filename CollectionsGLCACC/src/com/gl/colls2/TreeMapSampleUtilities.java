package com.gl.colls2;

import java.util.Map;
import java.util.TreeMap;

public class TreeMapSampleUtilities {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Create a tree map
		   TreeMap<Integer,String> tree_map=new TreeMap<Integer,String>();      

		   // Put elements to the map 
		   tree_map.put(3, "Black");
		   tree_map.put(1, "Red");
		   tree_map.put(5, "Blue");
		   tree_map.put(2, "Green");
		   tree_map.put(4, "White");
		 
		    
		   for (Map.Entry<Integer,String> entry : tree_map.entrySet())
		   {
		    System.out.println(entry.getKey() + "=>" + entry.getValue());
		   }
		  
	
		//---------------COPYING ONE TREEMAP INTO ANOTHER-------------
		   // Create a tree map
		   TreeMap<String,String> tree_map1=new TreeMap<String,String>();      
		  
		  // Put elements to the map 
		  tree_map1.put("C1", "Red");
		  tree_map1.put("C2", "Green");
		  tree_map1.put("C3", "Black");
		  tree_map1.put("C4", "White");
		  tree_map1.put("C5", "Blue");
		   System.out.println("Tree Map 1: "+tree_map1);
		   TreeMap<String,String> tree_map2 = new TreeMap<String,String>();
		   tree_map2.put("A1", "Orange");
		   tree_map2.put("A2", "Pink");
		   System.out.println("Tree Map 2: "+tree_map2);
		   tree_map1.putAll(tree_map2);
		   System.out.println("After copying map2 to map1: "+tree_map1); 
		

}
}
