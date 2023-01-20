package edu.northeastern.csye6200.lecture03;

import java.util.Scanner;

/**
 * 
 * @author lemon
 * @date 1.19.2023
 * @description get input double value
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