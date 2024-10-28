package com.gl.play;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class ReUsingStreams {

	// Sum of squares of Odd numbers from 1 to 10
	
	static private boolean oddNumber(int number)
	{
		System.out.println("Odd Number called for "+number);
		return number % 2 == 1;
	}
	
	static private int square(int number)
	{
		System.out.println("Square called for "+number);
		return number * number;
	}
	static private int sum(int number1,int number2)
	{
		System.out.println("Sum called for Number1 "+number1+" And Number2 "+number2);
		return number1 + number2;
	}
	public void functional()
	{
		List <Integer> numbers = Arrays.asList(1,2,3,4,5,6,7,8,9,10);
		Stream <Integer> stream = numbers.stream()
									.filter(ReUsingStreams::oddNumber);
									/*.map(ReUsingStreams::square);*/
		Stream <Integer> stream1 = stream.map(ReUsingStreams::square);
		System.out.println("Again mapping");
	/*	Stream <Integer> stream2 = stream.map(ReUsingStreams::square);*/
		
		int sum = 0;
		sum = stream1.reduce(0, ReUsingStreams::sum); // Eager Operations
		System.out.println("Sum of odd Integers "+sum);
		
		sum = stream1.reduce(0, ReUsingStreams::sum); // Throws IllegalStateException

		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ReUsingStreams ris = new ReUsingStreams();
		ris.functional();

	}

}
