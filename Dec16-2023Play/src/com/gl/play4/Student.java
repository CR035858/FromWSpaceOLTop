package com.gl.play4;

public class Student implements Comparable <Student>{

	int id;
	String studName;
	
	public Student() {
		super();
	}

	public Student(int id, String studName) {
		super();
		this.id = id;
		this.studName = studName;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getStudName() {
		return studName;
	}

	public void setStudName(String studName) {
		this.studName = studName;
	}

	@Override
	public String toString() {
		return "Student [id=" + id + ", studName=" + studName + "]";
	}

	//Sorting StudentName
	@Override
	public int compareTo(Student s1) {
		// TODO Auto-generated method stub
		if(this.getStudName().compareTo(s1.getStudName()) > 0)
		{
			return 1;
		}
		else if (this.getStudName().compareTo(s1.getStudName()) < 0)
		{
			return -1;
		}
		else
		{
			return 0;
		}
	}
	
	
}
