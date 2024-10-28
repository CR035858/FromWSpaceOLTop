package com.gl.play2;

public class BubbleSorter {

	public void bubbleSort(int arr[])
	{
		for(int i=0;i<arr.length-1;i++)
		{
			for(int j=0;j<arr.length-1;j++)
			{
				if(arr[j] > arr[j+1])
				{
					int temp;
					temp = arr[j];
					arr[j]=arr[j+1];
					arr[j+1]=temp;
				}
			}
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
			BubbleSorter bs = new BubbleSorter();
			int arr[] = new int[] {34,12,23,8,19,17};
			bs.bubbleSort(arr);
			for(int i:arr)
			{
				System.out.print(i+" ");
			}
	}

}
