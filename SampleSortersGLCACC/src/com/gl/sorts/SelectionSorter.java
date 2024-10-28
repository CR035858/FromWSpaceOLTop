package com.gl.sorts;

public class SelectionSorter {
	
	void selectionSort(int sortArr[])
    {
        int n = sortArr.length; // length = 6
 
        // One by one move the lowest to left
        for (int i = 0; i < n-1; i++) 					
        {												
            // Find the minimum element in unsorted array 
            int minIndex = i;							
            for (int j = i+1; j < n; j++)						
                if (sortArr[j] < sortArr[minIndex])		
                	minIndex = j;						
            											
            // Swap the minimum element found with the current first element
          
            int temp = sortArr[minIndex];
            sortArr[minIndex] = sortArr[i];
            sortArr[i] = temp;
        }
    }
 // Printing the array
	void printArray(int sarr[])
	{
	    int n = sarr.length;
	    for (int i=0; i<n; ++i)
	        System.out.print(sarr[i]+" ");
	    System.out.println();
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SelectionSorter sSorter = new SelectionSorter();
	    int arrsel[] = {89,23,45,11,76,34};// 11 [23 45 89 76 34]
	    sSorter.selectionSort(arrsel);
	    System.out.println("Selection Sorted array Elements Are...");
	    sSorter.printArray(arrsel);
	}


}
