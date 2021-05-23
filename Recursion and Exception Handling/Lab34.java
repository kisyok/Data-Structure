/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab34;

import java.util.Scanner;

/**
 *
 * @author Kisyok Indran Veerasamy
 */
public class Lab34 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String str;
        while(true){
        try { 
          System.out.println("Enter a sentence: ");
          str = s.next();
          if(str.length()>12)
              throw new Exception("The length of the string is greater than 12");
              break;
        } 
        catch(Exception e) { 
            System.out.println(e.getMessage()); 
            s.nextLine();
        }
        }
            System.out.println("The sentence is " + str);
        }
    } 

    
    

