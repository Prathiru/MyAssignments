package org.college;

import org.department.Department;

public class College extends Department{

	public void collegeName()
	{
		System.out.println("New Prince");
	}
	
	public void collegeCode()
	{
		System.out.println("142");
	}
	
	public void collegeRank()
	{
		System.out.println("020");
	}
	

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		College c= new College();
		c.collegeName();
		c.collegeCode();
		c.collegeRank();
		c.deptName();
		
	}

}
