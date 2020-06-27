package com.java;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class HackerRankChallenges26 {

	
	  public static void main(String[] args)throws IOException {
	       BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
	        String returnDate = reader.readLine().trim().replaceAll("\\s", "-");
	        String dueDate = reader.readLine().trim().replaceAll("\\s", "-");
	        SimpleDateFormat formatter = new SimpleDateFormat("dd-MM-yyyy");
	        try {
	            Date returnDatep = formatter.parse(returnDate);

	            Date DueDatep = formatter.parse(dueDate);

	            Calendar calendar = Calendar.getInstance();
	            calendar.setTime(returnDatep);
	            int returnday = calendar.get(Calendar.DAY_OF_MONTH);

	            int returnYear = calendar.get(Calendar.YEAR);
	            int returnMonth = calendar.get(Calendar.MONTH);
	            int returnMonthincrese = (returnMonth + 1);
	            Calendar calendarsecond = Calendar.getInstance();
	            calendarsecond.setTime(DueDatep);
	            int dueday1 = calendarsecond.get(Calendar.DAY_OF_MONTH);

	            int dueYear1 = calendarsecond.get(Calendar.YEAR);

	            int dueMonth1 = calendarsecond.get(Calendar.MONTH);
	            int DueMonthIncrese = (dueMonth1 + 1);

	            if (returnDatep.equals(DueDatep) || returnDatep.before(DueDatep)) {
	                System.out.println(0);
	            } else if (returnDatep.after(DueDatep) && (returnMonthincrese == DueMonthIncrese)
	                    && (returnYear == dueYear1)) {
	                int difference = (returnday - dueday1);
	                int fine = (15 * difference);
	                System.out.println(fine);
	            } else if (returnDatep.after(DueDatep) && (returnMonthincrese > DueMonthIncrese)
	                    && (returnYear == dueYear1)) {
	                int difference = (returnMonthincrese - DueMonthIncrese);
	                int fine = (500 * difference);
	                System.out.println(fine);
	            } else if ((returnYear > dueYear1)) {
	                System.out.println(10000);
	            }
	        } catch (ParseException e) {
	            e.printStackTrace();
	        }
	  }
	    }