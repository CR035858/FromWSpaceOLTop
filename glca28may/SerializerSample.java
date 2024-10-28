package com.gl.glca28may;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.List;

public class SerializerSample {

	ObjectOutputStream ops;
	List <Employee> employees;
	
	public SerializerSample()
	{
		employees = new ArrayList<Employee>();
		employees.add(new Employee(1000,"Harsha","RTNagar",10000));
		employees.add(new Employee(1001,"Kiran","Koramangala",12000));
		employees.add(new Employee(1002,"Rajesh","Jayanagar",14000));
		employees.add(new Employee(1003,"Keerthana","Vijayanagar",16000));
		employees.add(new Employee(1004,"Mahesg","Malleswaram",18000));
	}
	
	public void serializeEmployeeObject()
	{
		//FileOutputStream fos = new FileOutputStream("supplier.txt");
		try {
			ops = new ObjectOutputStream(new FileOutputStream("supplier.txt"));
			ops.writeObject(employees);
			ops.flush();
			ops.close();
			System.out.println("We have serialized employees data");
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		SerializerSample ssamp = new SerializerSample();
		ssamp.serializeEmployeeObject();
	}

}
