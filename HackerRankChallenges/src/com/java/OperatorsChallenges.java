package com.java;

import java.util.Scanner;

public class OperatorsChallenges {
	
	
	static void solve(double meal_cost, int tip_percent, int tax_percent) {
		double precentagetip=(tip_percent/(float)(100));
		double t=precentagetip*meal_cost;
		System.out.println(t);
		
		double precentagetax=(tax_percent/(float)(100));
		double tx=precentagetax*meal_cost;
		System.out.println(tx);
		
		double  totalcost=( meal_cost+t+tx);
		System.out.println(Math.round(totalcost));
		
    }
//	10.25
//	17
//	5
	
    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        double meal_cost = scanner.nextDouble();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        int tip_percent = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        int tax_percent = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        solve(meal_cost, tip_percent, tax_percent);

        scanner.close();
    }
	

}
