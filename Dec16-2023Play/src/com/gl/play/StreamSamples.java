package com.gl.play;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamSamples {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("-------------Integer Streams------------------");
		Stream <Integer> intStream = Stream.of(10,20,30,40,50,60,70);
		List <Integer> myList = intStream.collect(Collectors.toList());
		System.out.println(myList);
		
		Stream <Integer> myStream1 = Stream.of(new Integer[] {100,200,300,400,500});
		List <Integer> myList1 = myStream1.collect(Collectors.toList());
		System.out.println(myList1);
		
		List <Integer> myArList = new ArrayList<Integer>();
		for(int i=0;i<100;i++)
		{
			myArList.add(i);
		}
		System.out.println("Sequential Stream of ArrayList...");
		Stream <Integer> seqStream = myArList.stream();
		
		List <Integer> seqList = seqStream.collect(Collectors.toList());
		System.out.println(seqList);
		
		System.out.println("Parallel Stream of ArrayList");
		
		Stream <Integer> paralStream = myArList.parallelStream();
		List <Integer> parList = paralStream.collect(Collectors.toList());
		System.out.println(parList);
		
		Stream <Integer> myStream = Stream.of(90,100,70,50,60,80,75,95,62,98,81);
		Integer nums[] = {800,200,700,400,500};
		
		List <Integer> myListA = myStream.collect(Collectors.toList());
		
		Stream <Integer> myStreamA = myListA.stream();
		
		Stream myListASeqStream = myListA.stream();
		
		Stream myListAParalStream = myListA.parallelStream();
		Stream <Integer> myListASorted = myListAParalStream.sorted();
		System.out.println(myListASorted.collect(Collectors.toList()));
		List <Integer> sortedList = (List<Integer>) myListASeqStream.sorted().collect(Collectors.toList());
		
		System.out.println(sortedList);
		//System.out.println(myListASeqStream.sorted().collect(Collectors.toList()));
		Stream gtFiftySorted =sortedList
								.stream()
								.filter(num -> num >= 75);
		
		Stream gtFiftySortedEven =sortedList
				.stream()
				.filter(num -> num % 2 == 0);
			
		List <Integer> gtFiftySortedList = (List<Integer>) gtFiftySorted.collect(Collectors.toList());
		System.out.println(gtFiftySortedList);
	/*	*/System.out.println("----------------again displaying Sorted List------");
		System.out.println(gtFiftySortedList);
		System.out.println("-------even sorted");
		System.out.println(gtFiftySortedEven.collect(Collectors.toList()));
	/*	System.out.println(gtFiftySortedEven.collect(Collectors.toList()));*/
		List <String> namesList = new ArrayList();
		namesList.add("Dave");
		namesList.add("Rajesh");
		namesList.add("Kiran");
		namesList.add("Suman");
		namesList.add("Amar");
		namesList.add("Emanuel");
		
		Stream <String> namesStream = namesList.stream()
											   .map(name -> name.toUpperCase());
		List <String> namesListU = namesStream.collect(Collectors.toList());
		System.out.println(namesListU);
		
		
	}

}
