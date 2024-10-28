package com.gl.play;

import java.util.Scanner;

public class SampleClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int firstNumber;
		Scanner scan1 = new Scanner(System.in);
		// display "Enter a Number
		System.out.println("Enter a Number"); 
		// read firstNumber
		firstNumber  = scan1.nextInt();
		if( firstNumber > 0)
		{
			// display "The Number "+aNumber+" Is Positive " 
			System.out.println("Your Number "+firstNumber+" is Positive");
			//display "The Number is Positive "+aNumber
			System.out.println("Your Number is Positive  "+firstNumber);
		}
		else
		{
			System.out.println("Your Number "+firstNumber+" Is Negative");
		}
		
		

	}

}
