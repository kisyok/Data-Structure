/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab8.pkg1;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author Kisyok Indran Veerasamy
 */
public class Lab81 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter N Special Random Number within 0-100: ");
        int n = s.nextInt();
       SortTest<Integer> a = new SortTest<>(SortTest.ASCENDING, 1, n);
        System.out.print("The Special Number are: ");
        a.showValue();
        System.out.print("After Merge Sort ");
       a.sortOddEven();
       a.showValue();
        
    }
    
}
