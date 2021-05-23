/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tutor5.pkg2;

/**
 *
 * @author Kisyok Indran Veerasamy
 */
public class Tutor52 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("Stack implementation using array"); 
        char[] input = {'A','N','D'};
        ArrayStack<Character> stack = new ArrayStack<>();
        System.out.println("Insert three nodes into the stack");
        for(int i=0; i<input.length; i++){
            stack.Push(input[i]);
        }
        stack.showStack();
        System.out.println("\nPop one node from the stack");
        stack.Pop();
        stack.showStack();
        System.out.println("\nThe element on the top of the stack is " + stack.Peek());
        stack.showStack();
        System.out.println("\nThe number of elements in the stack is " + stack.getSize());
    }
    
}
