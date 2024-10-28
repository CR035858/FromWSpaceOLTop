package com.gl.play;

public class ThreadInterf implements Runnable {

	Thread t;
	public ThreadInterf()
	{
		t = new Thread(this,"ChildThread");
		t.start();
	}
	@Override
	public void run() {
		// TODO Auto-generated method stub
	//	System.out.println("In the Child Thread...");
		//System.out.println("Execution of Child Thread...");
		for(int i=0;i<5;i++)
		{
			System.out.println("Child Thread Loop "+(i+1));
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		}
	//	System.out.println("Exiting Childe Thread..");
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("In main Thread");
		System.out.println("Invoking Child Thread...");
		
		
		ThreadInterf tc = new ThreadInterf();
		try {
			tc.t.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		for(int i=0;i<5;i++)
		{
			System.out.println("Main Thread Loop "+i);
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		System.out.println("back In Main Thread...");
		System.out.println(" Exiting Main...");

	}

	

}
