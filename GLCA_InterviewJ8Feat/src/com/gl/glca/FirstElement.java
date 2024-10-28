package com.gl.glca;

import java.util.Arrays;
import java.util.List;

public class FirstElement {

	/*
	 * Given the list of integers, 
	 * find the first element of the list using Stream functions?
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 List<Integer> myList = Arrays.asList(10,15,8,49,25,98,98,32,15);
         myList.stream()
               .findFirst()
               .ifPresent(System.out::println);

	}

}
