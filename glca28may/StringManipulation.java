package com.gl.glca28may;

public class StringManipulation {

	public void manipulateString()
	{
		String str1 = "Bangalore";
		String str2 = "Bangalore";
			str1 = "Mangalore";
			
		System.out.println(" str1.equals(str2) :"+str1.equals(str2));
		System.out.println("str1 == str2 "+(str1 == str2));
		System.out.println("after changing str1 to Mangalore");
		System.out.println(" str1.equals(str2) :"+str1.equals(str2));
		System.out.println("str1 == str2 "+(str1 == str2));
		str1 = "mangalore";
		
		String stra = new String("Bangalore");
		String strb = new String("Bangalore");
		System.out.println("stra.equals(strb)  :"+stra.equals(strb));
		System.out.println("stra == strb :"+(stra==strb));
		System.out.println("--------------------");
		String strc = new String("Bangalore");
		String strd = new String("Mangalore");
		System.out.println("strc.equals(strd)  :"+strc.equals(strd));
		System.out.println("strc == strd :"+(strc==strd));
		
		strc = strd;
		System.out.println("--------------------");
		System.out.println("strc.equals(strd)  :"+strc.equals(strd));
		System.out.println("strc == strd :"+(strc==strd));
		/*
		 * Objects are stored in Heap
		 * Methods & variables are stored in Stack
		 * String literals are stored in STRINGPOOL within Heap
		 */
		String str3 = new String("Hyderabad");
		System.out.println("String 3 is "+str3);
		str3 = "Coimbatore";
		System.out.println("New String is "+str3);
		String str4 = "Coimbatore";
		System.out.println("New String is "+str4);
		
		
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		StringManipulation strm = new StringManipulation();
		strm.manipulateString();
	}

}
