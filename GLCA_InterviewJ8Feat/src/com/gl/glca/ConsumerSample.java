package com.gl.glca;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.stream.Stream;

public class ConsumerSample {

	public void whenNamesPresentUseBothConsumer(){
	    List<String> cities = Arrays.asList("Chennai", "Goa", "Bangalore", "Mumbai");

	    Consumer<List<String>> upperCaseConsumer = list -> {
	        for(int i=0; i< list.size(); i++){
	            list.set(i, list.get(i).toUpperCase());
	        }
	    };
	    Consumer<List<String>> printConsumer = list -> list.stream().forEach(System.out::println);

	    upperCaseConsumer.andThen(printConsumer).accept(cities);
	}
	public void whenNamesPresentConsumeAll()
	{

		Consumer<String> printConsumer = t -> System.out.println(t);	
	Stream<String> cities = Stream.of("Chennai", "Goa", "Bangalore", "Mumbai");	
	cities.forEach(printConsumer);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ConsumerSample cons = new ConsumerSample();
		cons.whenNamesPresentConsumeAll();
		cons.whenNamesPresentUseBothConsumer();

	}

}
