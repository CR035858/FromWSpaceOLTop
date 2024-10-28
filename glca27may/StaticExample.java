package com.gl.glca27may;

public class StaticExample {
	
	int nonStaticVar;
	static int staticVar;
	/*
	 * static methods can access only static variables
	 * Non static methods can access static as well as non static variable
	 */
	public static void staticMethod1()
	{
		staticVar++;
		System.out.println("Static Variable in StaticMethod1  :"+staticVar);
		
	}
	public void nonStaticMethod1()
	{
		staticVar++;
		nonStaticVar++;
		System.out.println("Static Variable in Non StaticMethod1  :"+staticVar);
		System.out.println("Non Static Variable in Non StaticMethod1  :"+nonStaticVar);
		
	}
	public static void staticMethod2()
	{
		staticVar++;
		//nonStaticVar++;
		System.out.println("Static Variable in StaticMethod2  :"+staticVar);
	}
	public void nonStaticMethod2()
	{
		staticVar++;
		nonStaticVar++;
		System.out.println("Static Variable in Non StaticMethod2  :"+staticVar);
		System.out.println("Non Static Variable in Non StaticMethod2  :"+nonStaticVar);
	}
	
	public static void main(String[] args)
	{
		StaticExample static1Obj = new StaticExample();
		StaticExample.staticMethod1();
		static1Obj.nonStaticMethod1();
		static1Obj.nonStaticMethod2();
		
		StaticExample static2Obj = new StaticExample();
		StaticExample.staticMethod2();
		static2Obj.nonStaticMethod1();
		static2Obj.nonStaticMethod2();
		
	}

}
