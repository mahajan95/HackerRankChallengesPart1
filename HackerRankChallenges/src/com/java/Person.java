package com.java;

import java.util.Arrays;
import java.util.Scanner;


class Person {
		protected String firstName;
		protected String lastName;
		protected int idNumber;
		
		// Constructor
		Person(String firstName, String lastName, int identification){
			this.firstName = firstName;
			this.lastName = lastName;
			this.idNumber = identification;
		}
		
		// Print person data
		public void printPerson(){
			 System.out.println(
					"Name: " + lastName + ", " + firstName 
				+ 	"\nID: " + idNumber); 
		}
		 
	}

	class Student extends Person{
	    	private int[] testScores;

		public Student(String firstName, String lastName, int identification, int[] testScores) {
			super(firstName, lastName, identification);
			this.testScores= testScores;
			calculate();
		}
   
	public char	calculate(){
		for(int i=0;i<testScores.length;i++) {           
//		System.out.println(testScores[i]);
		int test=i;
		
		System.out.println(test);
		}
	
		return 0;
	    
//		Heraldo Memelli 8135627
//		2
//		100 80
//	   
	}


}
