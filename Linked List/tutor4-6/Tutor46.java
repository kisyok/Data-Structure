/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tutor4.pkg6;

/**
 *
 * @author Kisyok Indran Veerasamy
 */
public class Tutor46 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        LinkedList<Integer> list = new LinkedList<>();
        list.addFrontNode(78);
        list.addFrontNode(45);
        list.addFrontNode(34);
        list.addFrontNode(23);
        list.addFrontNode(17);
        list.addFrontNode(10);
        list.addFrontNode(8);
        list.showList();
        list.median();
    }
    
}
