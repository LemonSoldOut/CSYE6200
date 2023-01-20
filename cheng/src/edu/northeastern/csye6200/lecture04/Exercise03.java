package edu.northeastern.csye6200.lecture04;

/**
 * 
 * @author lemon
 * @date 1.19.2023
 * @description get an Integer Array and find out the number equals to keyValue and return index
 */
public class Exercise03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] myArray = {4, 11, -3, 0, 46, 11, 9, -77, 3, 11};
		int keyValue = 11;
		printArray(searchArray(myArray, keyValue));
	}
	
	static int[] searchArray(int[] myArray, int inputValue) {
		int[] result = new int[myArray.length];
		int count = -1;
		for(int i = 0; i < myArray.length; i++) {
			if(myArray[i] == inputValue) {
				count++;
				result[count] = i;
			}
		}
		
		if(count == -1) {
			result[0] = -1;
			return result;
		}
		return result;
	}

	static void printArray(int[] myArray) {
		for(int i = 0; i < myArray.length; i++) {
			if(myArray[i]==0) {
				continue;
			}
			System.out.println(myArray[i]);
		}
	}
}
