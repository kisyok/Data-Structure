/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tutor6.pkg5;

/**
 *
 * @author Kisyok Indran Veerasamy
 */
public class Tutor65 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String[] input = {"Was it a car or a cat I saw?", "?civic#", "race car", "redrawer", "put   it up"};
        
       Queue<Character> a = new Queue<>();
       Stack<Character> b = new Stack<>();
       
       for(int i=0; i<input.length; i++){
           String input1 = input[i].toLowerCase();
           String check = "";
     
           for(int j=0; j<input1.length(); j++){
               if(Character.isLetterOrDigit(input1.charAt(j))){
                    check += input1.charAt(j);
                    a.enqueue(input1.charAt(j));
               }
           }
           while(!a.isEmpty()){
               b.push(a.dequeue());
           }
                String reverse = "";
                for(int k=check.length()-1; k>=0; k--){
                    reverse += b.pop();
                }
       
                if(check.equals(reverse)){
                    System.out.println(input[i] + " is a palindrome.");
                }else{
                    System.out.println(input[i] + " is not a palindrome.");
                }
       }
    }
}
