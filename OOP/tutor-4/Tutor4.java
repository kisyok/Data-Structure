/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tutor4;

import java.util.Arrays;

/**
 *
 * @author HP
 */
public class Tutor4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        SmartPhone[] a = new SmartPhone[4];
        SmartPhone b = new SmartPhone();
        a[0] = new SmartPhone("iPhone", 2400);
        a[1] = new SmartPhone("Samsung", 2200);
        a[2] = new SmartPhone("Nokia", 1400);
        a[3] = new SmartPhone("LG", 1800);
        
        System.out.println("List of Smart Phone");
        for(int i=0; i<a.length; i++){
            System.out.print(a[i].toString() + " ");
        }
        System.out.println();
        
        System.out.println("List of Smart Phone in ascending order of the price");
        for(int pass=1; pass<a.length; pass++){
            for(int i=0; i<a.length-1; i++){
                if(a[i].compareTo(a[i+1])>0){
                    b = a[i];
                    a[i] = a[i+1];
                    a[i+1] = b;
                }
            }
        }
        for(int i=0; i<a.length; i++){
            System.out.print(a[i].toString() + " ");
        }
    }
    
}
