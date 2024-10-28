package com.gl.play;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class UnderstandingStreams {

	public void functional()
	{
		List <Integer> numbers = Arrays.asList(1,2,3,4,5,6,7,8,9,10);
		
		Stream <Integer> numStream = numbers.stream();
		
		Stream <Integer> evenNumStream =  numStream.filter(num -> num % 2 == 0);
		System.out.println("Even Number Stream Numbers.....");
		System.out.println(evenNumStream.collect(Collectors.toList()));
		
		int evenNumSum =  numbers.stream().filter(num -> num % 2 == 0).reduce(0, (x,y)-> x+y);

		System.out.println("Sum of Even Numbers "+evenNumSum);
		
		System.out.println("Squared  Number Stream Numbers.....");
		Stream <Integer> squaredNumStream = numbers.stream().map(num -> num * num);
		
		int sqrNumSum = squaredNumStream.reduce(0, (x,y)->x+y);
		System.out.println("Sum of Squared Numbers "+sqrNumSum);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		UnderstandingStreams uss = new UnderstandingStreams();
		uss.functional();
	}

}
