package com.gl.glca29maycol;

import java.util.HashSet;
import java.util.Iterator;
import java.util.TreeSet;

public class HashTreeSetSample {
	
	HashSet <String> hashSet = new HashSet<String>();
	TreeSet <String> treeSet = new TreeSet<String>();
	public void populateHashSet()
	{
		hashSet.add("Faridabad");
		hashSet.add("Ernakulam");
		hashSet.add("Mangalore");
		hashSet.add("Ernakulam");
		hashSet.add("Bangalore");
		hashSet.add("Mumbai");
		hashSet.add("Calcutta");
		
	}
	public void populateTreeSet()
	{
		treeSet.add("Faridabad");
		treeSet.add("Ernakulam");
		treeSet.add("Mangalore");
		treeSet.add("Ernakulam");
		treeSet.add("Bangalore");
		treeSet.add("Mumbai");
		treeSet.add("Calcutta");
	}
	public void fetchHashSetObjects()
	{
		Iterator <String> hSetIter = hashSet.iterator();
		while(hSetIter.hasNext())
		{
			System.out.println("The HashSet Object is "+hSetIter.next());
			
		}
	}
	public void fetchTreeSetObjects()
	{
		Iterator <String> tSetIter = treeSet.iterator();
		while(tSetIter.hasNext())
		{
			System.out.println("The TreeSet Object is "+tSetIter.next());
			
		}
	}
	
	public static void main(String[] args)
	{
		HashTreeSetSample hts = new HashTreeSetSample();
		System.out.println("------------HashSet Objects-------------");
		hts.populateHashSet();
		hts.fetchHashSetObjects();
		System.out.println("------------TreeSet Objects-------------");
		hts.populateTreeSet();
		hts.fetchTreeSetObjects();
	}

}
