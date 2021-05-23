/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab33;

/**
 *
 * @author Kisyok Indran Veerasamy
 */
public class Lab33 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        char a = '$';
        int b=3, c=3;
        System.out.println("using writeLine");
        writeLine(a,b);
        System.out.println("\nusing writeBlock");
        writeBlock(a,b,c);
    }
    public static void writeLine(char a, int b){
        if(b>0){
            System.out.print(a);
            writeLine(a,b-1);
        }
    }
    public static void writeBlock(char a, int b, int c){
        if(c>0){
            if(b>0){
            System.out.print(a);
            writeLine(a,b-1);
        }
            System.out.println("");
            writeBlock(a,b,c-1);
        }
    }
}
