/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tutor5.pkg6;

import java.util.Iterator;
import java.util.Random;

/**
 *
 * @author Kisyok Indran Veerasamy
 */
public class Tutor56 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    final int MAX = 100, SIZE = 10;
    Random r = new Random();
    boolean[] marker = new boolean[SIZE];
    int[] num = new int[SIZE];
    
        System.out.print("The random numbers are: ");
        for(int i=0; i<num.length; i++){
             num[i] = r.nextInt(MAX);
             marker[i] = false;
             System.out.print(num[i] + " ");
        }
        
        boolean check = true;
        int round = 1;
        Stack<Integer> stack = new Stack<>();
        while(check){
            check = false;
            for(int i=0; i<num.length; i++){
                if(num[i]%2==round && !marker[i]){
                    marker[i] = true;
                    stack.push(num[i]);
                    round++;
                    round%=2;
                    check = true;
                }
            }
        }
        System.out.print("\nThe numbers in the stack: ");
        if(!stack.isEmpty()){
            stack.showStack();
        }
        System.out.print("\nThe numbers remain in the array: ");
        for(int i=0; i<num.length; i++){
            if(!marker[i]){
                System.out.print(num[i] + " ");
            }
        }
}
}