package com.gl.glca29maycol;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class CustomerSorter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList <Customer> customers = new ArrayList <Customer>();

		customers.add(new Customer("C003","Kiran Kumar","Faridabad",8600));
		customers.add(new Customer("C005","Amarnath","Ahmedabad",7600));
		customers.add(new Customer("C002","Zeenath","Coimbatore",9600));
		customers.add(new Customer("C001","Harish","Ernakulam",6600));
		customers.add(new Customer("C004","Guru Kiran","Gandhinagar",7900));
		
		System.out.println("-------------Customers Before Sorting------------");
		Iterator <Customer> custIter = customers.iterator();
		while(custIter.hasNext())
		{
			System.out.println(custIter.next());
		}
		Collections.sort(customers, new CustIdSorter());
		System.out.println("-------------Customers After Sorting Customer Id------------");
		Iterator <Customer> custIter1 = customers.iterator();
		while(custIter1.hasNext())
		{
			System.out.println(custIter1.next());
		}
		
		Collections.sort(customers, new CustCitySorter());
		System.out.println("-------------Customers After Sorting Customer City------------");
		Iterator <Customer> custIter2 = customers.iterator();
		while(custIter2.hasNext())
		{
			System.out.println(custIter2.next());
		}
		Collections.sort(customers, new CustPurchValueSorter());
		System.out.println("-------------Customers After Sorting Customer City------------");
		Iterator <Customer> custIter3 = customers.iterator();
		while(custIter3.hasNext())
		{
			System.out.println(custIter3.next());
		}
	}

}
