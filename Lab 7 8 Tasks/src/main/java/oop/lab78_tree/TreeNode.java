/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package oop.lab78_tree;

/**
 *
 * @author AYESHA
 */
public class TreeNode {
    
    int data;
    int Childcount;
    TreeNode[] children;
    
    
     public TreeNode(int value, int size) {
        this.data = value;
        children = new TreeNode[size]; 
        Childcount = 0;
    }
    
public void addchild(TreeNode child){
    if(Childcount<children.length){
        children[Childcount++]=child;
        System.out.println(child.data+" have been added");
    }
    else{
        System.out.println("Node is full");
    }
    
}
public void display(TreeNode node,int level){
    if(node==null){
        System.out.println("tree is null");
        return;
    }
    
    
for(int i=0;i<node.Childcount;i++){
    display(node.children[i],level++);
} 
}


 public void preOrderTraversal(TreeNode node) {
        if (node == null) return;
        
        System.out.print(node.data + " ");
        
        for (int i = 0; i < node.Childcount; i++) {
            preOrderTraversal(node.children[i]);
           
            
        }
        
        
    }
  public void levelOrderTraversal(TreeNode node) {
        if (node == null) {
            System.out.println("Tree is empty.");
            return;
        }
  }
   public void inOrderTraversal(TreeNode node) {
        if (node == null) return;

        for (int i = 0; i < node.Childcount / 2; i++) {
            inOrderTraversal(node.children[i]);
        }

        System.out.print(node.data + " ");

        for (int i = node.Childcount / 2; i < node.Childcount; i++) {
            inOrderTraversal(node.children[i]);
        }
    }
  
    public void postOrderTraversal(TreeNode node) {
        if (node == null) return;

        for (int i = 0; i < node.Childcount; i++) {
            postOrderTraversal(node.children[i]);
        }

        System.out.print(node.data + " ");
    }
  
  
}
 
