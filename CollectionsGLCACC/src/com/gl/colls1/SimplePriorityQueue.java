package com.gl.colls1;

import java.util.PriorityQueue;

public class SimplePriorityQueue {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		 PriorityQueue<String> queue=new PriorityQueue<String>();  
		  queue.add("Red");
		  queue.add("Green");
		  queue.add("Orange");
		  queue.add("White");
		  queue.add("Black");
		  System.out.println("Elements of the Priority Queue: ");
		  System.out.println(queue);
		  
		 
		  // iterate the Priority Queue
		  for (String element : queue) {
		    System.out.println(element);
		  }

	}

}
