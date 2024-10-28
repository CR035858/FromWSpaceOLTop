package com.gl.glca28maycol;

import java.util.Iterator;
import java.util.LinkedList;

public class LinkedListSample {

	LinkedList <Employee> llist = new LinkedList<Employee>();
	public void populateLinkedList()
	{
		llist.add(new Employee(100,"Harsha","RtNagar",10000));
		llist.add(new Employee(101,"Keerthana","Koramangala",15000));
		llist.add(new Employee(102,"Suman","Vijayanagar",12000));
		llist.add(new Employee(103,"Rakesh","Jayanagar",20000));
		llist.add(new Employee(104,"Rajesh","Malleswaram",35000));
		llist.addFirst(new Employee(99,"Sumesh","RtNagar",13000));
		llist.addLast(new Employee(105,"Suresh","wilsonGarden",17000));
	}
	public void fetchLinkedList()
	{
		for(Employee e:llist)
		{
			System.out.println(e);
		}
	}
	public void fetchDescIterator()
	{
		Iterator <Employee> descIter = llist.descendingIterator();
		while(descIter.hasNext())
		{
			Employee e = descIter.next();
			System.out.println(e);
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedListSample lls = new LinkedListSample();
		lls.populateLinkedList();
		lls.fetchLinkedList();
		System.out.println("--------------");
		lls.fetchDescIterator();
	}

}
