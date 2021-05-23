/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tutor6.pkg2;

/**
 *
 * @author Kisyok Indran Veerasamy
 */
public class Tutor62 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ArrayQueue<Character> a = new ArrayQueue();
        System.out.println("Queue implementation using Array");
        System.out.println("Enqueue three nodes");
        a.enqueue('B');
        a.enqueue('M');
        a.enqueue('W');
        a.showQueue();
        System.out.println("Dequeue one node");
        a.dequeue();
        a.showQueue();
        System.out.println("Thw front node of the queue is " + a.peek());
        System.out.println("The queue size is " + a.getSize());
    }
    
}
