package com.gl.play4;

import java.util.Comparator;

public class EmployeeCitySorter implements Comparator <Employee>{

	@Override
	public int compare(Employee e1, Employee e2) {
		// TODO Auto-generated method stub
		if(e1.getEmpCity().compareTo(e2.getEmpCity()) > 0)
		{
			return 1;
		}
		else if(e1.getEmpCity().compareTo(e2.getEmpCity()) < 0)
		{
			return -1;
		}
		else
		{
			return 0;
		}
	}

}
