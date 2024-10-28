package com.gl.glca28may;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class SampleFileWriter {

	FileWriter fw;
	String str = new String("We are writing to Char Stream based file");
	public void writeToCharStream()
	{
		try {
			
			fw = new FileWriter("sample1.txt");
			fw.write(str);
			fw.flush();
			fw.close();
			System.out.println("We have written onto output character stream...");
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		SampleFileWriter sfw = new SampleFileWriter();
		sfw.writeToCharStream();
		
	
	}

}
