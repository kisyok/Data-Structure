/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab9.pkg5;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Scanner;

/**
 *
 * @author Kisyok Indran Veerasamy
 */
public class Lab95 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        ArrayHashTableChain<Integer, String> products = new ArrayHashTableChain<>();
        try {
            Scanner in = new Scanner(new FileInputStream(new File("lab9Q4.txt")));
            String line;
            while (in.hasNextLine()) {
                line = in.nextLine();
                products.put(Integer.valueOf(line.substring(0, 5)), line.substring(6));
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        System.out.println("The data set from the File");
        products.showHashTable();
        System.out.println("The Hash Table size is " + products.getSize());
        System.out.print("Enter a PID to search : ");
        String input = s.nextLine();
        if (products.containsKey(Integer.valueOf(input))) {
            System.out.println("Product ID : " + input + " " + products.get(Integer.valueOf(input)));
            System.out.println("The elements in the same location are : ");
            products.printLocation(Integer.valueOf(input));
        } else {
            System.out.println("Product ID " + input + " cannot be found");
        }
    }
}