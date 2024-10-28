package com.gl.glca29maycolp2;

public class RunnableSampleThread implements Runnable{
	
	Thread t;
	public RunnableSampleThread()
	{
		t = new Thread(this,"Child Thread");
		t.start();
	}
	@Override
	public void run() {
		// TODO Auto-generated method stub
		System.out.println("Entering Child Thread...");
		System.out.println("Child Thread "+t);
		System.out.println("Executing Child Thread....");
		System.out.println("Exiting Child Thread...."); // SLEEP SUSPENDED [NOT RUNNABLE]
	
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("In The Main Thread.......");
		System.out.println("About to Invoke Child Thread.....");
		RunnableSampleThread rst = new RunnableSampleThread(); //UNSTARTED
		//tcs.start
		System.out.println("Back in the Main Thread.....");
		System.out.println("exiting Main Thread....");
	}

	

}
