/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author jhoe
 */
public class Tester {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String text = "Welcome to FSKTM!\nPlease register your matrik no.\nPlease register your UMMail account.";
        TextFile a = new TextFile("g.txt");
        System.out.println("Write to text file");
        System.out.println(text);
        a.write(text);
        System.out.println("Read from text file");
        System.out.println(a.read());
        
        BinaryFile b = new BinaryFile("c.bin");
        System.out.println("Write to binary file");
        System.out.println(text);
        b.write(text);
        System.out.println("Read from binary file");
        System.out.println(b.read());
    }
    
}
