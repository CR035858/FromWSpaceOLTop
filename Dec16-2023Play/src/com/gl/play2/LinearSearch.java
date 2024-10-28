package com.gl.play2;

public class LinearSearch {

	public int linearSearch(int arr[],int key,int size )
	{
		int index = -1;
		for(int i=0;i<size;i++)
		{
			if(arr[i] == key)
			{
				index = i;
				break;
			}
		}
		return index;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] arr1 = new int[]  {10,20,30,40,50};
		LinearSearch ls = new LinearSearch();
		int found = ls.linearSearch(arr1, 60, 5);
		if(found == -1)
		{
			System.out.println("Element 40 Not found");
		}
		else
		{
			System.out.println("Element 40 found at "+(found+1));
		}
	}

}
