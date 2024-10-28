package com.gl.colls2;

import java.util.SortedMap;
import java.util.TreeMap;

public class TreeMapUtilities2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// Create a tree map
		   TreeMap<String,String> tree_map1=new TreeMap<String,String>();      
		  
		   		// Put elements to the map 
		   		tree_map1.put("C1", "Red");
		   		tree_map1.put("C2", "Green");
		   		tree_map1.put("C3", "Black");
		   		tree_map1.put("C4", "White"); 
		    
		   		System.out.println(tree_map1);
		   	  System.out.println("-------------CHECKING FOR KEY 'S EXISTENCE--------------");
		        if(tree_map1.containsKey("C1")){
		            System.out.println("The Tree Map contains key C1");
		        } else {
		            System.out.println("The Tree Map does not contain key C1");
		        }
		        if(tree_map1.containsKey("C5")){
		            System.out.println("The Tree Map contains key C5");
		        } else {
		            System.out.println("The TreeMap does not contain key C5");
		        }
		        
		        System.out.println("-------------CHECKING FOR VALUE 'S EXISTENCE--------------");
		        if(tree_map1.containsValue("Green")){
		            System.out.println("The TreeMap contains value Green");
		        } else {
		            System.out.println("The TreeMap does not contain value Green");
		        }
		        if(tree_map1.containsValue("Pink")){
		            System.out.println("The TreeMap contains value Pink");
		        } else {
		            System.out.println("The TreeMap does not contain value Pink");
		        }
		        
		        System.out.println("-----------------Greatest & Least Key---------------");
		        System.out.println("Orginal TreeMap content: " + tree_map1);
		        System.out.println("Greatest key: " + tree_map1.firstEntry());
		        System.out.println("Least key: " + tree_map1.lastEntry());
		        
		        System.out.println("--------------FETCH PORTION OF MAP WITH RANGE OF KEYS-----------");
		     // Declare tree maps
		        TreeMap < Integer, String > tree_map = new TreeMap < Integer, String > ();
		        SortedMap < Integer, String > sub_tree_map = new TreeMap < Integer, String > ();

		        // Put elements to the map 
		        tree_map.put(10, "Red");
		        tree_map.put(20, "Green");
		        tree_map.put(30, "Black");
		        tree_map.put(40, "White");
		        tree_map.put(50, "Pink");
		        System.out.println("Orginal TreeMap content: " + tree_map);
		        sub_tree_map = tree_map.subMap(20, true, 40, true);
		        System.out.println("Sub map key-values: " + sub_tree_map);
		    }

	

}
