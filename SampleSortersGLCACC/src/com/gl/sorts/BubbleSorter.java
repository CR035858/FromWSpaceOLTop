package com.gl.sorts;

public class BubbleSorter {
	
	 public void bubbleSort(int arr[]) {
		    int n = arr.length;				//	[0    1  2  3 ]
		    for (int i = 0; i < n-1; i++) 	 // [ 20,40,12,36]
		    {								//	[20,40,12 ]
		    	// for (int j =0; j < n-i-1; j++)  // i = 0 -> j -[0 - 4]
		      for (int j =0; j < n-1; j++)    // i = 1  -> j -[0 - 3    
		      {
		        if (arr[j] > arr[j+1]) 
		        {
		          int temp = arr[j]; // BREAK upto 20.14
		          arr[j] = arr[j+1];
		          arr[j+1] = temp;
		        }
		      }
		    }
		  }

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int arr[] = new int[] {33,54,12,67,90,54,5,120};
		BubbleSorter bs = new BubbleSorter();
		bs.bubbleSort(arr);
		for(int i : arr)
		{
			System.out.print(i+" ");
		}
	}

}
