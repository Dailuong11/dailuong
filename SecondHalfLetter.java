/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package secondhalfletter;

import java.util.Scanner;

/**
 *
 * @author win
 */
public class SecondHalfLetter {

    public static String checkInput() {
        String name;
        Scanner sc = new Scanner(System.in);
        name = sc.nextLine().trim();
        while (true) {
            System.out.println("Input name: ");
            name = sc.nextLine();
            if (!name.isEmpty()) {
                break;
            } else {
                System.out.println("It's must be not empty!");;
            }
        }
        return name.trim();
    }

    public static void secondHalfLetters() {
        String s;
        s = checkInput();
        int count = 0;
        for (int i = 0; i < s.length(); i++) {
            if (Character.toLowerCase(s.charAt(i)) >= 'n' && Character.toLowerCase(s.charAt(i)) <= 'z') {
                count++;
            }
        }
        System.out.println(count);
    }

    public static void main(String[] args) {

        secondHalfLetters();

    }

}
