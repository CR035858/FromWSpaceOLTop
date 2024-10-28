package com.gl.sorts;

import java.util.Scanner;

public class MainMergeSorter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("Enter the size of array");
		Scanner sc = new Scanner(System.in);
		int size = sc.nextInt();
		System.out.println("enter the " + size + " elements");
		int array[] = new int[size];
		//15 5 24 8 1 3 16 10 20
		for (int i = 0; i < size; i++) {
			array[i] = sc.nextInt();
		}
		
		MergeSort mergeSort = new MergeSort();
		mergeSort.sort(array, 0, array.length - 1);
		for(int i : array)
		{
			System.out.println(i);
		}
	}

}
