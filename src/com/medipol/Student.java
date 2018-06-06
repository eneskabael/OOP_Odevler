package com.medipol;

import com.medipol.util.IDGenerator;

public class Student implements Comparable<Student>{
	
	public String name;
	public String studentId;
	public String surname;
	public String group;
	public boolean attendance;
	public double avarageGrade;
	
	
	
	public Student(String name, String surname, String group, boolean attendance, double avarageGrade) {
		super();
		this.name = name;
		this.surname = surname;
		this.group = group;
		this.attendance = attendance;
		this.avarageGrade = avarageGrade;
		this.studentId = String.valueOf(IDGenerator.generateStudentID());
	}

	public Student(String studentId, String name, String surname, String group, double avarageGrade, boolean attendance) {
		super();
		this.name = name;
		this.studentId = studentId;
		this.surname = surname;
		this.group=group;
		this.avarageGrade=avarageGrade;
		this.attendance = attendance;
	}
	
	public Student(double avarageGrade) {
		super();
		this.avarageGrade = avarageGrade;
	}

	public boolean doAssignment(String assignment) { //burasý metot, boolean çünkü ödevi yapmýþ ya da yapmamýþtýr 
		return false;
	}

	@Override
	public String toString() {
		return this.studentId+";"+this.name+";"+this.surname+";"+this.group+";"+this.avarageGrade+";BELIRSIZ;"+this.attendance;
	}

	@Override
	public int compareTo(Student o) {
		// TODO Auto-generated method stub
		return Double.compare(avarageGrade, o.avarageGrade);
	}

	

		
	
}
