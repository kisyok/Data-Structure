/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package count.i;

/**
 *
 * @author Kisyok Indran Veerasamy
 */
public class CountI {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      String a = "I like to eat ice-cream";
        int n=a.length();
        System.out.println("The number of 'i' in the string is " + count(a,n));
    }
    public static int count(String a, int n){
       if(n==1){
           if(a.charAt(0)=='i'||a.charAt(0)=='I'){
               return 1;
           }else{
               return 0;
           }
       }
       if(a.charAt(n-1)=='i'||a.charAt(n-1)=='I'){
           return count(a, n-1)+1;
       }else{
           return count(a, n-1);
       }
    }
}