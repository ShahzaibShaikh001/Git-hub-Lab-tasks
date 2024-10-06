/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.stack;

/**
 *
 * @author Amir Shaikh
 */
public class Stack {
    
    int [] array = new int [10];
    int top = -1;
    
    public void array_push(int value){
        array[++top] = value; 
    }
    
    public void display_all(){
        
        for (int i=0; i<=top; i++){
            System.out.println("The element number "+i+" is : "+array[i]);
        }
  
    }
    
    public void array_peek(){
        System.out.println(array[top]);
  
    }
    public void array_pop(){
        int value = 0 ;
        value = array[top];
        int pop = array[--top];
        System.out.println("The element : "+value+" is poped ");
  
    }
        
    public void array_delete(int value){
        
        for (int i=0; i<array.length;i++){
        if(array[i]==value){
            
        array[i]= 0;
        System.out.println("The element : "+value+" is deleted ");
        }
    }
    }
    
    public void array_delete_all(){
            top = -1;
            System.out.println("Every thing is deleted ");
          }
    
     public void check_StatusEmpty(){
    if (top == -1){
        System.out.println("The Stack is Empty ");
    }
    }
    
    
     
    
    public void check_StatusFull(){
    if (top == 10){
        System.out.println("The Stack is full ");
    }
    else {
        System.out.println("The Stack is not full");
    }
    }
    
    public static void main(String[] args) {
        
       Stack stack = new Stack();
       stack.array_push(10);
       stack.array_push(20);
       stack.array_push(30);
       stack.display_all();
       stack.array_peek();
       stack.array_pop();
       stack.array_delete(10);
       stack.display_all();
       stack.array_delete_all();
       stack.check_StatusFull();
       stack.check_StatusEmpty();
       
    }
}
