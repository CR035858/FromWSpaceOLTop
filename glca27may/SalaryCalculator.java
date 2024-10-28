package com.gl.glca27may;

public class SalaryCalculator {
	
	public void calculateSalary(double basic,double hra,double cca)
	{
		double grossSalary = basic + hra + cca;
		System.out.println("The Gross Salary without allowance is "+grossSalary);
	}
	/*public int calculateSalary(double basic,double hra,double cca)
	{
		double grossSalary = basic + hra + cca;
		System.out.println("The Gross Salary without allowance is "+grossSalary);
	}*/
	public void calculateSalary(double basic,double hra,double cca,double allowance,double deduction)
	{
		double  grossSalary = basic + hra + cca + allowance;
		double nettSalary = grossSalary - deduction;
		System.out.println("The Gross salary with allowance "+grossSalary);
		System.out.println("The Nett salary with allowance "+nettSalary);
	}
	public void calculateSalary(double basic,double hra,double cca,double allowance,double deduction,String employeeName)
	{
		double  grossSalary = basic + hra + cca + allowance;
		double nettSalary = grossSalary - deduction;
		System.out.println("The Gross Salary of "+employeeName+" is "+grossSalary+" and the Nett salary is "+nettSalary);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SalaryCalculator sCal = new SalaryCalculator();
		//sCal.calculateSalary(1000.0d, 350, 375,"Harsha");
		sCal.calculateSalary(1000.0d, 350, 375,435,175);
		sCal.calculateSalary(1000.0d, 350, 375,435,175,"Suresh ");
	}

}
