package com.medipol;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import com.medipol.util.FileUtils;

public class School{
	public String name;
	public String address;
	public String phone="90324234";
	
	
	
	public School(String name, String address, String phone) {
		super();
		this.name = name;
		this.address = address;
		this.phone = phone;
	}

	public void addStudent(Student student) {
		FileUtils.writeFile(student.toString());
	}
	
	public void removeStudent(Student student) {
		
	}
	
	public Student getStudent(int studentID) {
		return null; // ??
}
//	public Student[] getAllStudents() {
//		String fileContent = FileUtils.readFile();
//		String[] satirlar = fileContent.split("\n");
//		Student[] studentArr = new Student[satirlar.length];
//		int i = 0;
//		for(String satir:satirlar) {
//			 String[] arr = satir.split(";");
//             Student s = new Student(arr[0], arr[1], arr[2],arr[5], Double.valueOf(arr[4]),Boolean.valueOf(arr[6]));
//             studentArr[i]= s;
//             i++;
//		}
//		return studentArr;
//	}
	public List<Student> getAllStudents() {
		String fileContent = FileUtils.readFile();
		String[] satirlar = fileContent.split("\n");
		List<Student> StudentList = new ArrayList<Student>();
		int i = 0;
		for(String satir:satirlar) {
			 String[] arr = satir.split(";");
             Student s = new Student(arr[0], arr[1], arr[2],arr[5], Double.valueOf(arr[4]),Boolean.valueOf(arr[6]));
             StudentList.add(s);
		}
		return StudentList;
	}

	public void addDepartment(Department department) {
	}
	
	public void removeDepartment(Department department) {
		
	}
	
	public Department getDepartment(int departmentId) {
		return null; // ??
	}
	
	public Department[] getAllDepartments() {
		return null; // ??
		
	}

	public Student searchStudent(String studentNumber) {
		Iterator<Student> it = getAllStudents().iterator();
		while(it.hasNext()) {
			Student temp = it.next();
			if(temp.studentId.equalsIgnoreCase(studentNumber)) {
				return temp;
			}
		}
		return null;
	}
}