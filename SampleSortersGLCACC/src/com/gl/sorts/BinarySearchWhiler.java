package com.gl.sorts;

import java.util.Scanner;

public class BinarySearchWhiler {

	public int NUM_ELEMENTS, value, l, r, mid;
	public int array[];
	Scanner sc = new Scanner(System.in);
	public void implementationOfBinarySearch() 
	{
		System.out.println("Enter the number of elements you want to search in:");
		NUM_ELEMENTS = sc.nextInt();
		array = new int[NUM_ELEMENTS];
		System.out.println("Enter the elements now.");
		insertValues();
		System.out.println("Enter the search value: ");
		value = sc.nextInt();
		searchValue();
	}
	public void insertValues() 
	{
		for (int i = 0; i < NUM_ELEMENTS; i++) 
		{
			System.out.print("Enter element at position " +i + ": ");
			array[i] = sc.nextInt();
		}
	}
	public void searchValue() 
	{
		l = 0;
		r = array.length - 1; // 4 for 5 elements
		
		mid = l + (r - l) / 2; // 0 + ( 4 - 0) / 2 --> 2
		while (l <= r) 
		{
			if (value < array[mid]) 
			{
				// range is l to mid-1
				r = mid - 1;
			}
			else if (value > array[mid]) 
			{// range is mid+1 to r
				l = mid + 1;
			}
			else 
			{
				System.out.println("Search value " + value + "found atindex: " + mid);
				break;
			}
			mid = l + (r - l) / 2;
		}
			if (l > r) 
			{
				System.out.println("Value not found");
			}
		}

	
	public static void main(String[] args) 
	{
		BinarySearchWhiler binarysearcher = new BinarySearchWhiler();
		binarysearcher.implementationOfBinarySearch();
	}
}


