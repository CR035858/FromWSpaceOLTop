package com.gl.glca28maycol;

public class Employee implements Comparable <Employee>{

	int id;
	String empName;
	String empAddress;
	int empSalary;
	
	public Employee() {
		super();
	}

	public Employee(int id, String empName, String empAddress, int empSalary) {
		super();
		this.id = id;
		this.empName = empName;
		this.empAddress = empAddress;
		this.empSalary = empSalary;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getEmpName() {
		return empName;
	}

	public void setEmpName(String empName) {
		this.empName = empName;
	}

	public String getEmpAddress() {
		return empAddress;
	}

	public void setEmpAddress(String empAddress) {
		this.empAddress = empAddress;
	}

	public int getEmpSalary() {
		return empSalary;
	}

	public void setEmpSalary(int empSalary) {
		this.empSalary = empSalary;
	}

	@Override
	public String toString() {
		return "Employee [id=" + id + ", empName=" + empName + ", empAddress=" + empAddress + ", empSalary=" + empSalary
				+ "]";
	}

	@Override
	public int compareTo(Employee o) {
		// TODO Auto-generated method stub
		return 0;
	}
	
	
	
}
