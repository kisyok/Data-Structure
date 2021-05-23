/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab4.pkg4;

/**
 *
 * @author Kisyok Indran Veerasamy
 */
public class Lab44 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        LinkedList<Integer> list = new LinkedList<>();
        list.addNode(23);
        list.addNode(15);
        list.addNode(17);
        list.addNode(28);
        list.addNode(12);
        list.addNode(40);
        
        list.showList();
        System.out.println("\nLinked List has " + list.length() + " node(s)");
        System.out.println("Total is " + list.sum());
        System.out.println("Total even number is " + list.even());
    }
    
}
