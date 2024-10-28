package com.gl.colls2;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class HashMapSample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 HashMap<Integer,String> hash_map= new HashMap<Integer,String>();  
		  hash_map.put(1, "Red");
		  hash_map.put(2, "Green");
		  hash_map.put(3, "Black");
		  hash_map.put(4, "White");
		  hash_map.put(5, "Blue");
		  System.out.println("--------------Fetching Using EntrySet---------------");
		  for(Map.Entry x:hash_map.entrySet()){  
		   System.out.println(x.getKey()+" "+x.getValue());  
		  }  
		  
		  System.out.println("--------------Fetching Using KeySet---------------");
		  Set <Integer> myKeySet  = hash_map.keySet();
		  Iterator <Integer> keyIter = myKeySet.iterator();
		  while(keyIter.hasNext())
		  {
			  Integer ikey = keyIter.next();
			  System.out.println("The Value for the Key "+ikey+" Is "+hash_map.get(ikey));
		  }
		  

	}

}
