/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab4.pkg7;

import java.util.Scanner;

/**
 *
 * @author Kisyok Indran Veerasamy
 */
public class Lab47 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter a sentence : ");
        String input = s.nextLine();
        String[] arr = input.split(" ");
        
        
        
        CircularLinkedList<String> list = new CircularLinkedList<>();
        for(String a : arr){
            list.addCircularNode(a);
        }
        System.out.println("\nThe words in the circular linked list");
        list.showCircularNode();
        System.out.println("\nThe length is " + list.length());
        System.out.println("After delete a word");
        list.deleteCircularNode();
        list.showCircularNode();
        System.out.println("\nThe length is " + list.length());
        System.out.println("The second item in the list is" + list.getCircularItem(2));
        
    }
    
}
