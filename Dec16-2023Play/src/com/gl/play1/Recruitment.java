package com.gl.play1;

public class Recruitment {

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
		Recruitment rc = new Recruitment();
		try
		{
			rc.checkAge(25);
			rc.checkAge(32);
			rc.checkAge(18);
		}
		catch(InvalidAgeException ie)
		{
			System.out.println(ie.message);
		}
		System.out.println("Recruitment Process Done...");

	}

}
