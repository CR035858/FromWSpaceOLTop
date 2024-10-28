package com.gl.play3;

import java.util.Iterator;
import java.util.PriorityQueue;
import java.util.Queue;

public class QueueSample {

	Queue <String> myQueue = new PriorityQueue<>();
	public void populateQueue()
	{
		myQueue.add("Alphonso");
		myQueue.add("Bijendra");
		myQueue.add("Chandu");
		myQueue.add("David");
		myQueue.add("Emanuel");
		myQueue.add("Florence");
		
	}
	
	public void fetchQueueThruIterator()
	{
		Iterator qIter = myQueue.iterator();
		while(qIter.hasNext())
		{
			System.out.println(qIter.next());
		}
		
	}
	public void fetchThruRemove()
	{
		while(myQueue.isEmpty() == false)
		{
			String queueElem = myQueue.remove();
			System.out.println("Removed Element "+queueElem);
		}
		
	}
	public void fetchThruPeek()
	{
		int size = myQueue.size();
		int counter = 0;
		while(counter < size)
		{
			System.out.println(myQueue.peek());
			
			counter++;
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		QueueSample qs = new QueueSample();
		qs.populateQueue();
		qs.fetchQueueThruIterator();
		qs.fetchThruRemove();
		qs.populateQueue();
		qs.fetchQueueThruIterator();
		System.out.println("--------------");
		qs.fetchThruPeek();
	}

}
