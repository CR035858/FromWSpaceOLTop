package com.gl.play;
class Supplier
{
	int id;
	String supplierName;
	
	public void initSupplier()
	{
		id = 1000;
		supplierName = "Harsha";
	}
	public void display()
	{
		System.out.println("Supplier Id "+id+" and Name is "+supplierName);
	}
}
public class SampleException {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Supplier supplier = null;
		supplier.display();
	}

}
