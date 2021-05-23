/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab5.pkg1;

import java.util.Random;

/**
 *
 * @author Kisyok Indran Veerasamy
 */
public class Lab51 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Random r = new Random();
        int n = 1 + r.nextInt(11);
        String[] candy = {"blue", "orange", "red", "yellow"};
        
        Stack<String> stack = new Stack<>();
        for(int i=0; i<n; i++){
            stack.push(candy[r.nextInt(4)]);
        }
        System.out.println("The candies in the container");
        stack.showStack();
        System.out.println("\nAli takes all the candies one by one from the container and eats the blue ones.");
        System.out.println("He puts back the rest of candies in the container.");
        System.out.println("The candies in the container:");
        stack.remove();
        stack.showStack();
    }
    
}
