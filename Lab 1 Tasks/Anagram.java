/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.arrays;

/**
 *
 * @author N TECH
 */
import java.util.Arrays;  

public class Anagram {
    public static void main(String[] args) {
        String word = "listen";
        String word2 = "silent";

        char[] str = word.toLowerCase().toCharArray();
        char[] str2 = word2.toLowerCase().toCharArray();

        if (str.length == str2.length) {

            Arrays.sort(str);
            Arrays.sort(str2);

            if (Arrays.equals(str, str2)) {
                System.out.println("It's an anagram");
            } else {
                System.out.println("It's not an anagram");
            }
        } else {
            System.out.println("It's not an anagram");
        }
    }
}