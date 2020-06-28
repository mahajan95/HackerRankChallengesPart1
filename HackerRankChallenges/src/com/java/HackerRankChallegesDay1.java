package com.java;

import java.util.Scanner;

public class HackerRankChallegesDay1 {
	
	
    public static void main(String[] args) {
    	int i = 4;
        double d = 4.0;
        String s = "HackerRank ";
        int sum;double dsum;String ssum;
    	
		Scanner scan = new Scanner(System.in); 
   	    int num = scan.nextInt(); 

        double dnum = scan.nextDouble();
       scan.nextLine();
        String sname = scan.nextLine();
        System.out.println(sname);
        
       sum=(num+i);
        System.out.println(sum);
        
       dsum=(dnum+d);
       System.out.println(dsum); 
       
      ssum=(s.concat(sname));
       System.out.println(ssum);
        
	}
	 
     
     
     
     
     

}
