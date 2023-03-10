package edu.northeastern.csye6200.lecture02;

import java.util.Scanner;

/**
 * 
 * @author lemon
 * @description get average(mean) of user input numbers
 * @date 1.12.2023
 */
public class Exercise01 {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        
        try (Scanner input = new Scanner(System.in)) {
			int count = 0;
			int totalNumber = 0;
			System.out.println("Enter number(not number will end this program):\t");
			while(input.hasNextInt()) {
			    count += 1;
			    totalNumber += input.nextInt();
			}
			
			double avg = totalNumber / count;
			System.out.println("Average:\t" + avg);
		}catch(ArithmeticException e) {
			e.printStackTrace();
		}
        
    }

}