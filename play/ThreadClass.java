package com.gl.play;

public class ThreadClass extends Thread{
	
	public ThreadClass()
	{
		System.out.println("Child Thread :"+this);
		start();
	}
	public void run()
	{
		System.out.println("In the Child Thread...");
		System.out.println("Execution of Child Thread...");
		System.out.println("Exiting Childe Thread..");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("In main Thread");
		System.out.println("Invoking Child Thread...");
		ThreadClass tc = new ThreadClass();
		System.out.println("back In Main Thread...");
		System.out.println(" Exiting Main...");

	}

}
