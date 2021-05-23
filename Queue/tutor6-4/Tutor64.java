/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tutor6.pkg4;

/**
 *
 * @author Kisyok Indran Veerasamy
 */
public class Tutor64 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       String[] input = {"kayak", "Welcome", "Was it a car or a cat I saw?", "civic", "race car"};
       Queue<Character> a = new Queue<>();
       Stack<Character> b = new Stack<>();
       for(int i=0; i<input.length; i++){
           char[] arr = input[i].toCharArray();
           for(int j=0; j<arr.length; j++){
               a.enqueue(arr[j]);
           }
           while(!a.isEmpty()){
                b.push(a.dequeue());
           }
           String reverse = "";
           for(int k=0; k<input[i].length(); k++){
               reverse += b.pop();
           }
                if(input[i].equals(reverse)){
                    System.out.println(input[i] + " is a palindrome.");
                }else{
                    System.out.println(input[i] + " is not a palindrome.");
                }
       }
       
      
    }
    
}
