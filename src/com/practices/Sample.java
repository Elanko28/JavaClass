package com.practices;

import java.util.*;

public class Sample {

	// method syntax
	private void studentId() {
		System.out.println("hello friends");
		

	}
	
//	@Override
	public void employeeName() {
	System.out.println("employee name is ashok");
	

}
//@Override
	public void employeeId() {
//	super.employeeId();
	System.out.println("employee id is 5678");
	

		
	}


	public static void main(String[] args) {

		// objectification syntax

		Sample s = new Sample();

		// calling of method syntax

		s.studentId();

		Scanner s1 = new Scanner(System.in);
		
		int id=s1.nextInt();
		
		String name=s1.nextLine();
		
		System.out.println("my student name is " +name);
		
		// next, nextLine need different object
		



	}
}
