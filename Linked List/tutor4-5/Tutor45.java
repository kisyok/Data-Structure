/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tutor4.pkg5;

/**
 *
 * @author Kisyok Indran Veerasamy
 */
public class Tutor45 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int n = 15;
        LinkedList<Integer> list = new LinkedList<>();
        System.out.println("Linked List has " + n + " node(s)");
        list.addNode(n);
        list.showList();
                    
        int delete = 0;
        System.out.println("\nDelete the number " + delete + " from the list");
        list.delete(delete);
        list.showList();
    }
    
}
