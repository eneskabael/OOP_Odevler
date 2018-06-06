package com.medipol.util;

public class IDGenerator {
	public static int studentID=1;
	public static String generateStudentID() {
		
		return "HR00" + studentID++;
	}
}
