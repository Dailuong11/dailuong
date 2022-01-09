/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package h206_printsquare;

import java.util.Scanner;

/**
 *
 * @author win
 */
public class H206_printSquare {
        public static Scanner in = new Scanner(System.in);

    public static int checkInput(String mess, int Min, int Max) {
        int num;
        do {
            System.out.println(mess);
            try {
                num = Integer.parseInt(in.nextLine());
                if (num >= Min && num <= Max) {
                    break;
                } else {
                    System.out.println("out of range, Please enter in range from " + Min + "to" + Max + "}");
                }
            } catch (NumberFormatException e) {
                System.out.println("Pleas input number");
                System.out.println("Enter again: ");
            }
        } while (true);
        return num;

    }
    public static void printSquare(int min, int max) {
        for (int i = min; i <= max; i++) {
            for (int j = i; j <= max; j++) {
                if (j != i) {
                    System.out.print(Math.abs(j));
                } else {
                    System.out.print(j);
                }
                
            }
            for (int j = min; j < i; j++) {
                System.out.print(Math.abs(j));
            }
            System.out.println("");
        }
        // min = 3 , max = 6
       
            
    }

    public static void main(String[] args) {
       int min = checkInput("Enter min:", Integer.MIN_VALUE, Integer.MAX_VALUE);
       int max = checkInput("Enter max", min, Integer.MAX_VALUE);
        printSquare(min, max);
    }
    
}
