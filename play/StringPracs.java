package com.gl.play;

public class StringPracs {

	public void StringManipulate()
	{
		String str1 = "Bangalore";
		String str2 = "Bangalore";
		System.out.println("str1.equals(str2) ....."+str1.equals(str2));
		
		System.out.println("str1 == str2 :"+(str1 == str2));
		
		String stra = new String("Bangalore");
		String strb = new String("Bangalore");
		System.out.println("stra.equals(strb) ....."+stra.equals(strb));
		System.out.println("stra == strb :"+(stra == strb));
		stra = strb;
		System.out.println("stra == strb :"+(stra == strb));
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StringPracs sp = new StringPracs();
		sp.StringManipulate();

	}

}
