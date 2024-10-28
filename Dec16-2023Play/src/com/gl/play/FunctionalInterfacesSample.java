package com.gl.play;
interface MyInterface1
{
//	int x=20;
	public void display1();
}
interface MyInterface2
{
	public void calculate(int a,int b);
}
interface Customer
{
	public void calculateInvoiceAmt(int qty,int price);
}
interface NewCustomer
{
	public double calculateInvoiceAmt(int qty,int price);
}
interface SalesData
{
	public void processOrder(int qty,int price,NewCustomer c);
}
public class FunctionalInterfacesSample {

	public static void main(String[] args) {
		
		MyInterface1 inter1 = () ->{
			System.out.println("Welcome to Functional Interfaces....");
		};
		
		inter1.display1();
		MyInterface2 inter2 = (int x,int y) ->{
			int invAmt = x * y;
			System.out.println("The Inv Amt is "+invAmt);
		};
		inter2.calculate(10, 500);
		
		MyInterface2 mint1 = (int qty,int ppunit) ->
		{
			int invAmt = qty * ppunit;
			if( invAmt >= 10000)
			{
				System.out.println("Good Sale");
			}
			else
			{
				System.out.println("Average Sale...");
			}
		};

		NewCustomer cust1 = (int p,int pprice)->
		{
			int actualCost = p * pprice;
			double discPriceA = actualCost - 0.1 * actualCost;
			return discPriceA;
		};
		NewCustomer cust12 = (int p,int pprice)->
		{
			int actualCost = p * pprice;
			double discPriceB = actualCost - 0.2 * actualCost;
			return discPriceB;
		};
		SalesData sd1 = (int q,int pprice,NewCustomer c1) ->
		{
			int actualPrice =  q * pprice;
			System.out.println("Actual Price "+actualPrice);
			double discountedPrice = c1.calculateInvoiceAmt(q, pprice);
			System.out.println("Discounted Price for A type Customer " +discountedPrice);
		};
		sd1.processOrder(100, 1000, cust1);
		
		sd1.processOrder(100, 1000, cust12);
	
	}
	
	

	
}
