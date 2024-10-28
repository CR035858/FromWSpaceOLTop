package com.gl.glca29maycolp2;
interface MyInterface1
{
	public void display();
}
interface MyInterface2
{
	public void calculate(int qty,int ppunit);
}
interface Customer
{
	public void calculateInvoiceAmt(int qty,int ppUnit);
}
interface NewCustomer
{
	public double calculateInvoice(int qty,int ppunit);
}
interface SalesData
{
	public void processOrder(int qty,int ppuni,NewCustomer nc );
}
public class FunctionalInterfaceSample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		MyInterface1 inter1 = () -> {
			System.out.println("Welcome to Lamda Expressions...");
		};
		
		inter1.display();
		
		MyInterface2 inter2 = (int p,int q) -> {
			int totalInvValue = p * q;
			System.out.println("The Invoice Value is "+totalInvValue);
		};
		
		inter2.calculate(200, 450);
		
		Customer c1 = (int p,int q) -> {
			int totalInvoiceValue = p * q;
			System.out.println("The Total Invoice amount for the customer is "+totalInvoiceValue);
			if(totalInvoiceValue > 100000)
			{
				System.out.println("Good Purchase.....");
			}
			else
			{
				System.out.println("Average Purchase.....");
			}
		};
		
		c1.calculateInvoiceAmt(150, 1000);
		
		c1.calculateInvoiceAmt(15, 1000);
		
		NewCustomer nc1 = (int p,int q) -> {
			
			double actualInvoiceAmt = p * q;
			double discountedInvAmt = actualInvoiceAmt - (0.1 * actualInvoiceAmt);
			return discountedInvAmt;
			
		};
		
		NewCustomer nc2 = (int p,int q) -> {
			double actualInvoiceAmt = p * q;
			double discountedInvAmt = actualInvoiceAmt - (0.2 * actualInvoiceAmt);
			return discountedInvAmt;
		};
		
		SalesData sd = (int p,int q,NewCustomer nc) ->{
			int actualInvoiceValue = p * q;
			double finalInvoiceAmt = nc.calculateInvoice(p, q);
			System.out.println("The Actual Invoice AMount is "+actualInvoiceValue);
			System.out.println("The Discounted Invoice Amt is "+finalInvoiceAmt);
			
		};
		
		sd.processOrder(100, 1000, nc1);
		sd.processOrder(100, 1000, nc2);

	}

}
