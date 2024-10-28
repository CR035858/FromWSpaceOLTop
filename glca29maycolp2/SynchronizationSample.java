package com.gl.glca29maycolp2;
class MyThread
{
	public /*synchronized*/ void call()
	{
		System.out.println("Producing Goods .....");
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("Consuming Goods.....");
	}
	
}
public class SynchronizationSample implements Runnable{

	Thread t;
	MyThread mt;
	public SynchronizationSample(MyThread mt)
	{
		t = new Thread(this,"Child Thread");
		this.mt = mt;
		
	}
	@Override
	public void run() {
		// TODO Auto-generated method stub
		synchronized(mt)
		{
		
			mt.call();
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MyThread mt1 = new MyThread();
		SynchronizationSample thread1 = new SynchronizationSample(mt1);
		SynchronizationSample thread2 = new SynchronizationSample(mt1);
		thread1.t.start();
		thread2.t.start();
		

	}
	

}
