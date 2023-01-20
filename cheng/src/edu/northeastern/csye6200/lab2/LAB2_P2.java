package edu.northeastern.csye6200.lab2;

import java.util.Scanner;

/**
 * 
 * @author lemon
 * @date 1.19.2023
 * @description shipping cost based on the package weight
 */
public class LAB2_P2 {

	public static void main(String[] args) {
		try (// TODO Auto-generated method stub		
		Scanner input = new Scanner(System.in)) {
			System.out.println("Enter package weight:\t");
			double weight = input.nextDouble();
			
			double cost = calculateCost(weight);
			if(cost == -999.0) {
				System.out.println("The package cannot be shipped...");
			}
			else {
				System.out.println("The shipping cost is $" + cost);
			}
		}catch(ArithmeticException e) {
			e.printStackTrace();
		}
	}
	
	static double calculateCost(double weight) {
		double cost = 0.0;
		if(weight < 0 || weight > 20){
			cost = -999.0;
		}
		else if(weight > 0 && weight <= 1) {
			cost = 3.5;
		}
		else if(weight > 1 && weight <=3) {
			cost = 5.5;
		}
		else if(weight > 3 && weight <= 10) {
			cost = 8.5;
		}
		else if(weight > 10 && weight <= 20) {
			cost = 10.5;
		}
		return cost;
	}

}
