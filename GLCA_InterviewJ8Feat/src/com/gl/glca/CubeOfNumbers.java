package com.gl.glca;

import java.util.Arrays;
import java.util.List;

public class CubeOfNumbers {

	/*
	 * Java 8 program to perform cube on list elements and 
	 * filter numbers greater than 50.
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Print Cube Of Numbers greater than 50
		  List<Integer> integerList = Arrays.asList(4,5,6,7,1,2,3);
	       integerList.stream()
	                  .map(i -> i*i*i)
	                  .filter(i -> i>50)
	                  .forEach(System.out::println);

	}

}
