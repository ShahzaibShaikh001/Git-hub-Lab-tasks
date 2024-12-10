/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package oop.lab78_tree;

/**
 *
 * @author AYESHA
 */
public class GenTree {
    
    
    public static void main(String[] args) {
        TreeNode root = new TreeNode(1, 3);
        TreeNode child1 = new TreeNode(2, 2);
        TreeNode child2 = new TreeNode(3, 2);
        TreeNode child3 = new TreeNode(4, 2);

        root.addchild(child1);
        root.addchild(child2);
        root.addchild(child3);

        TreeNode grandChild1 = new TreeNode(5, 0);
        TreeNode grandChild2 = new TreeNode(6, 0);

        child1.addchild(grandChild1);
        child1.addchild(grandChild2);

        System.out.println("Tree Structure:");
        root.display(root, 0);

        System.out.println("\nPre-order Traversal:");
        root.preOrderTraversal(root);

        System.out.println("\n\nIn-order Traversal:");
        root.inOrderTraversal(root);

        System.out.println("\n\nPost-order Traversal:");
        root.postOrderTraversal(root);

        System.out.println("\n\nLevel-order Traversal:");
        root.levelOrderTraversal(root);
    }
}

    

