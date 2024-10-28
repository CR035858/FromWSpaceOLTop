package com.gl.glca28may;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class SampleFileReader {

	public void readFromCharStream()
	{
		int charx;
		try {
			FileReader fr = new FileReader("sample1.txt");
			while((charx = fr.read()) != -1) // eof
			{
				System.out.print((char)charx);
			}
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch(IOException ioe)
		{
			ioe.printStackTrace();
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SampleFileReader sfr = new SampleFileReader();
		System.out.println("We are reading from file thru Char Stream....");
		sfr.readFromCharStream();

	}

}
