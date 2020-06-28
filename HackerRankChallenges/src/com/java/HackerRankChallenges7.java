package com.java;

import java.util.Scanner;

public class HackerRankChallenges7 {

	public static void main(String[] args) {
		
		Scanner scan=new Scanner(System.in);
		int num=scan.nextInt();
		for(int i=1;i<=10;i++) {
			int result=(num*i);
			System.out.println(num +" X "+ i +" = "+ result);
		}
		
	}
}
