/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tutor6.pkg6;

import java.util.Scanner;

/**
 *
 * @author Kisyok Indran Veerasamy
 */
public class Tutor66 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //A queue is a First In First Out (FIFO) data structure.
        Scanner s = new Scanner(System.in);
        System.out.print("Enter a sentence : ");
        String input = s.nextLine();
        Queue<String> a = new Queue<>();
        Queue<String> b = new Queue<>();
        Queue<String> c = new Queue<>();
        
        String arr[] = input.split(" ");
        for(String d : arr){
            a.enqueue(d);
        }
        System.out.print("The original sentence : ");
        a.showQueue();
        
        while(c.getSize() != arr.length){
            if(!a.isEmpty()){
                while(a.getSize() != 1){
                    b.enqueue(a.dequeue());
                }
                c.enqueue(a.dequeue());
            }else if(!b.isEmpty()){
            while(b.getSize() != 1){
                a.enqueue(b.dequeue());
            }
            c.enqueue(b.dequeue());
        } 
    }
        System.out.print("\nReverse all the elements in the queue: ");
        c.showQueue();
    }
    //another method
    public static Queue reverse(Queue a){
        
        if(a.isEmpty()){
          return a;
       }else{
          String data = (String)a.dequeue();
          reverse(a);
          a.enqueue(data);
          return a;
       }
    }
}
