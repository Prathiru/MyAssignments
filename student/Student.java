package org.student;

import org.college.College;

public class Student extends College{

	
	public void studentName()
	{
		System.out.println("Prathibha");
	}
	
	
	public void studentDept()
	{
		System.out.println("Studend Department BCA");
	}
	
	public void studentId()
	{
		System.out.println("Student ID 101");
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student s = new Student();
		s.studentName();
		s.studentDept();
		s.studentId();
		s.collegeName();
		s.collegeCode();
		s.collegeRank();
		s.deptName();
		
	}

}
