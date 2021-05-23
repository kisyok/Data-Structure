/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tutor2.pkg3;

/**
 *
 * @author HP
 */
public class Tutor23 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    maximum(42,15,58);    
    maximum(12.45,41.28,19.82);
    }
    public static <T extends Comparable<T>> void maximum(T t, T u, T v){
        System.out.print("The maximum value of " + t + " " + u + " " + v + " is ");

        if(t.compareTo(u)>0 && t.compareTo(v)>0){
            System.out.println(t);
       }
        else if(u.compareTo(t)>0 && u.compareTo(v)>0){
            System.out.println(u);
       }
        else if(v.compareTo(t)>0 && v.compareTo(u)>0){
            System.out.println(v);
       }
            
        
    }
}
