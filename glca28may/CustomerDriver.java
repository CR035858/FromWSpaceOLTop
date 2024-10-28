package com.gl.glca28may;

public class CustomerDriver {

	public void callCustomer()
	{
		System.out.println("We are dealing with Customers....");
		Customer customer1 = new Customer();
		customer1.display();
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		CustomerDriver cd = new CustomerDriver();
		cd.callCustomer();
		
	/*	Customer customer1 = new Customer();
		customer1.display1();
		GoldCustomer gcustomer = new GoldCustomer();
		gcustomer.display2();
		gcustomer.display1();*/
		
		Customer cust1 = new Customer();
		cust1.display();
		
		cust1 = new GoldCustomer();
		cust1.display();
		
		GoldCustomer gc = (GoldCustomer) new Customer();
		gc.display();

	}

}
