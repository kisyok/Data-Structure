/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab6.pkg3;

import java.util.ArrayList;
import java.util.Random;

/**
 *
 * @author Kisyok Indran Veerasamy
 */
public class ColourCard {
    static Queue<String> deck = new Queue<>();
    static Random r = new Random();
    
    public ColourCard() {
        createDeck();
        play(5);
    }
    
    public static void createDeck(){
        String[] value = {"One", "Two", "Three", "Four", "Five", "Six", "Seven", "Eight", "Nine", "Ten"};
        String[] colour = {"Blue", "Green", "Red", "Yellow"};
        
       
        while(deck.getSize()!=40){
            int nColour = r.nextInt(4);
            int nValue = r.nextInt(10);
            String temp = value[nValue] + " " + colour[nColour];
            if(deck.isEmpty()){
                deck.enqueue(temp);
            }else{
                if(!deck.has(temp)){
                    deck.enqueue(temp);
                }
                
            }
            if(deck.getSize()==40){
            break;
        }
        }
        
    }
    public static void play(int a){
        Queue<String> player1 = new Queue<>();
        Queue<String> player2 = new Queue<>();
        
        while(player1.getSize()!=a && player2.getSize()!=a){
            player1.enqueue(deck.dequeue());
            player2.enqueue(deck.dequeue());
        }
        
        System.out.println("Player 1 Card");
        player1.showQueue();
        System.out.println("\nPlayer 2 Card");
        player2.showQueue();
        
        int score1 = 0, score2 = 0;
        while(!player1.isEmpty() && !player2.isEmpty()){
            String[] cardP1 = player1.dequeue().split(" ");
            String[] cardP2 = player2.dequeue().split(" ");
            
            if(getNumber(cardP1[0]) > getNumber(cardP2[0])){
                score1++;
            }else if(getNumber(cardP2[0]) > getNumber(cardP1[0])){
                score2++;
            }else if(getNumber(cardP1[0]) == getNumber(cardP2[0])){
                if(compareColour(cardP1[1]) > compareColour(cardP2[1])){
                    score1++;
                }else{
                    score2++;
                }
            }
        }
        System.out.println("\nPlayer 1 Score: " + score1);
        System.out.println("Player 2 Score: " + score2);
        if(score1 > score2){
            System.out.println("Player 1 WINS");
        }else if(score2 > score1){
            System.out.println("Player 2 WINS");
        }
    }
    public static int getNumber(String a){
        switch(a){
            case "One":
                return 1;
            case "Two":
                return 2;
            case "Three":
                return 3;
            case "Four":
                return 4;
            case "Five":
                return 5;
            case "Six":
                return 6;
            case "Seven":
                return 7;
            case "Eight":
                return 8;
            case "Nine":
                return 9;
            case "Ten":
                return 10;
            default:
                return 0;
        }
    }
    public static int compareColour(String a){
        int num = 0;
        if(a.equals("Blue")){
            num = 4;
        }else if(a.equals("Green")){
            num = 3;
        }else if(a.equals("Red")){
            num = 2;
        }else if(a.equals("Yellow")){
            num = 1;
        }
        return num;
    }
}
