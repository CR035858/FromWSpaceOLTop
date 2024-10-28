package com.gl.glca29maycol;

import java.util.Iterator;
import java.util.PriorityQueue;
import java.util.Queue;

import com.gl.glca29maycol.Employee;

public class QueueSample {

	Queue <String> myQueue = new PriorityQueue<String>();
	Queue <Employee> empQueue = new PriorityQueue<Employee>();
	public void populateQueue()
	{
		myQueue.add("Faridabad");
		myQueue.add("Ernakulam");
		myQueue.add("Mangalore");
		myQueue.add("Delhi");
		myQueue.add("Bangalore");
		myQueue.add("Mumbai");
		myQueue.add("Calcutta");
	}
	public void populateEmployeeQueue()
	{
		empQueue.add(new Employee(100,"Harsha","RtNagar",10000));
		empQueue.add(new Employee(101,"Keerthana","Koramangala",15000));
		empQueue.add(new Employee(102,"Suman","Vijayanagar",12000));
		empQueue.add(new Employee(103,"Rakesh","Jayanagar",20000));
		empQueue.add(new Employee(104,"Rajesh","Malleswaram",35000));
	}
	// FIFO TRAIN IT USING Comparable
	public void fetchQueueUseRemove()
	{
		while(myQueue.isEmpty() == false)
		{
			String city = myQueue.remove();
			System.out.println("Dequeued City from Queue is "+city);
		}
	}
	public void fetchUsingIterator()
	{
		
		Iterator <String> cities =  myQueue.iterator();
		while(cities.hasNext())
		{
			System.out.println("The City is "+cities.next());
		}
	}
	public void fetchEmployeeUsingRemove()
	{
		
		while(empQueue.isEmpty() == false)
		{
			System.out.println("Employee in Queue is "+empQueue.remove());
		}
	}
	public void difPeeknRemove()
	{
		System.out.println("Size of queue before peek "+empQueue.size());
		Employee employee = empQueue.peek();
		System.out.println("Peeked Employee "+employee);
		System.out.println("Size of queue after Peek "+empQueue.size());
		
		System.out.println("Size of queue before remove "+empQueue.size());
		Employee employeer = empQueue.remove();
		System.out.println("Removed Employee "+employeer);
		System.out.println("Size of queue after Remove "+empQueue.size());
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		QueueSample qs = new QueueSample();
		qs.populateQueue();
		System.out.println("fetch Using remove.....");
		qs.fetchQueueUseRemove();
		System.out.println("fetch Using Iterator.....");
		qs.populateQueue();
		qs.fetchUsingIterator();
		qs.populateQueue();
		qs.populateEmployeeQueue();
		qs.difPeeknRemove();
		//qs.fetchUsingIterator();
		System.out.println("-------------");
	/*	qs.populateEmployeeQueue();
		qs.fetchEmployeeUsingRemove();*/

	}

}
