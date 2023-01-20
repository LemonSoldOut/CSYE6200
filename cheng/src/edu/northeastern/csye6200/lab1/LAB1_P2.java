package edu.northeastern.csye6200.lab1;

import java.util.Scanner;

/**
 * 
 * @author lemon
 * @description unit(yard,feet) convert -> inch
 * @date 1.12.2023
 */
public class LAB1_P2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int yard, feet, inch = 0;
		try (Scanner input = new Scanner(System.in)) {
			System.out.println("Enter number of yards:");
			yard = input.nextInt();
			System.out.println("Enter number of feet:");
			feet = input.nextInt();
			System.out.println("Enter number of inches:");
			inch = input.nextInt();
			
			int totalInches = 12 * (3 * yard + feet) + inch;
			System.out.println("==================");
			System.out.println("Output:");
			
			System.out.println("Total number of inches:\t" + totalInches);
			
		}catch(ArithmeticException e) {
			e.printStackTrace();
		}
		
		
	}

}
