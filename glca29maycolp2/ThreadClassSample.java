package com.gl.glca29maycolp2;

public class ThreadClassSample extends Thread {

	public ThreadClassSample()
	{
		System.out.println("Child Thread "+this);
		start();
	}
	public void run() // RUNNABLE 
	{
		System.out.println("Entering Child Thread...");
		System.out.println("Executing Child Thread....");
		System.out.println("Exiting Child Thread...."); // SLEEP SUSPENDED [NOT RUNNABLE]
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("In The Main Thread.......");
		System.out.println("About to Invoke Child Thread.....");
		ThreadClassSample tcs = new ThreadClassSample(); //UNSTARTED
		//tcs.start
		System.out.println("Back in the Main Thread.....");
		System.out.println("exiting Main Thread....");
		
		
	}

}
