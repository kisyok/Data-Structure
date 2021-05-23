/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tutor2.pkg4;

/**
 *
 * @author HP
 */
public class Tutor24 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ArrayDice a = new ArrayDice();
        a.roll(5);
        System.out.println(a.toString());    
        LinkedListDice b = new LinkedListDice();
        b.roll(5);
        System.out.println(b.toString());   
    }
    
}
