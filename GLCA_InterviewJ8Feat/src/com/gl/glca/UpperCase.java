package com.gl.glca;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class UpperCase {

	/*
	 * How to use map to convert object into Uppercase in Java 8?
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 List<String> names = Arrays.asList("aa", "bb", "cc", "dd");
		 List<String> nameLst = names.stream()
                 .map(String::toUpperCase)
                 .collect(Collectors.toList());
		 System.out.println(nameLst);
	}

}
