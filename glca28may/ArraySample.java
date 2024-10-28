package com.gl.glca28may;

public class ArraySample {

	public void manipulateArray()
	{
		int arr1[] = {100,200,300,400,500};
		System.out.println("We are in Array Manipulation...");
		try
		{
			for(int i=0;i<6;i++)
			{
				System.out.println(arr1[i]+" ");
			}
		}
		catch(ArrayIndexOutOfBoundsException aie)
		{
			System.out.println(aie.getMessage());
			aie.printStackTrace();
		}
		System.out.println("We Completed Array Manipulation....");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArraySample ars = new ArraySample();
		ars.manipulateArray();
	}

}
