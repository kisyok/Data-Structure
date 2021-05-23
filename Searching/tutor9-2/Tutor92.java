/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tutor9.pkg2;

import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author Kisyok Indran Veerasamy
 */
public class Tutor92 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
//        SearchTest<Integer> a = new SearchTest<>(1, 10); 
//        a.selectionSort(1);
//        System.out.print("The integer data set are : " );
//        a.showValue();
//        System.out.println("Binary Search");
//        System.out.print("Enter a number to search: ");
//        int x = s.nextInt();
//        if(a.binarySearch(x)==true){
//            System.out.println(x + " is found");
//        }else{
//            System.out.println(x + " is not found");
//        }
//        System.out.println("Enter two numbers to search (begin end) : ");
//        int begin = s.nextInt();
//        int end = s.nextInt();
//        if(a.binarySearch(begin, end)){
//            System.out.println("Integer can be found between " + begin + " and " + end);
//        }else{
//            System.out.println("No integer can be found between " + begin + " and " + end);
//        }
    
        SearchTest<Integer> b = new SearchTest<>(1, 10);
        System.out.print("The Integer data set are : ");
        b.showValue();
        System.out.println("Binary Search");
        System.out.print("Enter a number to search: ");
        int x = s.nextInt();
        if(b.binarySearch(x)==true){
            System.out.println(x + " is found");
        }else{
            System.out.println(x + " is not found");
        }
        System.out.println("The number of " + x + " in the data set is " + b.binarySearchCount(x));
        System.out.println("Enter two numbers to search (begin end) : ");
        int begin = s.nextInt();
        int end = s.nextInt();
        if(b.binarySearch(begin, end)){
            System.out.println("The integer can be found between " + begin + " and " + end);
            System.out.println("The number of elemenst in between " + begin + " and " + end + " in the data set is " + b.binarySearchCount(begin, end));
            System.out.println("The location of the elements in between " + begin + " and " + end + " are : " + Arrays.toString(b.binarySearchList(begin, end)));
        }
    }
    
}
