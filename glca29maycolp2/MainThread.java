package com.gl.glca29maycolp2;

public class MainThread {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Thread t = Thread.currentThread();
		System.out.println("Current Thread "+t);
		t.setName("NewMain Thread");
		System.out.println("Current Thread after name change "+t);

	}

}
