/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab4.pkg5;

import java.util.Iterator;

/**
 *
 * @author Kisyok Indran Veerasamy
 */
public class Lab45 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        LinkedList<String> list = new LinkedList<>();
        list.addNode("ARS");
        list.addNode("AST");
        list.addNode("CHE");
        list.addNode("LEI");
        list.addNode("MAN");
        list.addNode("LIV");
        list.addNode("TOT");
        
        System.out.print("The list consists of ");
        list.showList();
        System.out.println("\nRemove all the words that consists of the A character using iterator");
        
        Iterator<String> iterator = list.listIterator();
        while(iterator.hasNext()){
            String str = iterator.next();
            if(str.contains("A")){
                iterator.remove();
            }
        }
        System.out.print("The updated list consists of ");
        list.showList();
    }
    
}
