package com.gl.dsa;

import java.util.Scanner;

public class ArraySample {

	public static void main(String[] args)
	{
		int[] priceOfPen= new int[5];
		System.out.println("Enter The Prices for 5 Pens..");
		Scanner in=new Scanner(System.in);
			for(int i=0;i<priceOfPen.length;i++)
				priceOfPen[i]=in.nextInt();
			System.out.println("The Prices are....");
			for(int j=0;j<priceOfPen.length;j++)
				System.out.print(priceOfPen[j]+" ");
}

}
