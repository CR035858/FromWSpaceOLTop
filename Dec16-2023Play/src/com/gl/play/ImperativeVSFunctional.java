package com.gl.play;

import java.util.Arrays;
import java.util.List;

public class ImperativeVSFunctional {

	public void imperative()
	{
		List <Integer> numbers = Arrays.asList(1,2,3,4,5);
		int sum = 0;
		for(int n: numbers)
		{
			if( n % 2 == 1)
			{
				int square = n * n;
				sum += square;
			}
		}
		System.out.println("Imperative : Sum of Odd Integers "+sum);
	}
	public void functional()
	{
		List <Integer> numbers = Arrays.asList(1,2,3,4,5);
				
		int sum = numbers.stream()
					.filter(x -> x % 2 == 1)
					.map(x -> x * x)
					.reduce(0,(x,y) -> x+y);
		System.out.println("Imperative : Sum of Odd Integers "+sum);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ImperativeVSFunctional ivf = new ImperativeVSFunctional();
		ivf.functional();
		ivf.imperative();
	}

}
