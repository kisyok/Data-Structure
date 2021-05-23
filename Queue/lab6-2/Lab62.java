/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab6.pkg2;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Scanner;



/**
 *
 * @author Kisyok Indran Veerasamy
 */
public class Lab62 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        try{
           Scanner in = new Scanner(new FileInputStream("lab6Q2.txt"));
           String line = "";
           
           Queue<String> a = new Queue<>();
           Queue<String> b = new Queue<>();
           
           while(in.hasNextLine()){
               line = in.nextLine();
               String arr[] = line.split(" ");
               for(int i=0; i<arr.length; i++){
                   a.enqueue(arr[i]);
                if(arr[i].contains("P0") && !b.has(arr[i])){
                    b.enqueue(arr[i]);
                }
               }
           }
            System.out.print("Product Code in Queue : ");
            b.showQueue();
            System.out.println("\nList of products by categories");
            int iteration = b.getSize();
            for(int j=0; j<iteration; j++){
                Queue<String> q = new Queue<>();
                String product = b.dequeue();
                System.out.println("Product : " + product);
                if(a.has(product)){
                    a.check(q, product);
                }
                q.showQueue();
                System.out.println();
            }
           in.close();
       }catch(FileNotFoundException e){
               System.out.println("File Not Found");
               }
    
}
}
