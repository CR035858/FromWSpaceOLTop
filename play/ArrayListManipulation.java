package com.gl.play;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ArrayListManipulation {

	List <Employee> employees = new ArrayList<Employee>();
	public void addEmployee(Employee e)
	{
		employees.add(e);
	}
	public void displayEmployees()
	{
		Iterator <Employee> empIter = employees.iterator();
		while(empIter.hasNext())
		{
			Employee e = empIter.next();
			System.out.println(e);
		}
	}
	public void deleteEmployee(int id)
	{
		Iterator <Employee> empIter = employees.iterator();
		int ctr = -1;
		while(empIter.hasNext())
		{
			ctr++;
			Employee eDel = empIter.next();
			if(eDel.geteId() == id)
			{
				empIter.remove();
			}
		}
		
	}
	public void updateEmployee(int id,Employee eU)
	{
		Iterator <Employee> empIter = employees.iterator();
		int ctr = -1;
		while(empIter.hasNext())
		{
			ctr++;
			Employee eUpd = empIter.next();
			if(eUpd.geteId() == id)
			{
				empIter.remove();
				employees.add(ctr, eU);
				break;
			}
			
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayListManipulation alm = new ArrayListManipulation();
		alm.addEmployee(new Employee(1,"Harsha"));
		alm.addEmployee(new Employee(2,"Kiran"));
		alm.addEmployee(new Employee(3,"Amudha"));
		alm.addEmployee(new Employee(4,"Balaji"));
		alm.addEmployee(new Employee(5,"Sumesh"));
		alm.displayEmployees();
		System.out.println("-----------post deletion------------");
		alm.deleteEmployee(3);
		alm.displayEmployees();
		System.out.println("-----------post updation------------");
		alm.updateEmployee(2, new Employee(2,"Kiran Kumar"));
		alm.displayEmployees();
	}

}
