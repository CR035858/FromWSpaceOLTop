package com.gl.glca29maycol;

import java.util.Stack;

public class StackSample {

	Stack <String> myStack = new Stack<String>();
	
	public void populateStack()
	{
		myStack.push("Amarnath");
		myStack.push("Balaji");
		myStack.push("Chandu");
		myStack.push("David");
		myStack.push("Emanuel");
		myStack.push("Zeenat");
	}
	public void fetchStackUsingPop()
	{
		System.out.println("Size of Stack before Popping...."+myStack.size());
		while(myStack.isEmpty() == false)
		{
			System.out.println("Popped Element is "+myStack.pop());
		}
		System.out.println("Size of Stack after Popping...."+myStack.size());
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StackSample ss = new StackSample();
		ss.populateStack();
		ss.fetchStackUsingPop();

	}

}
