/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab7.pkg1;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author Kisyok Indran Veerasamy
 */
public class Lab71 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Random r = new Random();
       int[] input = new int[10];
       
       System.out.print("The random numbers are ");
       BST<Integer> tree = new BST<>();
       for(int i=0; i<input.length; i++){
           input[i] =  r.nextInt(21);
           System.out.print(input[i] + " ");
           tree.addNode(input[i]);
       }
        System.out.println("\nThe number of elements in the tree : " + tree.getSize());
        System.out.print("The tree elements - PREORDER ");
        tree.setOrder(tree.PREORDER);
        tree.showTree();
        System.out.print("\nThe tree elements - INORDER ");
        tree.setOrder(tree.INORDER);
        tree.showTree();
        System.out.print("\nThe tree elements - POSTORDER ");
        tree.setOrder(tree.POSTORDER);
        tree.showTree();
        
        System.out.println("\nThe maximum number is : " + tree.getMaximum());
        System.out.println("The mimimum numbers is : " + tree.getMinimun());
        System.out.println("The total is : " + tree.getTotal());
        
        Scanner s = new Scanner(System.in);
        System.out.print("Enter a number to search : ");
        int in = s.nextInt();
        System.out.println("The number of occurrence of " + in + " is " + tree.getOccurence(in));
    }
    
}
