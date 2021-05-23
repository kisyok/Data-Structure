/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tutor2.pkg4;

import java.util.Random;

/**
 *
 * @author wif190017
 */
public class ArrayDice<T extends Comparable<T>> implements ADTDice<T> {
    private int[] value;
    private int times, total;
    private Random r;
    private final int MAX=6;
    
    public ArrayDice(){
        times=0;
        r = new Random();
    }
    
    public void roll(int n){
        times = n;
        total = 0;
        value = new int[n];
        for(int i=0; i<times; i++){
            value[i] = 1 + r.nextInt(MAX);
            total += value[i];
        }
    }
    public String toString(){
        String str = "";
        str = "Array implementation: Roll " + times + " times(s)\n";
        String sum = "\nTotal is " + total;
        for(int i=0; i<times; i++){
            str += value[i] + " ";
//            str += "\nTotal is " + total;
//            return str;
        }
       return str + sum;
    }
}
