/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tutor2.pkg2;

/**
 *
 * @author HP
 */
public class SpecialEncoding <T>{
    private T[] t;

    public SpecialEncoding(T[] t) {
        this.t = t;
      
    }
    
    public String toString() {
        System.out.print("The Code is");   
        for(int i=0; i<t.length;i++){
            System.out.print(" " + t[i]);
        }
        System.out.println();
        String a = "The command is ";
        for(int i=0; i<t.length;i++){
            if(t[i].equals(0)||t[i].equals('C')){
                a += "Copy ";
            }
            else if(t[i].equals(1)||t[i].equals('D')){
                a += "Delete ";
            }
            else if(t[i].equals(2)||t[i].equals('I')){
                a += "Insert ";
            }
            else if(t[i].equals(3)||t[i].equals('P')){
                a += "Print ";
            }
            else if(t[i].equals(4)||t[i].equals('R')){
                a += "Rename ";
            }
            else if(t[i].equals(5)||t[i].equals('V')){
                a += "Paste ";
            }
        }
         return a;
    }
    
    
    
}
