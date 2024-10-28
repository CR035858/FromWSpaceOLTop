package com.gl.glca28may;

public class ExceptionSample {

	public void callCalculate(int a,int b)
	{
		try
		{
			calculate(a,b);
		}
		catch(ArithmeticException ae)
		{
			ae.printStackTrace();
		}
	}
	public void calculate(int num1,int num2)
	{
		int result;
		System.out.println("We are about to perform arith metic Calculation...");
		result = num1 / num2;
		System.out.println("The Result is "+result);
		System.out.println("We finished arithmetic Calculation");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ExceptionSample ecs = new ExceptionSample();
		System.out.println("We are about to perform arith metic Calculation...");
	/*	try
		{ */
			ecs.callCalculate(20, 5);
			ecs.callCalculate(120, 5);
			ecs.callCalculate(100, 0);
			ecs.callCalculate(120, 4);
			ecs.callCalculate(80, 5);
	/*	}
		catch(ArithmeticException ae)
		{
			//System.out.println(ae.getMessage());
			ae.printStackTrace();
		}*/
		System.out.println("We finished arithmetic Calculation");

	}

}
