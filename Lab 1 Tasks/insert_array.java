/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.arrays;

/**
 *
 * @author N TECH
 */
public class insert_array {
    public static void main(String[] args) {

    int[]array= new int[6];
    array[0]= 100;
    array[1]=200;
    array[2]=300;
    array[3]= 400;
    array[4]=500;
    array[array.length-1]=18;


        for(int i=0; i<array.length; i++){
            System.out.println(array[i]);
        }
            }    
}
