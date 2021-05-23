/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab2.pkg3;

/**
 *
 * @author wif190017
 */
public class Lab23 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
         Uno a = new Uno(7,1);
        Uno b = new Uno(7,2);
        a.displayArray();
        a.clear();
        
        b.displayArray();
        b.clear();
        System.out.println("");
        
        a.displayLinkedList();
        b.displayLinkedList();
    }
    
}
