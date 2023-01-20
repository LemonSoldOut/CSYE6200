package edu.northeastern.csye6200.lab2;

import java.util.Scanner;

/**
 * 
 * @author lemon
 * @date 1.19.2023
 * @description calculate the energy needed to heat water
 * @formula 𝑄 = 𝑀 ∗ (𝑓𝑖𝑛𝑎𝑙𝑇𝑒𝑚𝑝𝑒𝑟𝑎𝑡𝑢𝑟𝑒 − 𝑖𝑛𝑖𝑡𝑖𝑎𝑙𝑇𝑒𝑚𝑝𝑒𝑟𝑎𝑡𝑢𝑟𝑒) ∗  4184 
 */
public class LAB2_P1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double initialTemp, finalTemp, waterAmountKG;
		
		try (Scanner input = new Scanner(System.in)) {
			System.out.println("Enter water amount in KG:\t");
			waterAmountKG = input.nextDouble();
			
			System.out.println("Enter initial temperature:\t");
			initialTemp = input.nextDouble();
			
			System.out.println("Enter final temperature:\t");
			finalTemp = input.nextDouble();
			
			System.out.println("The energy needed is:\t" + calculateEnergy(initialTemp, finalTemp, waterAmountKG));
		}catch(ArithmeticException e) {
			e.printStackTrace();
		}
	}
	
	static double calculateEnergy(double initialTemp, double finalTemp, double waterAmountKG) {
		
		double energy;
		
		energy = waterAmountKG * (finalTemp - initialTemp) * 4184;
		
		return energy;
	}

}
