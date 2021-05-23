/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tutor8.pkg4;

import java.util.Random;

/**
 *
 * @author Kisyok Indran Veerasamy
 */
public class Tutor84 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Random r = new Random();
       LinkedList<Integer> a = new LinkedList<>();
       for(int i=0; i<10; i++){
           int num = 0 + r.nextInt(101);
           a.addNode(num);
       }
       System.out.print("The random integers are : ");
       a.showList();
        System.out.println("\nBubble Sort - Descending Order");
        a.bubbleSort(2);
        a.showList();
    }
    
}
