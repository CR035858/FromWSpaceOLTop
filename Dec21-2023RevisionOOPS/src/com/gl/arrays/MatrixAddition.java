package com.gl.arrays;

public class MatrixAddition {

	public void addMatrix(int array1[][], int array2[][])
	{
		int resltMatr[][] = new int[2][3];
		
		for(int i=0;i<2;i++)
		{
			for(int j=0;j<3;j++)
			{
				resltMatr[i][j]= array1[i][j] + array2[i][j];
				System.out.print(resltMatr[i][j]+" ");
			}
			System.out.println();
		}
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int arr1[][] = new int[][]  {{100,200,300},{1000,2000,3000}};
		
		int arr2[][] = new int[][] {{10,20,30},{100,200,300}};
		
		MatrixAddition mat = new MatrixAddition();
		
		mat.addMatrix(arr1, arr2);

	}

}
