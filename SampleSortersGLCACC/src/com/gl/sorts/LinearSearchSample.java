package com.gl.sorts;

public class LinearSearchSample {
	public int linearSearch(int[] array, int key)
	{
		for(int i=0;i<array.length-1;i++)
		{
			if(array[i] == key)
			{
				return i;
			}
		}
		return -1;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinearSearchSample lss = new LinearSearchSample();
		int arr[] = {234,123,456,345,234,765};
		int key = 234;
		int indexFound = lss.linearSearch(arr, key);
		if(indexFound != -1)
		{
			System.out.println("Element "+key+" Found at Index "+indexFound);
		}
		else
		{
			System.out.println("Element "+key+" Not Found");
			
		}
	}

}
