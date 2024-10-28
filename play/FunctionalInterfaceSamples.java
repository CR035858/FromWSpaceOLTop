package com.gl.play;
interface MyInterface1
{
	public void display();
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
	public void processOrder(int qty,int price,NewCustomer nc);
}
public class FunctionalInterfaceSamples {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MyInterface1 inter1 = () -> {
			System.out.println("Welcome to Functional Interfaces");
		};
		inter1.display();
		
		MyInterface2 inter2 = (int qty,int ppunit) -> {
			int invoiceAmt = qty * ppunit;
			System.out.println("Invoice Amt is "+invoiceAmt);
			if(invoiceAmt > 20000)
			{
				System.out.println("Good Purchase");
			}
			else
			{
				System.out.println("Average Purchase");
			}
		};
		inter2.calculate(20, 2000);
		
		Customer c1 =(int q,int p) -> {
			int invAmt = q * p;
			System.out.println("invoice Amt "+invAmt);
		};
		c1.calculateInvoiceAmt(100, 1000);

		NewCustomer nc1 = (int p,int q) ->{
			int invAmt = p * q;
			return invAmt - (0.1 * invAmt);
		};
		
		NewCustomer nc2 = (int p,int q) ->{
			int invAmt = p * q;
			return invAmt - (0.2 * invAmt);
		};
		
		SalesData sd1 = (int p,int q,NewCustomer nca) ->
		{
			int actualInvAmt = p * q;
			double discountedInvAmt = nca.calculateInvoiceAmt(p, q);
			System.out.println("Actual Inv Amt "+actualInvAmt);
			System.out.println("Discuounted Inv Amt "+discountedInvAmt);
		};
		
		SalesData sd2 = (int p,int q,NewCustomer ncb) ->
		{
			int actualInvAmt = p *q;
			double discountedinvAmt = ncb.calculateInvoiceAmt(p, q);
			System.out.println("Actual Inv Amt "+actualInvAmt);
			System.out.println("Discuounted Inv Amt "+discountedinvAmt);
		};
		
		sd1.processOrder(100, 250, nc1);
		sd1.processOrder(100, 250, nc2);
	}

}
