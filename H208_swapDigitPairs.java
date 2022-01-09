/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package h208_swapdigitpairs;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author win
 */
public class H208_swapDigitPairs {

    final public static Scanner sc = new Scanner(System.in);

    //check user input Int
    public static int checkInputInt(String mess) {
        System.out.print(mess);

        while (true) {
            try {
                int number = Integer.parseInt(sc.nextLine());
                if (number > 0) {
                    return number;
                }
            } catch (NumberFormatException e) {
                System.err.println("Please input number Interger");
                System.out.print(mess);
            }
        }
    }

    private static int swapDigitPairs(int n) {
        int m = n;//12345 // 214365
        int count = 0;
        int temp = 0;
        double sum = 0;
        while (m > 0) {
            int c = m % 10; // m = 6
            count++;// 2
            if (count % 2 == 1) {
                temp = c;// temp =1 3 5
            } else {
                sum = temp * Math.pow(10, count - 1) + c * Math.pow(10, count - 2) + sum;
            }
            if (m < 10 && count % 2 == 1) {
                sum = c * Math.pow(10, count - 1) + sum;
            }
            m /= 10;

        }
        return (int) sum;
    }

    public static void main(String[] args) throws IOException {
        int a = checkInputInt("Enter Number: ");
        System.out.println("Output: " + swapDigitPairs(a));

    }
}
