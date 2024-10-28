package com.gl.glca27may;

public class BookShelf extends Furniture {

	int noOfShelves;
	public void bookShelfDataInit()
	{
	/*	length = 4;
		width = 3;
		height = 6;*/
		furnitureDataInit();
		super.furnitureDataInit();
		//super.height
		noOfShelves = 6;
	}
	public void displayBookShelf()
	{
		/*System.out.println("Length is "+length);
		System.out.println("Width is "+width);
		System.out.println("Height is "+height);*/
		super.displayFurniture();
		System.out.println("The No Of Book Shelves :"+noOfShelves);
	}
}
