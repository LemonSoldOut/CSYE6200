package edu.northeastern.csye6200.lecture02;

import java.util.Scanner;

/**
 * 
 * @author lemon
 * @description input number between range from 1 to 100
 * @date 1.12.2023
 */
public class Exercise03 {
    
    public static void main(String[] args) {
        // TODO Auto-generated method stub
        int inputNumber = 0;
        try (Scanner input = new Scanner(System.in)) {
//          do {
//          System.out.println("Enter a number between 1 and 100:");
//          inputNumber = input.nextInt();
//          if (inputNumber < 1 || inputNumber > 100){
//              System.out.println("It should be in range 1-100!");
//              continue;
//          }
//          else {
//              System.out.println("Input number:\t" + inputNumber);
//              System.out.println("DONE!");
//              break;
//          }
//      }while(true);
        	
        	do {
              System.out.println("Enter a number between 1 and 100:");
              inputNumber = input.nextInt();
          }while(inputNumber < 1 || inputNumber > 100);
          
        }catch(ArithmeticException e) {
        	e.printStackTrace();
        }
        
    }

}