/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab9.pkg3;

import java.util.Scanner;

/**
 *
 * @author Kisyok Indran Veerasamy
 */
public class Lab93 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        
        ArrayHashTable<String, String> a = new ArrayHashTable<>();
        a.put("100-101", "ICND 1");
        a.put("200-101", "ICND 2");
        a.put("200-120", "CCNA Routing and Switching");
        a.put("210-260", "CCNA Security");
        
        System.out.println("The number of course is " + a.getSize());
        a.showHashTable();
        System.out.println("Adding a new course");
        a.put("300-101", "ROUTE");
        System.out.println("The number of course is " + a.getSize());
        a.showHashTable();
        System.out.println("Remove the course 200-101");
        a.remove("200-101");
        System.out.println("The number of course is " + a.getSize());
        a.showHashTable();
        System.out.print("Enter a source code to search : ");
        String in = s.nextLine();
        if(a.containsKey(in)){
            System.out.println(in + " : " + a.get(in));
        }
    }
    
}
