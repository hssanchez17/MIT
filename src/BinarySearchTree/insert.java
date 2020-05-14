/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BinarySearchTree;

import java.util.Scanner;

/**
 *
 * @author pc
 */
    
    // Java program to demonstrate insert operation in binary search tree 
class BinarySearchTree { 
  
    /* Class containing left and right child of current node and key value*/
    class Node { 
        int key; 
        Node left, right; 
  
        public Node(int item) { 
            key = item; 
            left = right = null; 
        } 
    } 
  
    // Root of BST 
    Node root; 
  
    // Constructor 
    BinarySearchTree() {  
        root = null;  
    } 
  
    // This method mainly calls insertRec() 
    void insert(int key) { 
       root = insertRec(root, key); 
    } 
      
    /* A recursive function to insert a new key in BST */
    Node insertRec(Node root, int key) { 
  
        /* If the tree is empty, return a new node */
        if (root == null) { 
            root = new Node(key); 
            return root; 
        } 
  
        /* Otherwise, recur down the tree */
        if (key < root.key) 
            root.left = insertRec(root.left, key); 
        else if (key > root.key) 
            root.right = insertRec(root.right, key); 
  
        /* return the (unchanged) node pointer */
        return root; 
    } 
  
    // This method mainly calls InorderRec() 
    void inorder()  { 
       inorderRec(root); 
    } 
  
    // A utility function to do inorder traversal of BST 
    void inorderRec(Node root) { 
        if (root != null) { 
            inorderRec(root.left); 
            System.out.print(root.key+" "); 
            inorderRec(root.right); 
        } 
    } 
  
    
    
    void postorder(){
        postorderRec(root);
    }
    
    void postorderRec(Node root){
         if (root != null) { 
            postorderRec(root.left); 
            postorderRec(root.right);
            System.out.print(root.key+" ");
        } 
    }
    
    
    void preorder(){
        preorderRec(root);
    }
    
    void preorderRec(Node root){
         if (root != null) { 
             System.out.print(root.key+" ");
            preorderRec(root.left); 
            preorderRec(root.right);
            
        } 
    }
    
    // Driver Program to test above functions 
    public static void main(String[] args) { 
        BinarySearchTree tree = new BinarySearchTree(); 
  
        Scanner entrada = new Scanner(System.in);
        int n= entrada.nextInt();
        
        for (int i = 0; i < n; i++)  tree.insert(entrada.nextInt());
        
        /*tree.insert(50); 
        tree.insert(30); 
        tree.insert(20); 
        tree.insert(40); 
        tree.insert(70); 
        tree.insert(60); 
        tree.insert(80);*/ 
  
        // print inorder traversal of the BST 
        System.out.println("Inorder:");
        tree.inorder(); 
        System.out.println();
        System.out.println("Postorder:");
        tree.postorder();
        System.out.println();
        System.out.println("Preorder:");
        tree.preorder();
    } 
} 

//6 40 20 60 10 50 30
