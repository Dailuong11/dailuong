/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lap002_selectionsort;

import java.util.Scanner;

/**
 *
 * @author win
 */
public class Lap002_Selectionsort {

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

    public static int[] CheckInputValueOfArray(int n) {
        int[] a = new int[n];
        for (int i = 0; i < a.length; i++) {
            a[i] = checkInput("a[" + i + "]=", Integer.MIN_VALUE, Integer.MAX_VALUE);
        }
        return a;
    }

    public static void SortArarrySelectionSort(int[] a) {
        System.out.print("Unsorted Array: [");
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i] + " ");
        }
        System.out.println("]");
        int min = 0;
        int temp = 0;
        for (int i = 0; i < a.length; i++) {
            min = i;
            for (int j = 0; j < a.length; j++) {
                if (a[j] < a[min]) {
                    min = j;
                }
                if (a[i] != a[min]) {
                    temp = a[min];
                    a[min] = a[i];
                    a[i] = temp;
                }

            }
        }
        System.out.print("");
    }
// 3 2 6 1 
// 2 3 6 1
// 1 3 6 2
// 1 2 6 3
// 1 2 3 6

    public static void print(int[] a) {
        System.out.print("Sorted array: [");
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i] + " ");
        }
        System.out.print("]");
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int array = checkInput("Enter number of array:", 0, Integer.MAX_VALUE);
        int[] a = CheckInputValueOfArray(array);
        SortArarrySelectionSort(a);
        print(a);
    }

}
