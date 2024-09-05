/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.arrays;
import java.util.Scanner;

/**
 *
 * @author N TECH
 */
public class Palindrome {
            public static void main(String[] args) {

     Scanner scanner = new Scanner(System.in);

        // Ask the user to input a string
        System.out.print("Enter a string: ");
        String userInput = scanner.nextLine();
       char[]str=userInput.toCharArray();
       boolean b=true;
       for(int i=0; i<str.length/2; i++){
           if (str[i] !=str[str.length -1-i]) {
               b=false;
               break;      
           }
        if (b) {
            System.out.println(userInput + " is a palindrome.");
        } else {
            System.out.println(userInput + " is not a palindrome.");
        }

        // Close the scanner
        scanner.close();
    }
            }
}
