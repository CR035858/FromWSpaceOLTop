package com.gl.sorts;

import java.util.Scanner;

public class MergeSortDriver {

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
		System.out.println("Array Elements Before Sorting.....");
		for(int x : array) // for(int i=0;i<array.length;i++) { syso array[i]} [ 15 23 1 45 65 32] x disp
		{
			System.out.print(x+" ");
		}
		System.out.println();
	
		MergeSort mergeSort = new MergeSort();
		mergeSort.sort(array, 0, array.length - 1); 
		
		System.out.println("Array Elements After Merge Sorting.....");
		for(int x : array)
		{
			System.out.print(x+" ");
		}
	}

}
