/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab23extra;

import java.util.LinkedList;
import java.util.Random;

/**
 *
 * @author HP
 */
public class DrawUno {
    private int times;
    private int player;
    private Cards [] arrcard;
    private LinkedList<Cards> linkcard;
    private int temp;//index want to be remove

    Deck deck1 = new Deck();
    Random r = new Random();

    public DrawUno(int times){
        arrcard = new Cards [times];
        linkcard = new LinkedList<>();
        //this.player=player;
        this.times=times;
        
    }
    private void arrdraw(int player){
        this.player=player;
        System.out.println("Array Implementation");
        System.out.println("Player "+player+" draw "+this.times+" times");
        for(int i = 0;i<times;i++){
            temp = r.nextInt(deck1.card.size());
            arrcard[i] = (deck1.card.get(temp));
            deck1.card.remove(temp);
        }
        for(Cards o :arrcard)System.out.print(o.displaytype()+" :: ");
        System.out.print("\nCard left in the deck: "+deck1.card.size());
        
        
    }

    private void linkdraw(int player){
        this.player=player;
        System.out.println("LinkedList Implementation");
        System.out.println("Player "+player+" draw "+this.times+" times");
        for(int i = 0;i<times;i++){
            temp = r.nextInt(deck1.card.size());
            linkcard.add(deck1.card.get(temp));
            deck1.card.remove(temp);
        }
        for(Cards o :linkcard)System.out.print(o.displaytype()+" :: ");
        System.out.print("\nCard left in the deck: "+deck1.card.size());

    }
    public static void main(String[] args) {
        DrawUno Play = new DrawUno(7);

        //round 1
        Play.arrdraw(1);
        System.out.print("\n\n");
        Play.arrdraw(2);
        
        System.out.print("\n\n");
        System.out.print("\n\n");
        //round 2
        Play.linkdraw(1);
        System.out.print("\n\n");
        Play.linkdraw(2);

    }
}
// //round 1
// Play.arrdraw(7,1);
// System.out.print("\n\n");
// Play.arrdraw(7,2);
// System.out.print("\n\n");

// //round 2

// Play.arrdraw(7,1);
// System.out.print("\n\n");
// Play.arrdraw(7,2);
// System.out.print("\n\n");


