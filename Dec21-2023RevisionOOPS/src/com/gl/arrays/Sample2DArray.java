package com.gl.arrays;

import java.util.Scanner;

public class Sample2DArray {

	Scanner scan1 = new Scanner(System.in);
	public void manip2DArray()
	{
		int[][] scores = new int[3][4];
		for(int i=0;i<3;i++)
		{
			System.out.println("Accepting Student "+(i+1)+" Score");
			for(int j=0;j<4;j++)
			{
				System.out.println("Enter "+(j+1)+" Subject Score ");
				scores[i][j] = scan1.nextInt();
			}
		}
		
		System.out.println("Displaying Student Scores..");
		for(int i=0;i<3;i++)
		{
			System.out.println("Student "+(i+1)+" Score ..");
			for(int j=0;j<4;j++)
			{
				System.out.print(scores[i][j]+" ");
			}
			System.out.println("-------");
		}
		
	}
	
	public void manip2DStrArray()
	{
		String[][] states = new String[][] {{"Kar","TN","KER","AP"},{"MAH","GUJ","RAJ","GOA"},{"WBE","ORIS","MEGH","ASSM"}};
		
		int[][] matrix = new int[][] {{10,20,30},{100,200,300},{1000,2000,3000},{10000,20000,30000}};
		
		System.out.println("The String ARray Elements ");
		for(int i=0;i<3;i++)
		{
			for(int j=0;j<states[i].length;j++)
			{
				System.out.print(states[i][j]+" ");
			}
			System.out.println("---------");
		}
		System.out.println("The Integer ARray Elements ");
		for(int i=0;i<4;i++)
		{
			for(int j=0;j<matrix[i].length;j++)
			{
				System.out.print(matrix[i][j]+" ");
			}
			System.out.println("---------");
		}
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Sample2DArray s2d = new Sample2DArray();
	//	s2d.manip2DArray();
		s2d.manip2DStrArray();

	}

}
