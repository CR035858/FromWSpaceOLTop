package com.gl.glca28may;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.ArrayList;

public class DeSerializerSample {

	ObjectInputStream ois;
	ArrayList <Employee> employees;
	public void deSerializeEmployeeObject()
	{
		try {
			ois = new ObjectInputStream(new FileInputStream("supplier.txt"));
			employees = (ArrayList<Employee>) ois.readObject();
			System.out.println("Data Serialized ");
			System.out.println(employees);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch(ClassNotFoundException cnfe)
		{
			cnfe.printStackTrace();
		}
		
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		DeSerializerSample dss = new DeSerializerSample();
		dss.deSerializeEmployeeObject();

	}

}
