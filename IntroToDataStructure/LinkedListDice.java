/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tutor2.pkg4;

import java.util.LinkedList;
import java.util.Random;

/**
 *
 * @author wif190017
 */
public class LinkedListDice<T extends Comparable<T>> implements ADTDice<T> {
    private LinkedList value;
    private int times, total;
    private Random r;
    private final int MAX=6;
    
    public LinkedListDice(){
        times=0;
        r = new Random();
    }
    
    public void roll(int n){
        times = n;
        total = 0;
        value = new LinkedList();
        for(int i=0; i<times; i++){
            value.add(1 + r.nextInt(MAX));
            total += (int) value.get(i);
        }
    }
    public String toString(){
        String str = "";
        str = "Linked List implementation Roll " + times + " time(s)\n";
        String sum = "\nTotal is " + total;
        for(int i=0; i<times; i++){
            str += (int) value.get(i) + " ";
        }
        return str + sum ;
    }

    
}
