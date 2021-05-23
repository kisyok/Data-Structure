/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab31.c;

/**
 *
 * @author Kisyok Indran Veerasamy
 */
public class Lab31C {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int a=54, b=24;
        System.out.println("The GCD of " + a + " and " + b + " is " + GCD(a,b) );
    }
    public static int GCD(int a, int b){
        if(a==0){
            return b;
        }
        else if(b==0){
            return a;
        }
        else if(a==b){
            return a;
        }
        else if(a>b){
            return GCD(a-b,b);
        }
        else if(b>a){
            return GCD(a,b-a);
        }
        return 0;
    }
    
}
