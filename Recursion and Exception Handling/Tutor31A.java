/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tutor31.a;

/**
 *
 * @author Kisyok Indran Veerasamy
 */
public class Tutor31A {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int[] num = {1,2,-1,4,5};
        int n = num.length;
        System.out.println("Smallest number: " + max(num,n));
    }
    public static int max(int num[], int n){
        if(n==1){
            return num[0];
        }
        else{
            return Math.min(num[n-1], max(num, n-1));
        }
    }
    
}
