package com.gl.play;

import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Stack;

public class QueueSample  {

	Queue <Employee> myQueue = new PriorityQueue<Employee>();
	Stack <Employee> myStack = new Stack<Employee>();
	/*
	 * employees.add(new Employee(100,"Harsha","RtNagar",10000));
	employees.add(new Employee(101,"Keerthana","Koramangala",15000));
	employees.add(new Employee(102,"Suman","Vijayanagar",12000));
	employees.add(new Employee(103,"Rakesh","Jayanagar",20000));
	employees.add(new Employee(104,"Rajesh","Malleswaram",35000));
	 */
	public void populateQueue()
	{
		myQueue.add(new Employee(100,"Harsha"));
		myQueue.add(new Employee(101,"Keerthana"));
		myQueue.add(new Employee(102,"Suman"));
		myQueue.add(new Employee(103,"Rakesh"));
		myQueue.add(new Employee(104,"Rajesh"));
	}
	public void populateStack()
	{
		
		myStack.push(new Employee(100,"Harsha"));
		myStack.push(new Employee(101,"Keerthana"));
		myStack.push(new Employee(102,"Suman"));
		myStack.push(new Employee(103,"Rakesh"));
		myStack.push(new Employee(104,"Rajesh"));
	}
	public void fetchQueueData()
	{
		while(myQueue.isEmpty() == false)
		{
			Employee e = myQueue.remove();
			System.out.println(e);
		}
	}
	public void fetchStackData()
	{
		while(myStack.isEmpty() == false)
		{
			System.out.println(myStack.pop());
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		QueueSample qs = new QueueSample();
		qs.populateQueue();
		qs.fetchQueueData();
		
		qs.populateStack();
		qs.fetchStackData();

	}
	

}
