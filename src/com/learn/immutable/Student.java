package com.learn.immutable;

public final class Student {
	
	final String studentName;
	final int regNo;
	
	public Student(String studentName, int regNo) {
		this.studentName = studentName;
		this.regNo = regNo;
	}
	
	public String getStudentName() {
		return studentName;
	}
	
	public int getRegNo() {
		return regNo;
	}

}
