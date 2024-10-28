package com.gl.sorts;

import java.util.Scanner;

public class MainBinarySearcherModified {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("Enter the size of array");
		Scanner sc = new Scanner(System.in);
		int size = sc.nextInt();
		System.out.println("enter the " + size + " elements");
		int array[] = new int[size];
		
		for (int i = 0; i < size; i++) {
			array[i] = sc.nextInt();
		}
		
		System.out.println("enter the key ");
		int key = sc.nextInt();
		ModifiedBinarySearch pivotedBinarySearch = new ModifiedBinarySearch();
		int index = pivotedBinarySearch.pivotedBinarySearch(array, array.length, key);
		if( index != -1)
		{
			System.out.println("key is present at index :" + index);
		}
		else
		{
			System.out.println("Key Is Not Present...");
		}

	}

}
