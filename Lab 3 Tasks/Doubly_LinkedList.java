/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.doubly_linkedlist;

/**
 *
 * @author Amir Shaikh
 */
public class Doubly_LinkedList {
    public class Node{
        int data;
        Node next;
        Node prev;
        Node(int data){
            
        this.data = data;
        this.next = null;
        this.prev = null;
            
        }
        
        
    }
    public Node head;
    public Node tail;
    Doubly_LinkedList(){
        this.head = null ;
        this.tail = null ;
    }
    
    public void Insert_at_start(int data){
    Node newnode = new Node(data);
    if (head == null ){
    
    head = tail = newnode ;
        
}    
    else{
    newnode.next = head;
    head.prev = newnode;
    head = newnode;
            
    }
}
    
     public void insertAtEnd(int data){
    Node newnode = new Node(data);
    if(head == null){
    head= tail =newnode;
    }
   
    else{
    tail.next = newnode;
    newnode.prev = tail;
    tail = newnode;
    }
   
    }
     
    public void removeFromStart(){
        head = head.next;
}
    public void removeFromEnd(){
        tail = head.next;
}    
    
    public void Display_from_start(){
    Node current = head;
    while( current != null){
        System.out.print(current.data+" ");
        current = current.next;
    }
    System.out.println(" Null ");
}

    public void displayFromEnd(){
    Node current = tail;
    while(current !=null){
        System.out.print(current.data + "->");
        current = current.prev;
    }
        System.out.print("null");
    } 

    public void deleteAtPosition(int position){
        if(head==null){
            System.out.println("List is empty");
        }
}
public void deleteAtStart(int position){
        if(head==null){
            System.out.println("List is empty");

        }
        head=head.next;
}
    
    public static void main(String[] args) {
    
    Doubly_LinkedList list = new Doubly_LinkedList();    
            list.Insert_at_start(20);
            list.insertAtEnd(30);
            list.insertAtEnd(40);
            list.Insert_at_start(10);
            list.removeFromStart();
    
    }
}