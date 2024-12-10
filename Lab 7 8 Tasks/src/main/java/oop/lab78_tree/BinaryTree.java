/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package oop.lab78_tree;

/**
 *
 * @author AYESHA
 */
public class BinaryTree {
    //Not binary tree but general tree implementation
    
    TreeNode root;
    
    
      

    public BinaryTree(int data,int maxchild){
        root=new TreeNode(data,maxchild);
        System.out.println("New node created: "+data);
    }
    
    
    public void displayTree() {
        root.display(root, 0);  
    }
    
    
    public void preorder(){
        root.preOrderTraversal(root);
    }
    
      public void inorder(){
        root.inOrderTraversal(root);   }
    
    
    public void levelorder(){
        root.levelOrderTraversal(root);
    }
    
    public void postorder(){
        root.postOrderTraversal(root);
    }
    
    public static void main(String args[]){
        BinaryTree tree=new BinaryTree(50,4);
        TreeNode B=new TreeNode(30,3);
        TreeNode C=new TreeNode(20,4);
       //  TreeNode D=new TreeNode(40,4);


        tree.root.addchild(B);
        tree.root.addchild(C);
        tree.displayTree();
          
        
        
        System.out.println("PreOrder: ");
        tree.preorder();
        
        System.out.println("Level Order: ");
        tree.levelorder();
        
        System.out.println("Inorder Order: ");
        tree.inorder();
        
        System.out.println("PostOrder Order: ");
        tree.postorder();
    
}
}
