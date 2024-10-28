package com.gl.glca29maycolp2;

public class SampleThreadJoin implements Runnable{
	Thread t;
	public SampleThreadJoin()
	{
		t = new Thread(this,"Child Thread");
		t.start();
	}
	@Override
	public void run() {
		// TODO Auto-generated method stub
		System.out.println("Child Thread "+t+" Started ");
		for(int i=0;i<5;i++)
		{
			System.out.println("Child Thread Loop "+i);
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(" Main Thread Started");
		System.out.println("About to Start Child Thread....");
		SampleThreadJoin stj = new SampleThreadJoin();
		System.out.println("Is Child Thread alive "+stj.t.isAlive());
		try {
			stj.t.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("Is Child Thread Still alive  "+stj.t.isAlive());
		for(int i=0;i<5;i++)
		{
			System.out.println(" Main Thread Loop "+i);
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
		System.out.println("Back In Main Thread ");
		System.out.println("Exiting Child Thread...");
		

	}

	

}
