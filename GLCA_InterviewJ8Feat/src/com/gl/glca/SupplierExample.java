package com.gl.glca;

import java.sql.Date;
import java.util.Optional;
import java.util.function.BooleanSupplier;
import java.util.function.DoubleSupplier;
import java.util.function.IntSupplier;
import java.util.function.LongSupplier;
import java.util.function.Supplier;

public class SupplierExample {
	static String product = "Android";
	  static double price = 659.50;
	  public void supplier()
	  {
		  Supplier<Double> doubleSupplier1 = () -> Math.random();
		  DoubleSupplier doubleSupplier2 = Math::random;
		  System.out.println(doubleSupplier1.get());
		  System.out.println(doubleSupplier2.getAsDouble());
	  } 
	  public void supplierWithOptional()
	  {
		  Supplier<Double> doubleSupplier = () -> Math.random();
		  Optional<Double> optionalDouble = Optional.empty();
		  System.out.println(optionalDouble.orElseGet(doubleSupplier));

	  }
	  
	    public static void main(String[] args) {
	        
	        BooleanSupplier boolSupplier = () -> product.length() == 10;
	        IntSupplier intSupplier = () -> product.length() - 2;
	        DoubleSupplier doubleSupplier = () -> price -20;
	        LongSupplier longSupplier = () -> new Date(27,9,2023).getTime();
	        Supplier<String> supplier = () -> product.toUpperCase();
	        
	        
	        System.out.println(boolSupplier.getAsBoolean());//false
	        System.out.println(intSupplier.getAsInt());//5
	        System.out.println(doubleSupplier.getAsDouble());//639.5
	        System.out.println(longSupplier.getAsLong());// 1581187440978 (it depends on current time)
	        System.out.println(supplier.get());//ANDROID
	        
	        SupplierExample spax = new SupplierExample();
	        spax.supplier();
	        spax.supplierWithOptional();
	        
	    }

}
