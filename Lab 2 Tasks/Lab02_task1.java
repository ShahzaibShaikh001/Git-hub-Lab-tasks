/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.lab2task2;

/**
 *
 * @author Amir Shaikh
 */
public class Lab02_task1 {

    public static void main(String[] args) {
    
    int[] num=new int[3];
    num[0]=1;
    num[1]=2;
    num[2]=3;
    
    
    int length = num.length;  
    int[] ans = new int [length*2];
    
    for(int i=0; i<num.length; i++){
    ans[i] = num[i];
    ans[i+length] = num[i];
    }   
    for(int i=0; i<ans.length; i++){
        System.out.print(ans[i]+" , ");
    }
    }
}
