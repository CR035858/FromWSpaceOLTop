package com.gl.sorts;

public class BubbleSorterNew {
	public void bubbleSort(int [] array,int size)
	{
		for(int i=0;i<size-1;i++)
		{
			for(int j=0;j<size-1;j++)
			{
				if(array[j] > array[j+1])
				{
					int temp;
					temp = array[j];
					array[j] = array[j+1];
					array[j+1] = temp;
				}
			}
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int arr[] = new int[] {30,20,90,10,70,40,80,50,60};
		int size = arr.length;
		BubbleSorterNew bs = new BubbleSorterNew();
		bs.bubbleSort(arr,size);
		
		for(int i : arr)
		{
			System.out.print(i+" ");
		}
	}


}
