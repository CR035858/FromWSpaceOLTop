package com.gl.glca28may;

public class StringBufferSample {

	public void manipulateString()
	{
		StringBuffer sbr1 = new StringBuffer("Welcome to StringBuffer");
		System.out.println(" Original String is "+sbr1);
		System.out.println("Length is "+sbr1.length());
		sbr1.append('A');
		System.out.println(" Modified String is "+sbr1);
		System.out.println("Length is "+sbr1.length());
		sbr1.insert(7, 'X');
		System.out.println(" Modified String is "+sbr1);
		
		System.out.println("-----------------String Builder---------------");
		StringBuilder sblr1 = new StringBuilder("Welcome to StringBuilder");
		System.out.println(" Original StringBuilder is "+sblr1);
		System.out.println("Length is "+sblr1.length());
		sblr1.append('A');
		System.out.println(" Modified StringBuilder is "+sblr1);
		System.out.println("Length is "+sblr1.length());
		sblr1.insert(7, 'X');
		System.out.println(" Modified StringBuilder is "+sblr1);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StringBufferSample sbs = new StringBufferSample();
		sbs.manipulateString();

	}

}
