package com.gl.arrays;

public class FloydsTriangle {

	public void displayFloydsTriangle()
	{
		int rows = 4; 
		int number = 10;
		for(int i=1;i<=rows;i++)
		{
			for(int j=1;j<=i;j++)
			{
				System.out.print(number+" ");
				number++;
			}
			System.out.println();
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FloydsTriangle ft = new FloydsTriangle();
		ft.displayFloydsTriangle();

	}

}
