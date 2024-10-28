package com.gl.arrays;

public class ArrayManipulation {

	public double calculateSumAndAverageOfArrayElements(int[] array1)
	{
		int sum = 0;
		for(int i=0;i<array1.length;i++)
		{
			sum = sum + array1[i];
		}
		System.out.println("The Sum is "+sum);
		double average = sum / array1.length;
		return average;
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int sampleArr[] = new int[] {10,20,30,40,50,60,70};
		ArrayManipulation am = new ArrayManipulation();
		double arrayAvg = am.calculateSumAndAverageOfArrayElements(sampleArr);
		System.out.println("The Average of the Array Elements :"+arrayAvg);
		

	}

}
