package com.gl.sorts;

public class QuickSorter {

	//A utility function to swap two elements
		static void swap(int[] arr, int i, int j) {
			int temp = arr[i];
			arr[i] = arr[j];
			arr[j] = temp;
		}
		static int partition(int[] arr, int low, int high) {

			// pivot
			int pivot = arr[high];

			// Index of smaller element		
			int i = (low - 1);

			for (int j = low; j <= high - 1; j++) {

				// If current element is smaller than the pivot
				if (arr[j] < pivot) {

					// Increment index of smaller element
					i++;
					//System.out.println("i is "+i);
					swap(arr, i, j);
					//System.out.println("Print in Partition");
					//printArray(arr,arr.length);
				}
			}
			swap(arr, i + 1, high);
			return (i + 1);
		}
		
		static void quickSort(int[] arr, int low, int high) {
			if (low < high) {

				// p_index is partitioning index, arr[p]
				int p_index = partition(arr, low, high);
			//	printArray(arr,arr.length);
				// Separately sort elements before partition and after partition
				quickSort(arr, low, p_index - 1);
				quickSort(arr, p_index + 1, high);
			}
		}

		//Function to print an array 
		static void printArray(int[] arr, int size) {
			for (int i = 0; i < size; i++)
				System.out.print(arr[i] + " ");

			System.out.println();
		}




	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] arr = { 5 , 75, 25, 85, 35, 45, 65};
		int n = arr.length;

		quickSort(arr, 0, n - 1);
		System.out.println("Sorted array: ");
		printArray(arr, n);


	}

}
