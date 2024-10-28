package com.gl.play;

import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.IntStream;

public class ProgrammerFilteringOperation {

	void filteringOperation()
	{
		IntStream.rangeClosed(1, 5)
		.filter(x -> x % 2 == 1)
		.forEach(System.out::println);
	}
	void filterProgrammers()
	{
	/*	Function <Programmer,String> getProgrammerName = p -> p.getName();
		Predicate <Programmer> isFemaleProgrammer = p -> p.isFemale(); */
		
		Programmer.programmers()
					.stream()
					.filter(Programmer::isFemale)
					.map(Programmer::getName)
					.forEach(System.out::println);
	}
	void filterMultipleProgrammers()
	{
		Function <Programmer,String> getProgrammerName = p -> p.getName();
		Predicate <Programmer> isFemaleProgrammer = p -> p.isFemale();
		Predicate <Programmer> isEarningMoreThan5000 = p -> p.getIncome() > 5000;
		Predicate <Programmer> isMaleAndEarningMoreThan5000 = p -> p.isMale() && p.getIncome() > 5000;
		
		Programmer.programmers()
					.stream()
					.filter(Programmer::isMale)
					.filter(isEarningMoreThan5000)
				//	.filter(isMaleAndEarningMoreThan5000)
					.map(Programmer::getName)
					.forEach(System.out::println);
	}
	void normalIteration()
	{
		Programmer.programmers()
					.stream()
					.filter(Programmer::isFemale)
					.forEach(System.out::println);
	}
	void operativeIteration()
	{
		List <Programmer> programmers = Programmer.programmers();
		System.out.println("Before custom Operation on the List ...\n"+programmers);
		
		//Increase Female Programmers ' Income by 10%
		
		programmers.stream()
					.filter(Programmer::isFemale)
					.forEach(x -> x.setIncome(x.getIncome() * 1.10));
		
		System.out.println("After custom operation "+programmers);
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ProgrammerFilteringOperation pfo = new ProgrammerFilteringOperation();
		pfo.filteringOperation();
		pfo.filterProgrammers();
		pfo.filterMultipleProgrammers();
		pfo.normalIteration();
		pfo.operativeIteration();

	}

}
