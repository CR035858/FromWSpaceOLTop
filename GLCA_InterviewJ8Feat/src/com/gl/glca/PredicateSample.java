package com.gl.glca;

import java.util.function.Predicate;

public class PredicateSample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Predicate <Integer> biggerThanTen = (i) -> i > 10;
		  
        // Creating predicate
        Predicate<Integer> smallerThanTwenty = (i) -> i < 20; 
        boolean resultOne = biggerThanTen.and(smallerThanTwenty).test(15);
        System.out.println(resultOne);
  
        // Calling Predicate method
        boolean resultTwo = biggerThanTen.and(smallerThanTwenty).negate().test(15);
        System.out.println(resultTwo);

	}

}
