/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab31.e;

/**
 *
 * @author Kisyok Indran Veerasamy
 */
public class Lab31E {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println(compute(5));
    }
    public static int compute(int n){
        if(n>0){
            return (n*n*n) + compute(n-1);
        }
        return 0;
    }
}
