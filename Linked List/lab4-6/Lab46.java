/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab4.pkg6;

import java.util.Random;

/**
 *
 * @author Kisyok Indran Veerasamy
 */
public class Lab46 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Random r = new Random();
        DoubleLinkedList<Integer> list = new DoubleLinkedList<>();
        int[] arr = new int[10];
        for(int i=0; i<10; i++){
            arr[i] = r.nextInt(101);
        }
        System.out.print("The random numbers are : ");
        for(int i=0; i<10; i++){
            System.out.print(arr[i] + " ");
        }
        
        System.out.println("\nInsert the random numbers into the doubly linked list");
         for(int i=0; i<10; i++){
            list.addRightNode(arr[i]);
        }
         list.showList();
         
         System.out.println("\nRemove a number from the third position");
         list.deleteAtIndex(2);
         list.showList();
         
         System.out.println("\nReplace the number in seventh position with 999");
         list.replace(999, 7);
         list.showList();
         
         System.out.println("\nRemove all the even numbers from the doubly linked list");
         list.even();
         list.showList();
    }
    
}
