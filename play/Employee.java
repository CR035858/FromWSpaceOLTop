package com.gl.play;

public class Employee implements Comparable<Employee>{

	int eId;
	String eName;
	
	public Employee() {
		super();
	}

	public Employee(int eId, String eName) {
		super();
		this.eId = eId;
		this.eName = eName;
	}

	public int geteId() {
		return eId;
	}

	public void seteId(int eId) {
		this.eId = eId;
	}

	public String geteName() {
		return eName;
	}

	public void seteName(String eName) {
		this.eName = eName;
	}

	@Override
	public String toString() {
		return "Employee [eId=" + eId + ", eName=" + eName + "]";
	}

	@Override
	public int compareTo(Employee o) {
		// TODO Auto-generated method stub
		return 0;
	}
	
	
}
