/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package j1.s.bubblesort;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author win
 */
public class J1SBubblesort {

    public static Scanner in = new Scanner(System.in);

    public static int CheckInput(String mess, int Min, int Max) {
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

    public static int[] inputValueOfArray(int n) {
        int[] a = new int[n];
        for (int i = 0; i < a.length; i++) {
            int sigh = new Random().nextBoolean() ? 1 : 1;
            a[i] = sigh * new Random().nextInt(a.length);
        }
        return a;
    }

    public static void sortArrayByBubblesort(int[] a) {
        System.out.print("Unsorted array: [");
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i] + " ");
        }
        System.out.print("]");
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a.length - i - 1; j++) {
                if (a[j] > a[j + 1]) {
                    int temp = a[j];
                    a[j] = a[j + 1];
                    a[j + 1] = temp;
                }
            }
        }
        System.out.println();
    }

    private static void print(int[] a) {
        System.out.print("Sorted array: [");
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i] + " ");
        }
        System.out.print("]");
    }

    public static void main(String[] args) {
        int arrary = CheckInput("Enter your Array: ", 0, Integer.MAX_VALUE);
        int[] a = inputValueOfArray(arrary);
        sortArrayByBubblesort(a);
        print(a);
    }
}
