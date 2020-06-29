package com.java;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Solution {

    public static void main(String []argh){

        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        Map<String,Integer> newmap=new HashMap<String,Integer>(n);
        for(int i = 0; i < n; i++){
            String name = in.next();
            int phone = in.nextInt();
            	
            	newmap.put(name,phone);
        }
        while(in.hasNext()){
            String s = in.next();
         Integer key=newmap.get(s);
         if(key==null) {
        	System.out.println("Not found"); 
         }else
          System.out.println( s+"="+key);
        }
        in.close();
    }
}
	
	
	



