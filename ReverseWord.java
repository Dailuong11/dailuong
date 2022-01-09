/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package reverse.character;

import java.util.Scanner;

/**
 *
 * @author win
 */
public class ReverseWord {
   public static String checkInput() {
        Scanner sc = new Scanner(System.in);
        while (true) {
           String name = sc.nextLine().trim();
            if (!name.isEmpty()) {
             return name;
            } else {
                System.out.println("name must not empty!");
            }
        }
    }

    public static void reverse() {
        String result = "";
        String input = checkInput();
        String [] a1 = input.split("\\s+");
       String mess = a1[a1.length - 1];// dai luong 
       mess = mess.substring(0,1).toUpperCase()+mess.substring(1);
       a1[a1.length -1] = mess;
       for (int i = a1.length - 1; i >= 0; i--) {
         result += a1[i] +" ";  
        
        }
         System.out.println(result);
    }
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("Enter String:");
        reverse();
    }

}
