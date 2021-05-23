/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab8.pkg4;

import java.util.Scanner;

/**
 *
 * @author Kisyok Indran Veerasamy
 */
public class Lab84 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter N characters : ");
        int N = s.nextInt();
        SortTest<Character> a = new SortTest<>('A', N);
        System.out.print("The characters are : ");
        a.showValue();
        System.out.println("Heap Sort - Ascending Order");
        a.HeapSort();
        a.showValue();
    }
    
}
