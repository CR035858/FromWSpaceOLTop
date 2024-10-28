package com.gl.glca;

import java.util.function.Predicate;

public class PredicateSample2 {

	public static Predicate<String> hasGotLengthOf10 = new Predicate<String>() {
        @Override
        public boolean test(String t)
        {
            return t.length() > 10;
        }
    };
     public static void my_predicate_or()
    {
  	  Predicate<String> containsLetterA = p -> p.contains("A");
        String containsA = "AndAll";
        boolean outcome1 =hasGotLengthOf10.or(containsLetterA).test(containsA);
        boolean outcome2 =hasGotLengthOf10.and(containsLetterA).test(containsA);
        System.out.println(outcome1);
        System.out.println(outcome2);
    }
    public static void main(String[] args)
    {
    my_predicate_or();
    }

}
