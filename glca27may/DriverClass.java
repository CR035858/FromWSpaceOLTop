package com.gl.glca27may;

public class DriverClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Shapes sh = new Shapes();
		Shapes sh;
		sh = new Rectangle();
		sh.draw();
		sh.paint();
		
		sh = new Triangle();
		sh.draw();
		
		DerivedClass dc = new DerivedClass();
		dc.displayBase();
		dc.displayDerived();
	}

}
