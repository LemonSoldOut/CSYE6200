package edu.northeastern.csye6200.lecture02;

import java.util.Scanner;

/**
 * 
 * @author lemon
 * @description get input number and its rounded decimals
 * @date 1.12.2023
 */
public class Exercise02 {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        Scanner input = new Scanner(System.in);
        System.out.println("Enter number:");
        double inputNumber = input.nextDouble();
        
        System.out.println("Enter the deicmal number:");
        int roundNumber = input.nextInt();
        
        String outputString = "Round " + roundNumber + " decimal places: %." + roundNumber + "f"; 
        
        System.out.printf(outputString, inputNumber);
    }
    

}