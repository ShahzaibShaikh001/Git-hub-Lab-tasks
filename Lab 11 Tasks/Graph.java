/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.graph;
  
/**
 *
 * @author Amir Shaikh
 */
public class Graph{
    
    
    int vertices;  
    int[][] matrix;  
    int edges;  
    
    
    public Graph(int vertices) {
        this.vertices = vertices;
        this.edges = vertices;
        matrix = new int[vertices][edges];  
    }  
    
    public void addEdge(int from, int to) {
        
        int row = from - 1;
        int col = to - 1;

        
        if (row>=0 && row<vertices && col>=0 && col<vertices) {
            matrix[row][col] = 1;
        }
    }
    
    
    public void displayMatrix(){
        System.out.println("Matrix:");
        
        for (int i = 0; i < vertices; i++) {
            for (int j = 0; j < vertices; j++) {
                System.out.print(matrix[i][j] + " ");
                
            }
            System.out.println();
        }
    }
     
    public static void main(String[] args) {
        
        int vertices = 4;
        
        
        Graph graph = new Graph(vertices);
    
        
        int[][] edges = {
            {1, 2},  
            {2, 3},  
            {3, 4},  
            {4, 1}   
        };
    
        
        for (int[] edge : edges) {
            graph.addEdge(edge[0], edge[1]);
        }
        
         
        graph.displayMatrix();
    }
}