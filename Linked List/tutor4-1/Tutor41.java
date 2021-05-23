/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tutor4.pkg1;

/**
 *
 * @author Kisyok Indran Veerasamy
 */
public class Tutor41 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       LinkedList<Double> list = new LinkedList<>();
       //Question 1- add numbers into a linked list: (23.1, 36.5, 12.8, 42.6, 32.8)  
        System.out.println("The number in the Linked List");
        list.addNode(23.1);
        list.addNode(36.5);
        list.addNode(12.8);
        list.addNode(42.6);
        list.addNode(32.8);
        list.showList();
        System.out.println();
        
        //Question 2-add 10.5 for each number in the list that is more than 20
        System.out.println("The number in linked list after updated");
        list.add20();
        list.showList();
    }
    
}
