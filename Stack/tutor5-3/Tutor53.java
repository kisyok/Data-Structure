/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tutor5.pkg3;

import java.util.Scanner;

/**
 *
 * @author Kisyok Indran Veerasamy
 */
public class Tutor53 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter a sentence : ");
        String input = s.nextLine();
        System.out.println("Original sentence : " + input);
        String[] split = input.split(" ");
        
        Stack<Character> stack = new Stack<>();
        for(int i=0; i<input.length(); i++){
            stack.push(input.charAt(i)); 
        }
        
        System.out.print("The sentene in reverse order : ");
        while(!stack.isEmpty()){
            System.out.print(stack.pop());
        }
        
        Stack<String> stack1 = new Stack<>();
        System.out.print("\nThe word in reverse order : ");
        for(int i=0; i<split.length; i++){
           stack1.push(split[i] + " ");
        }
         while(!stack1.isEmpty()){
             System.out.print(stack1.pop());
        }
    }
    
}
