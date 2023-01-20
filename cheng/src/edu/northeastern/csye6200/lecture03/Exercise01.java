package edu.northeastern.csye6200.lecture03;

//import java.util.Scanner;

/**
 * 
 * @author cheng
 * @date 1.17.2023
 * @description 2^x: x from 1 to 32
 */
public class Exercise01 {

    public static void main(String[] args) {
        // TODO Auto-generated method stub        
        double i = 1.0;
        
        while(i < 33.0) {
            //System.out.println("2^" + i + ":\t" + Math.pow(2, i));
            double result = Math.pow(2, i);
            System.out.printf("2^%.0f = %.0f%n", i, result);
            i++;
        }
        
    }
}