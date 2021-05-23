/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab5.pkg3;

/**
 *
 * @author Kisyok Indran Veerasamy
 */
public class Lab53 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int N = 4;
        System.out.println("Solving the " + N + " Queens problem");
        NQueen Queen = new NQueen(N); 
        System.out.println("The number of solutions are : " + Queen.count);
        
    }
    
}
