/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab2.pkg1;

import java.util.Random;

/**
 *
 * @author wif190017
 */
public class Lab21 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int N = 20;
        int bound = 101;
        generate<Integer> a = new generate<Integer>(N);
        Random r = new Random();
        while(a.LinkedListSize() != N){
            a.insertLinkedList(r.nextInt(bound));
        }
        while(a.arraySize() != N){
            a.insertArray(r.nextInt(bound));
        }
        a.sortLinkedList();
        a.sortArray();
        System.out.println("Generate " + N + " non-duplicate within 0-100");
        a.display();
    }
    
}
