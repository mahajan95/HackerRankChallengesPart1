package com.java;

import java.util.Scanner;
import java.util.Stack;

public class SolutionDay5 {

	private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int n = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        int[] arr = new int[n];

        String[] arrItems = scanner.nextLine().split(" ");
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");
        Stack<Integer> stack=new Stack<Integer>();
        for (int i = 0; i < n; i++) {
            int arrItem = Integer.parseInt(arrItems[i]);
            arr[i] = arrItem;
           
            Integer ele=stack.push(arrItem);
       
            
            
        }
        for(int j=0;j<n;j++) {
        	Integer pop=stack.pop();
        	String space=" ";
            System.out.print(pop+ space);
        }
        
        scanner.close();
    }
}
