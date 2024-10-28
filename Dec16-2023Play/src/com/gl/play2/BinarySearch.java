package com.gl.play2;

public class BinarySearch {

	public int binarySearch(int arr[],int key,int low,int high)
	{
		
		int mid = (low + high) / 2;
		if( arr[mid] == key)
		{
			return mid;
		}
		if( low == high)
		{
			return -1;
		}
		if(arr[mid] > key)
		{
			return binarySearch(arr,key,low,mid-1);
		}
		if(arr[mid] < key)
		{
			return binarySearch(arr,key,mid+1,high);
		}
		return -1;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = new int[] {23,45,56,67,89,90};
		BinarySearch bs = new BinarySearch();
		int found = bs.binarySearch(arr, 90, 0, 5);
		if( found == -1)
		{
			System.out.println("Not Found");
		}
		else
		{
			System.out.println("found at "+(found+1));
		}

	}

}
