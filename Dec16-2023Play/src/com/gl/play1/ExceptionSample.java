package com.gl.play1;

public class ExceptionSample {

	public void findSum(int[] arr)
	{
		int sum = 0;
		for(int i=0;i<=arr.length;i++)
		{
			sum += arr[i];
			System.out.println("Sum is "+sum);
		}
		System.out.println("final Sum is "+sum);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("We are in the Main method.....");
		int arr[] = new int[] {10,20,30,40,50,60};
		ExceptionSample es = new ExceptionSample();
		try
		{
			es.findSum(arr);
		}
		catch(ArrayIndexOutOfBoundsException ae)
		{
			ae.printStackTrace();
		}
		System.out.println("We are exiting Main...");
	}

}
