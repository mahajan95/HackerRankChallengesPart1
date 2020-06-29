package com.java;

import java.util.Scanner;

public class HackerRankDay6 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int num=sc.nextInt();
		for(int i=1;i<=num;i++) {
			String str=sc.next();
			for(int j=0;j<str.length();j++) {
				if(j%2==0) System.out.print(str.charAt(j));
			}
				System.out.print(" ");
				for(int j=0;j<str.length();j++) {
					if(j%2!=0) {
						System.out.print(str.charAt(j));
					}
				
			}
			
			}
		}
	}
	



