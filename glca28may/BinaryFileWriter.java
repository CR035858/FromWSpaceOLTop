package com.gl.glca28may;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class BinaryFileWriter {

	FileOutputStream fos;
	FileInputStream fis;
	String str = new String("we are writing to Binary file");
	public void writeToBinaryStream()
	{
		try {
			byte[] mybytes = str.getBytes();
			fos = new FileOutputStream("customer");
			fos.write(mybytes);
			fos.flush();
			fos.close();
			System.out.println("We have written into binary stream....");
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch(IOException ioe)
		{
			ioe.printStackTrace();
		}
	}
	public void readFromBinaryStream()
	{
		byte[] readBytes = new byte[200];
		
		try {
			fis = new FileInputStream("customer");
			fis.read(readBytes);
			String strRead = new String(readBytes);
			System.out.println("The Data Read "+strRead);
			
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
		BinaryFileWriter bfw = new BinaryFileWriter();
		//bfw.writeToBinaryStream();
		bfw.readFromBinaryStream();
	}

}
