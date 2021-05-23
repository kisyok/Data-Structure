/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab4.pkg4;

import java.util.Random;

/**
 *
 * @author Kisyok Indran Veerasamy
 */
public class Lab44 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) { LinkedList<Character> player1 = new LinkedList<>();
        LinkedList<Character> player2 = new LinkedList<>();
        
        Random r = new Random();
        int decidePlayer = 1 + r.nextInt(2);
        
        if(decidePlayer==1){
        System.out.println("Player 1 starts first");

        do{
            for(int i=0; i<roll(); i++){
                player1.addNode('*');
            }
            System.out.print("Player 1 : ");
            player1.showList();
            if(player1.length()>20){
                break;
            }
            
            for(int i=0; i<roll(); i++){
                player2.addNode('*');
            }
            System.out.print("Player 2 : ");
            player2.showList();
            if(player2.length()>20){
                break;
            }
            
        }while(player1.length()<=20 || player2.length()<=20);
        if(player1.length()>20){
            System.out.println("Player 1 wins the game");
        }else{
            System.out.println("Player 2 wins the game");
        }
    }else{
            System.out.println("Player 2 starts first");
        do{
            for(int i=0; i<roll(); i++){
                player2.addNode('*');
            }
            System.out.print("Player 2 : ");
            player2.showList();
            if(player2.length()>20){
                break;
            }
            
            for(int i=0; i<roll(); i++){
                player1.addNode('*');
            }
            System.out.print("Player 1 : ");
            player1.showList();
            if(player1.length()>20){
                break;
            }
            
        }while(player1.length()<=20 || player2.length()<=20);
        if(player1.length()>20){
            System.out.println("Player 1 wins the game");
        }else{
            System.out.println("Player 2 wins the game");
        }
            
        }
    }
    public static int roll(){
        Random r = new Random();
        return 2 + r.nextInt(5);
    }
    }

