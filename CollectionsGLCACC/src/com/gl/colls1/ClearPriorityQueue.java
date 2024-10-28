package com.gl.colls1;

import java.util.PriorityQueue;

public class ClearPriorityQueue {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Create Priority Queue
        PriorityQueue<String> pq1 = new PriorityQueue<String>();  
        // use add() method to add values in the Priority Queue
       pq1.add("Red");
       pq1.add("Green");
       pq1.add("Black");
       pq1.add("White");
       System.out.println("Original Priority Queue: "+pq1);

       // Removing all the elements from the Priority Queue
       pq1.clear();

       System.out.println("The New Priority Queue: " + pq1);

	}

}
