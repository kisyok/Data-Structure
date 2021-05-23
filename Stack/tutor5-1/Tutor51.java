/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tutor5.pkg1;

/**
 *
 * @author Kisyok Indran Veerasamy
 */
public class Tutor51 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Stack<Character> stack = new Stack<>();
        System.out.println("Stack implementation using Linked List");
        System.out.println("Insert three nodes into the stack");
        stack.push('A');
        stack.push('N');
        stack.push('D');
        stack.showStack();
        
        System.out.println("\nPop one node from the stack");
        stack.pop();
        stack.showStack();
        
        System.out.println("\nThe element on the top of the stack is " + stack.peek());
        stack.showStack();
        
        System.out.println("\nThe number of elemets in the stack is " + stack.getSize());
    }
    
}
