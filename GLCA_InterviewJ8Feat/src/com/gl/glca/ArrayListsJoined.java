package com.gl.glca;

import java.util.ArrayList;

public class ArrayListsJoined {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 ArrayList<String> list_1 = new ArrayList<String>();
	       list_1.add("Monday");
	       list_1.add("Tuesday");
	       list_1.add("Wednesday");
	       list_1.add("Thursday");
	       //printing the first array list
	       System.out.println("The elements of the first array list is as follows : " + list_1);
	       //creating the second array list
	       ArrayList<String> list_2 = new ArrayList<String>();
	       list_2.add("Friday");
	       list_2.add("Saturday");
	       list_2.add("Sunday");
	       //printing the second array list
	       System.out.println("The elements of the second array list is as follows : " + list_2);
	        
	       //creating the third array list
	       ArrayList<String> joined_list = new ArrayList<String>();
	       joined_list.addAll(list_1);//adding the elements of the first array list
	       joined_list.addAll(list_2);//adding the elements of the second array list
	       
	       System.out.println("The elements of the joined array list is as follows : " + joined_list);
	       

	}

}
