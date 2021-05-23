/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab6.pkg1;

import java.util.Scanner;

/**
 *
 * @author Kisyok Indran Veerasamy
 */
public class Lab61 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // D 400 | W 300 | W 700 | D 200| D 450 | W 120
        Scanner s = new Scanner(System.in);
        System.out.print("Enter transaction: ");
        String input = s.nextLine();
        String[] arr = input.split("\\|");
        
        Queue<String> a = new Queue<>();
        for(int i=0; i<arr.length; i++){
            a.enqueue(arr[i].trim());
        }
        a.showQueue();
        System.out.println("\nIntial Balance : 500");
        calculate(a);
    }
    public static void calculate(Queue<String> a){
        int amount = 500;
        while(!a.isEmpty()){
            String s = a.dequeue();
        char type = s.charAt(0);
        int value = Integer.parseInt(s.substring(2));
        
        if(type=='D'){
            amount += value;
            System.out.println("Deposit " + value + "\t\tNew Balance " + amount);
        }else if(type=='W'){
            amount -= value;
            if(amount>0){
                System.out.println("Withdraw " + value + "\t\tNew Balance " + amount);
            }else{
                amount += value;
                System.out.println("withdraw " + value + " Rejected " + "  New Balance " + amount);
                continue;
            }
        }
    }
    }
}
