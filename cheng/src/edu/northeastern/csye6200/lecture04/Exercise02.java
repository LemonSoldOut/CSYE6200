package edu.northeastern.csye6200.lecture04;

/**
 * 
 * @author lemon
 * @date 1.19.2023
 * @description get an Integer Array of size of 5 and increment each number 
 */
public class Exercise02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] myArray = new int[5];//default value = 0
		
		System.out.println("BEFORE");
		
		printArray(myArray);
		
		System.out.println("================");

		System.out.println("AFTER");
		
		printArray(addOne(myArray));
	}
	
	static int[] addOne(int[] myArray) {
		
		for(int i = 0; i < myArray.length; i++) {
			myArray[i] += 1;
		}
		
		return myArray;
		
	}
	
	static void printArray(int[] myArray) {
		for(int i = 0; i < myArray.length; i++) {
			System.out.println(myArray[i]);
		}
	}

}
