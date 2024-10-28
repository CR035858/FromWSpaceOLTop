package com.gl.glca28maycol;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ArrayListCrud {

	ArrayList <Employee> employees = new ArrayList<Employee>();
	public void addEmployee(Employee employee)
	{
		employees.add(employee);
	}
	public List <Employee> getAllEmployees()
	{
		return employees;
	}
	public Employee getEmployeeById(int eId)
	{
		return employees.get(eId);
	}
	public Employee getEmployeByOriginalId(int id)
	{
		Iterator <Employee> empIter = employees.iterator();
		while(empIter.hasNext())
		{
			Employee empl = empIter.next();
			if(empl.getId() == id)
			{
				return empl;				
			}
		}
		return null;
	}
	public void deleteEmployeeById(int id)
	{
		Iterator <Employee> empIter = employees.iterator();
		int ctr = -1;
		while(empIter.hasNext())
		{
			ctr++;
			Employee employee = empIter.next();
			if(employee.getId() == id)
			{
				empIter.remove();
			}
		}
	}
	public void display()
	{
		for(Employee e:employees)
		{
			System.out.println(e);
		}
	}
	public void update(int eId,Employee employee)
	{
		Iterator <Employee> empIter = employees.iterator();
		int ctr = -1;
		while(empIter.hasNext())
		{
			ctr++;
			Employee emp = empIter.next();
			if(emp.getId() == eId)
			{
				employees.remove(ctr);
				employees.add(ctr, employee);
			}
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * employees.add(new Employee(100,"Harsha","RtNagar",10000));
		employees.add(new Employee(101,"Keerthana","Koramangala",15000));
		employees.add(new Employee(102,"Suman","Vijayanagar",12000));
		employees.add(new Employee(103,"Rakesh","Jayanagar",20000));
		employees.add(new Employee(104,"Rajesh","Malleswaram",35000));
		 */
		ArrayListCrud alc = new ArrayListCrud();
		alc.addEmployee(new Employee(100,"Harsha","RtNagar",10000));
		alc.addEmployee(new Employee(101,"Keerthana","Koramangala",15000));
		alc.addEmployee(new Employee(102,"Suman","Vijayanagar",12000));
		alc.addEmployee(new Employee(103,"Rakesh","Jayanagar",20000));
		alc.addEmployee(new Employee(104,"Rajesh","Malleswaram",35000));
		
		List <Employee> myEmployees = alc.getAllEmployees();
		System.out.println(myEmployees);
		
		Employee employee = alc.getEmployeeById(2);
		
		System.out.println("Index based with Original Order");
		System.out.println("Employee with id index 2"+employee);
		
		Employee emp = alc.getEmployeByOriginalId(103);
		if(emp != null)
		{
			System.out.println("Employee with id 103 "+ emp);
		}
		
		alc.deleteEmployeeById(103);
		System.out.println("---------Displaying after deletion of employee with id 103-----------");
		alc.display();
		Employee eU = new Employee(104,"Rajesh","Indiranagar",40000);
		
		alc.update(104, eU);
		System.out.println("------------Display after Modification-----------");
		alc.display();
	}

}
