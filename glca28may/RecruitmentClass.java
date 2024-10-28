package com.gl.glca28may;

public class RecruitmentClass {

	public void callCheckAge(int age)
	{
		try
		{
			checkAge(age);
		}
		catch(InvalidAgeException iae)
		{
			System.out.println(iae.message);
		}
		finally
		{
			System.out.println("Close the Resource");
		}
	}
	//Proclaiming
	public void checkAge(int age) throws InvalidAgeException
	{
		System.out.println("We are in Recruitment Process...");
		System.out.println("About to Check Age...");
		if( (age < 20) || (age > 30))
		{
			/*InvalidAgeException iax = new InvalidAgeException("Sorry Age Range is 20- 30");
			throw iax;*/
			throw new InvalidAgeException("Sorry Age Range is 20- 30");
		}
		else
		{
			System.out.println("Valid Age...."+age+" Proceed with recruitment Process...");
		}
		System.out.println("Age Scrutiny Over, You can proceed with further Recruitment Process");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("We have started Recruitment process...");
		System.out.println("Checking Age");
		RecruitmentClass rc =  new RecruitmentClass();
	/*	try
		{*/
			rc.callCheckAge(25);
			rc.callCheckAge(27);
			rc.callCheckAge(35);
			rc.callCheckAge(26);
			rc.callCheckAge(24);
	/*	}
		catch(InvalidAgeException iae)
		{
			System.out.println(iae.message);
		}*/
		System.out.println("We finished Recruitment Process...");
		

	}

}
