package edu.northeastern.csye6200.lab2;

import java.util.Scanner;

/**
 * 
 * @author lemon
 * @date 1.19.2023
 * @description calculate number of upper case letters of input String
 */
public class LAB2_P4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		try (Scanner input = new Scanner(System.in)) {
			System.out.println("Enter a line of string:\t");
			
			String inputString = input.nextLine();
			
			System.out.println("The number of upper case letters is:\t" + calculateUpperCaseLetters(inputString));
		}catch(ArithmeticException e) {
			e.printStackTrace();
		}
		
	}
	
	static int calculateUpperCaseLetters(String inputString) {
		int result = 0;
		
		//确认 a-z 和 A-Z 的范围
//		char lower_a = 'a';
//		char lower_z = 'z';
		char upper_A = 'A';
		char upper_Z = 'Z';
		
		String[] stringSplit = inputString.split(" ");
		
		for(int i=0; i < stringSplit.length; i++) {
			int tempCharNumber = (int)stringSplit[i].charAt(0);
			if( tempCharNumber >= (int)upper_A && tempCharNumber <= (int)upper_Z){
				result += 1;
			}
		}
		
		return result;
		
	}

}
