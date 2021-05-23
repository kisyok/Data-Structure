/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab31.d;

/**
 *
 * @author Kisyok Indran Veerasamy
 */
public class Lab31D {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int a = 14;
        System.out.println("The binary number for " + a + " is " + DecToBin(a));
        //another method
        //System.out.println("The binary number for " + a + " is " + writeBinary(a));
    }
    public static int DecToBin(int a){
        if(a==0){
            return 0;
        }
        else{
            return (a%2) + (10 * DecToBin(a/2));
        }
    }
    //another method
    public static void writeBinary(int n){
        if(n==0||n==1){
            System.out.println(n);
        }
        else{
            writeBinary(n/2);
            System.out.println(n%2);
        }
    }
}
