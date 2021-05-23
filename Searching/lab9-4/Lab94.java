/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab9.pkg4;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Scanner;

/**
 *
 * @author Kisyok Indran Veerasamy
 */
public class Lab94 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {ArrayHashTableHashing<Integer, String> products = new ArrayHashTableHashing<>();
    Scanner in = new Scanner(System.in);    
    try {
            Scanner s = new Scanner(new FileInputStream(new File("lab9Q4.txt")));
            String line;
            while (s.hasNextLine()) {
                line = s.nextLine();
                products.put(Integer.valueOf(line.substring(0, 5)), line.substring(6));
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        System.out.println("The data set from the File");
        products.showHashTable();
        System.out.println("The Hash Table size is " + products.getSize());
        System.out.print("Enter a PID to search : ");
        String input = in.nextLine();
        if (products.containsKey(Integer.valueOf(input))) {
            System.out.println("Product ID : " + input + " " + products.get(Integer.valueOf(input)));
            System.out.println("Location : " + products.getLocation(Integer.valueOf(input)));
        } else {
            System.out.println("Product ID " + input + " cannot be found");
        }
    }
}