/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab4.pkg1;

import java.util.Random;

/**
 *
 * @author HP
 */
public class Lab41 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Random r = new Random();
        LinkedList<Integer> list = new LinkedList<>();
        int[] arr = new int[10];
        System.out.print("The random numbers are : ");
        for(int i=0; i<arr.length; i++){
            arr[i] = r.nextInt(101);
            System.out.print(arr[i] + " ");
        }
        System.out.println();
        
        System.out.println("\nInsert the random numbers at the back of the linked list");
        for(int i=0; i<arr.length; i++){
            list.addNode(arr[i]);
        }
        list.showList();
        
        list.clear();
        System.out.println("\n\nInsert the random numbers in front of the linked list");
        for(int i=0; i<arr.length; i++){
            list.addFrontNode(arr[i]);
        }
        list.showList();
        
        list.clear();
        System.out.println("\n\nInsert the random numbers in a sorted linked list");
         for(int i=0; i<arr.length; i++){
            list.addSortNode(arr[i]);
        }
        list.showList();
    }
    
}
