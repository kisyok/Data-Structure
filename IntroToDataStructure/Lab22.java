/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab2.pkg2;

/**
 *
 * @author wif190017
 */
public class Lab22 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    TextFileLog<String> a = new TextFileLog<>(5);   
    a.insert("James");
    a.insert("Ahamad");
    a.insert("Siti");
    a.insert("Ramesh");
    a.insert("John");
    a.insert("Nakul");
    
    String name = "Siti";
    System.out.println("Searching for " + name + " in the file");
    if(a.search(name)){
        System.out.println("The text file contains " + name);
    }
    else{
        System.out.println("The text file does not contain " + name);

    }
    
    a.clear();
        System.out.println("Text File Log Size " + a.size());
    } 
}
