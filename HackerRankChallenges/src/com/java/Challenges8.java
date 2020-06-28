package com.java;

import java.util.Scanner;

public class Challenges8 {
	
	 private static final Scanner scanner = new Scanner(System.in);
	public static void main(String[] args) {
		 int t = scanner.nextInt();
		 System.out.println(t);
	      scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");
	      scanner.nextLine();
	      String s = null;
	      for(int i=0;i<t;i++) {
	    	 s=scanner.next();
//		      System.out.println(s);
	      }
	   
	      for(int j=0;j<s.length();j++) {
	    	  System.out.println(s);
	      }
	      

		
		
	}

}
