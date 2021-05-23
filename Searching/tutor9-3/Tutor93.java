/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tutor9.pkg3;

import java.util.Scanner;

/**
 *
 * @author Kisyok Indran Veerasamy
 */
public class Tutor93 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Hash Table");
        HashTable<String, String> a = new HashTable<>();
        a.put("100-101", "ICND 1");
        a.put("200-101", "ICND 2");
        a.put("200-120", "CCNA Routing and Switching");
        a.put("210-260", "CCNA Security");
        System.out.print("The number of elements in the Hash Table " + a.getSize() + "\n");
        a.showHashTable();
        System.out.print("\nEnter a code to search : ");
        String x = s.nextLine();
        if(a.containsKey(x)){
            System.out.println("Course " + x + " : " + a.get(x));
        }else{
            System.out.println("The course " + x + " cannot be found");
        }
    }
    
}
