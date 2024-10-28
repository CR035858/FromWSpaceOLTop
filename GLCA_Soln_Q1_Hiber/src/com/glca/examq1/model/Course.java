package com.glca.examq1.model;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

@Entity
@Table(name="course")
public class Course {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="id")
	int id;
	
	@Column(name="id")
	String title;

	/* Assumed to be foreign key Of Instructor need not be implemented
	int instructor_Id; */
	
	@ManyToMany(cascade = {CascadeType.DETACH,CascadeType.PERSIST},fetch = FetchType.LAZY)
	@JoinTable(name="course_student",
				joinColumns = @JoinColumn(name="course_id"),
				inverseJoinColumns = @JoinColumn(name="student_id"))
	List <Student> students;
	
	public Course() {
		super();
	}

	public Course(int id, String title) {
		super();
		this.id = id;
		this.title = title;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	@Override
	public String toString() {
		return "Course [id=" + id + ", title=" + title + "]";
	}
	
	public void addStudent(Student student)
	{
		if(students == null)
		{
			students = new ArrayList<>();
		}
		students.add(student);
	}
	
	
	
}
