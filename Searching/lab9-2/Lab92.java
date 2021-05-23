/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab9.pkg2;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author Kisyok Indran Veerasamy
 */
public class Lab92 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        Random r = new Random();
        LinkedList<Integer> a = new LinkedList<>();
        for(int i=0; i<10; i++){
            a.addNode(r.nextInt(21));
        }
       System.out.print("The random inetegers are : ");
        a.showList();
        System.out.println("\nLinear Seatch");
        System.out.print("Enter a number to search: ");
        int search = s.nextInt();
        if(a.linearSearch(search)){
            System.out.println(search + " is found");
            System.out.println("The number of " + search + " in the data set is " + a.linearSearchCount(search));
        }else{
            System.out.println(search  + " is not found");
        }
        System.out.print("Enter two numbers to search (begin end) : ");
        int from = s.nextInt();
        int to = s.nextInt();
        if(a.linearSearchRange(from, to)){
            System.out.println("The integer can be found in between " + from + " and " + to);
            System.out.println("The number of elements between " + from + " and " + to + " in the data set is " + a.linearSearchRangeCount(from, to));
        }else{
            System.out.println("The integer cannot be found in between " + from + " and " + to);
        }
    }
    
}
