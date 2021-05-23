/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tutor4.pkg3;

import java.util.Scanner;

/**
 *
 * @author Kisyok Indran Veerasamy
 */
public class Tutor43 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter the total amount: ");
        int amount = s.nextInt();
        System.out.println("Total amount: " + amount);
        
        LinkedList<Integer> list = new LinkedList<>();
        list.addNode(100);
        list.addNode(50);
        list.addNode(20);
        list.addNode(10);
        list.addNode(5);
        list.addNode(1);
        
        LinkedList<Integer> notes = new LinkedList<>();
        notes.addNode(0);
        notes.addNode(0);
        notes.addNode(0);
        notes.addNode(0);
        notes.addNode(0);
        notes.addNode(0);
        list.currency(amount, notes);
        list.showList(notes);
    }
    
}
