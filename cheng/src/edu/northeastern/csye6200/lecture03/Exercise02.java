package edu.northeastern.csye6200.lecture03;

import java.util.Scanner;

/**
 * 
 * @author cheng
 * @date 1.17.2023
 * @description 2^x: x from 1 to 32
 */
public class Exercise02 {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        
        double input_value = getDouble();
        System.out.println("Input value:\t" + input_value);
    }

    private static double getDouble() {
        Scanner input = new Scanner(System.in);
        System.out.print("Input a double number:\t");
        return input.nextDouble();
    }
}