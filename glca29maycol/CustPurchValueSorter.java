package com.gl.glca29maycol;

import java.util.Comparator;

public class CustPurchValueSorter implements Comparator <Customer>{

	@Override
	public int compare(Customer customer1, Customer customer2) {
		// TODO Auto-generated method stub
		if(customer1.getPurchaseValue() > customer2.getPurchaseValue())
		{
			return 1;
		}
		else if(customer1.getPurchaseValue() < customer2.getPurchaseValue())
		{
			return -1;
		}
		else
		{
			return 0;
		}
	}

}
