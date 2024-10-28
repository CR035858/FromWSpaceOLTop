package com.gl.play1;

public class RecruitmentNew {
	
	public void callCheckAge(int age)
	{
		try
		{
			checkAge(age);
		}
		catch(InvalidAgeException iae)
		{
			System.out.println("Exception "+iae.message);
		}
	}

	public void checkAge(int age) throws InvalidAgeException
	{
		System.out.println("Checking Age for recruitment");
		if(age >= 24 && age <= 30)
		{
			System.out.println("Valid Age Further Process to Continue..");
		}
		else
		{
			throw new InvalidAgeException("Age Not Recommended...");
		}
		System.out.println("Age Check completed...");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Recruitment Process started...");
		RecruitmentNew rcn = new RecruitmentNew();
	/*	try
		{
			rc.checkAge(25);
			rc.checkAge(32);
			rc.checkAge(18);
		}
		catch(InvalidAgeException ie)
		{
			System.out.println(ie.message);
		}*/
		rcn.callCheckAge(25);
		rcn.callCheckAge(32);
		rcn.callCheckAge(18);
		System.out.println("Recruitment Process Done...");


	}

}
