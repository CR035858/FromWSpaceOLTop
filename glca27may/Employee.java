package com.gl.glca27may;

public class Employee {

	String empName;
	String empAddress;
	String empCity;
	
	public Employee()
	{
		empName = "Harsha";
		empAddress = "RTNagar";
		empCity = "Bangalore";
		
	}
	
/*	public Employee(String emplName,String emplAddress,String emplCity)
	{
		empName = emplName;
		empAddress = emplAddress;
		empCity = emplCity;
	}*/
	// MIRRORING
	public Employee(String empName,String empAddress,String empCity)
	{
		this.empName = empName;
		this.empAddress = empAddress;
		this.empCity = empCity;
	}
	
	public void displayEmployeeDetails()
	{
		System.out.println("Employee Details");
		System.out.println("Employee Name "+empName);
		System.out.println("Employee Address "+empAddress);
		System.out.println("Employee City "+empCity);
	}
	public static void main(String[] args)
	{
		Employee e1 = new Employee();
		e1.displayEmployeeDetails();
		
		Employee e2 = new Employee("Kiran","Jayanagar","Mangalore");
		e2.displayEmployeeDetails();
	}
}
