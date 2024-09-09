/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.lab2task2;

/**
 *
 * @author Amir Shaikh
 */
public class Lab02_task3 {
    
    
        public static int maxWords(String[] sentences) {
        int maxWords = 0; 

        
        for (String sentence : sentences) { // advanced loop Sir ghafoor ney nhi parhaya humen ab tak
            
            String[] words = sentence.split(" "); //creating an array to split words from scentences and store

            
            maxWords = Math.max(maxWords, words.length); // math.max is used to find maximum from 2 variables
        }

        return maxWords; 
    }
    public static void main(String[] args) {
        
        String[] sentences = {
            "alice and bob love leetcode", 
            "i think so too", 
            "this is great thanks very much"
        };

        
        int result = maxWords(sentences); //result variable to store maximum number of words

        
        System.out.println("The maximum number of words in a single sentence is: " + result);  // Output: 6
    }

    

}