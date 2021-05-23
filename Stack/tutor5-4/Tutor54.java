/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tutor5.pkg4;

import java.util.Scanner;

/**
 *
 * @author Kisyok Indran Veerasamy
 */
public class Tutor54 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int n=1, n1=5, n2=8, n3=14;
        System.out.println("Fib(" + n + "): " + Fib(n));
        System.out.println("Fib(" + n1 + "): " + Fib(n1));
        System.out.println("Fib(" + n2 + "): " + Fib(n2));
        System.out.println("Fib(" + n3 + "): " + Fib(n3));
        
        
    }
    public static int Fib(int n){
        Stack<Integer> stack = new Stack<>();
        int pop1=0, pop2=0, pop3=0;
        if(n == 1){
            return 1;
        }else{
            int num1=1, num2=1;
            for (int i=1; i<=n; ++i){
                stack.push(num1);
                int next = num1 + num2;
                num1 = num2;
                num2 = next;
        }
            pop1 = stack.pop();
            pop2 = stack.pop();
            pop3 = stack.pop();
    }
    return pop2+pop3;
}
}