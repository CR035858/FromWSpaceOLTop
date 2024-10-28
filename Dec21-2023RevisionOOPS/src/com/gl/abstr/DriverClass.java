package com.gl.abstr;

public class DriverClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Shapes shape ; //= new Shapes();
		shape = new Rectangle();
		shape.drawShape();
		shape.displayAbstract();
		
		shape = new Triangle();
		shape.drawShape();
		shape.displayAbstract();
		

	}

}
