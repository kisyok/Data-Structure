/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tutor9.pkg1;

import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author Kisyok Indran Veerasamy
 */
public class Tutor91 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
//        SearchTest<Character> a = new SearchTest<>('A', 10);
//        System.out.print("The Character data set are : ");
//        a.showValue();
//        System.out.println("Linear Search");
//        System.out.print("Enter a letter to serch: ");
//        char x = s.nextLine().charAt(0);
//        if(a.linearSearch(x)==true){
//            System.out.println(x + " is found");
//        }else{
//            System.out.println(x + " is not found");
//        }
//        System.out.print("Enter two letters to search (begin end : ");
//        char begin = s.nextLine().charAt(0);
//        char end = s.nextLine().charAt(0);
//        int countBtRange = a.LinearSearchCountRange(begin, end);
//        if(countBtRange!=0){
//            System.out.println("The character can be found in between " + begin + " " + end);
//        }else{
//            System.out.println("No character can be found in between " + begin + " " + end);
//        }
        
        SearchTest<Character> b = new SearchTest<>('A', 10);
        System.out.print("The Character data set are : ");
        b.showValue();
        System.out.println("Linear Search");
        System.out.print("Enter a letter to search: ");
        char y = s.nextLine().charAt(0);
        if(b.linearSearch(y) == true){
             System.out.println(y + " is found");
        }else{
             System.out.println(y + " is not found");
        }
        int count = b.linearSearchCount(y);
        if(count!=0){
            System.out.println("The number of " + y + " in the data set is " + count);
        }
        System.out.print("The location of the " + y + " are : " + Arrays.toString(b.LinearSearchList(y, count)));
        System.out.print("\nEnter two letters to search (begin end : ");
        char begin = s.nextLine().charAt(0);
        char end = s.nextLine().charAt(0);
        if(b.LinearSearchRange(begin, end)){
            System.out.println("The character can be found in between " + begin + " " + end);
        }else{
            System.out.println("No character can be found in between " + begin + " " + end);
        }
        int countBtRange = b.LinearSearchCountRange(begin, end);
        if(countBtRange!=0){
            System.out.println("The number of elements between " + begin + " and " + end + " in the data set is " + countBtRange);
        }else{
            System.out.println("No character can be found in between " + begin + " " + end);
        }
        System.out.println("The location of the elements in between " + begin +" and " + end + " are : " + Arrays.toString(b.LinearSearchListRange(begin, end, countBtRange)));
    }
    
}
