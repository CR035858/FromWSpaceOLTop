package com.gl.sorts;

public class BinarySearch {

	int mid;
	public int bin_search(int arr[] , int key, int low , int high)
	{
		mid = (low + high) / 2 ; //[23,45,67,89,90] mid -- 4/2   2  67 == 67  [4]
		if( arr[mid] == key)
		{
			return mid;
		}
		if(low == high)  
		{
			return -1;
		}
		if( arr[mid] > key)
		
			return bin_search(arr, key,low,mid-1);

		if(arr[mid] < key)
			return bin_search(arr,key,mid+1,high);
		return -1;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int arr[] = new int[] {23,45,67,89,90};
		
		BinarySearch bs = new BinarySearch();
		int key = 145;
		int pos = bs.bin_search(arr,key,0,4);
		System.out.println("Index starts from 0");
		if(pos != -1)
		{
			System.out.println("Element found at "+pos);
		}
		else
		{
			System.out.println("Element Not found");
		}
		

	}

}
