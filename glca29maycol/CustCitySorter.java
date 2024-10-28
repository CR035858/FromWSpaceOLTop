package com.gl.glca29maycol;

import java.util.Comparator;

public class CustCitySorter implements Comparator <Customer>{

	@Override
	public int compare(Customer customer1, Customer customer2) {
		// TODO Auto-generated method stub
		if(customer1.getCustCity().compareTo(customer2.getCustCity()) > 0)
		{
			return 1;
		}
		else if (customer1.getCustCity().compareTo(customer2.getCustCity()) < 0)
		{
			return -1;
		}
		else
		{
			return 0;
		}
	}

}
