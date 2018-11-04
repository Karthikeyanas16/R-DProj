package com.learn.immutable;

public class TestImmutable {
	
	public static void main(String args[]) {
		
		Student stud = new Student("Rahul",1001);
		System.out.println("Student Name : "+stud.getStudentName());
		System.out.println("Reg No : "+stud.getRegNo());
		
		//stud.regNo=1002; // The final field Student.regNo cannot be assigned

	}

}
