/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab9.pkg1;

import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author Kisyok Indran Veerasamy
 */
public class Lab91 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Scanner s = new Scanner(System.in);
        System.out.print("Enter N : ");
        int N = s.nextInt();
        SearchTest<Integer> a = new SearchTest<>(1, N);
        System.out.println("The matrix are : ");
        a.showValue();
        
        System.out.print("Enter a number to search: ");
        int find = s.nextInt();
        if(a.linearSearch(find)){
            System.out.println(find + " is found");
            System.out.println("The number of " + find + " in the mattrix is " + a.linearSearchCount(find));
            System.out.println("The location of " + find + " are : " + a.linearSearchList(find));
        }else{
            System.out.println(find + " is not found");
        }
    }
    
}
