package com.gl.play3;

import java.util.Iterator;
import java.util.Stack;

public class StackSample {
	
	Stack <String> stack = new Stack<String>();
	public void populateStack()
	{
		stack.add("Alphonso");
		stack.add("Bijendra");
		stack.add("Chandu");
		stack.add("David");
		stack.add("Emanuel");
		stack.add("Florence");
	}
	public void fetchStackThruIter()
	{
		Iterator sIter = stack.iterator();
		while(sIter.hasNext())
		{
			System.out.println(sIter.next());
		}
		
	}
	public void fetchStackThruPop()
	{
		while(stack.isEmpty() == false)
		{
			System.out.println(stack.pop());
			
			System.out.println("Size after popping "+stack.size());
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		StackSample ss = new StackSample();
		ss.populateStack();
		ss.fetchStackThruPop();
	}

}
