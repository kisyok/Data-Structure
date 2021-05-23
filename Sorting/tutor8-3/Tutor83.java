/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tutor8.pkg3;

import java.util.Random;

/**
 *
 * @author Kisyok Indran Veerasamy
 */
public class Tutor83 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Random r = new Random();
       int[] arr = new int[10];
       for(int i=0; i<arr.length; i++){
           arr[i] = 0 + r.nextInt(101);
       }
       
       LinkedList<Integer> a = new LinkedList<>();
       for(int i=0; i<arr.length; i++){
           a.addNode(arr[i]);
       }
        System.out.print("The random numbers are : ");
       a.showList();
       
        System.out.println("\nSelection sort - Ascending Order");
      a.selectionSort(1);
       a.showList();
    }
    
}
