/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author jhoe
 */
public class Tester {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        double[] coefficient = {4,2,-0.5,-20};
        Polynomial p = new Polynomial(3, coefficient);
        System.out.println("The polynomial is "+ p);
        p.evaluate(2);
        p.evaluate(-3.5);
    }
    
}
