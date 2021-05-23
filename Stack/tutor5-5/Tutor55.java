/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tutor5.pkg5;

/**
 *
 * @author Kisyok Indran Veerasamy
 */
public class Tutor55 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        balance("(())");
        balance(")()(");
        balance("((())())()");
        balance("(())()))");
        balance("())");
        
        
    }
    public static void balance(String s){
        Stack<Character> stack = new Stack<>();
        for(int i=0; i<s.length(); i++){
            if(s.charAt(i) == '('){
                stack.push(s.charAt(i));
            }else if(!stack.isEmpty() && s.charAt(i) == ')' && stack.peek() == '('){
                stack.pop();
            }
            else{
                stack.push(s.charAt(i));
            }
        }
        if(stack.isEmpty()){
            System.out.println(s + " is balanced");
        }else{
            System.out.println(s + " is not balanced");
        }
       
    }
    
    
}
