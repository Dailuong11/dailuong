/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package reversecharacter;

import java.util.Scanner;

/**
 *
 * @author win
 */
public class ReverseCharacter {

    public static String checkCharacter() {
        Scanner nc = new Scanner(System.in);
        String str = "";
        while (true) {
            System.out.println("Enter string : ");
            str = nc.nextLine();
            if (!str.isEmpty()) {
               return str;
            }
            else {
              break;
            }
        }
    return str;
    }

    public static String reverse(String str) {
        String result = "";
        for (int i = str.length() - 1; i >= 0; i--) {
            result += str.charAt(i);
        }
        return result;
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String rv = checkCharacter();
        String a = reverse(rv);
        System.out.println(a);
    }

}
