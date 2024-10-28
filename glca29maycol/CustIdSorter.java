package com.gl.glca29maycol;

import java.util.Comparator;

public class CustIdSorter implements Comparator <Customer> {

	@Override
	public int compare(Customer customer1, Customer customer2) {
		// TODO Auto-generated method stub
		if(customer1.getCustId().compareTo(customer2.getCustId()) > 0)
		{
			return 1;
		}
		else if (customer1.getCustId().compareTo(customer2.getCustId()) < 0)
		{
			return -1;
		}
		else
		{
			return 0;
		}
	}

}
