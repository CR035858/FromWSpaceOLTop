package com.gl.play;

public class ThreadSample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Thread t = Thread.currentThread();
		System.out.println("Current Thread "+t);
		t.setName("New Thread");
		System.out.println("Thread after Name Change " +t);

	}

}
