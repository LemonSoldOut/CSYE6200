package edu.northeastern.csye6200.lab2;

import java.util.HashMap;
import java.util.Scanner;

/**
 * 
 * @author lemon
 * @date 1.19.2023
 * @description calculate month days of target year of month
 */
public class LAB2_P3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int year;
		String monthAbbr;
		
		try (Scanner input = new Scanner(System.in)) {
			System.out.println("Enter year:\t");
			year = input.nextInt();
			
			System.out.println("Enter Month 3 characters abbr:\t");
			monthAbbr = input.next();
			
			int days = calculateMonthDays(year, monthAbbr);
			System.out.println(monthAbbr + " " + year + " has " + days + " days!");
	
		}catch(ArithmeticException e) {
			e.printStackTrace();
		}
		
	}
	
	static int calculateMonthDays(int year, String monthAbbr) {
		int days;
		
		//int[] monthDays = {31,28,31,40,51,30,31,31,30,31,30,31};

		HashMap<String,Integer> map = new HashMap<String,Integer>();
		map.put("Jan", 31);
		
		// leap year 闰年 4 年一周期
		if(year % 4 == 0) {
			map.put("Feb", 29);
		}else {
			map.put("Feb", 28);
		}
		
		map.put("Mar", 31);
		map.put("Apr", 30);
		map.put("May", 31);
		map.put("Jun", 30);
		map.put("Jul", 31);
		map.put("Aug", 31);
		map.put("Sep", 30);
		map.put("Oct", 31);
		map.put("Nov", 30);
		map.put("Dec", 31);
		
		days = map.get(monthAbbr);
		
		return days;
	}

}
