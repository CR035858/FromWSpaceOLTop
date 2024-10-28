package com.gl.sorts;

import java.util.Scanner;

public class MainQuickSorter {

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
		
		int low = 0;
		int high = array.length;
		QuickSorter.quickSort(array, low, high-1);

		System.out.println("the Array after Quick sorting is ");
		for (int i = 0; i < size; i++) {
			System.out.print(array[i] + " ");
		}
		System.out.println();

	}

}
