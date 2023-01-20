package edu.northeastern.csye6200.lecture04;

/**
 * 
 * @author lemon
 * @date 1.19.2023
 * @description get an Integer Array of size 1000 and make each number equals to 13
 */
public class Exercise01 {
	public static void main(String[] args) {
		int[] myArray = new int[1000];
		
		for(int i = 0; i < myArray.length; i++) {
			myArray[i] = 13;
		}
		
		System.out.println(myArray[666]);
	}
}
