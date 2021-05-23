/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab5.pkg2;

import java.util.Scanner;

/**
 *
 * @author Kisyok Indran Veerasamy
 */
public class Lab52 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String[] input = {"34 add 11 mul 7", "ob 300 mul 75 add 4350 cd div 15 add 1126", "ob ob 5 add 8 cd sub ob 7 sub 3 cd cd mul 8 add 25 mod 3"};
        for(int j=0; j<input.length; j++){
            
        System.out.print("Enter infix expression : " + input[j]);
        String[] edit = input[j].split(" ");
        
        for(int i=0; i<edit.length; i++){
            if(edit[i].equals("add")){
                edit[i] = "+";
            }
            else if(edit[i].equals("sub")){
                edit[i] = "-";
            }
            else if(edit[i].equals("mul")){
                edit[i] = "*";
            }
            else if(edit[i].equals("div")){
                edit[i] = "/";
            }
            else if(edit[i].equals("mod")){
                edit[i] = "%";
            }
            else if(edit[i].equals("ob")){
                edit[i] = "(";
            }
            else if(edit[i].equals("cd")){
                edit[i] = ")";
            }
        }
        System.out.print("\nThe inflix expression is: ");
        for(int i=0; i<edit.length; i++){
            System.out.print(edit[i] + " ");
        }
        System.out.print("\nThe postfix expression is: " + infixToPostfix(edit));
        System.out.println("\nThe result is: " + postfixEvaluation(infixToPostfix(edit)));
            System.out.println();
        }
        
    }
    
    public static String infixToPostfix(String[] a){
        String output = "";
        String temp = "";
        Stack<String> stack = new Stack<>();
        for(int i=0; i<a.length; i++){
            temp = a[i];
            if(!containsOperator(temp))
                output += temp + " ";
            else if(temp.equals("("))
                stack.push(temp);
            else if(temp.equals(")")){
               while(!stack.isEmpty() && stack.peek() != "("){
                   output += stack.pop() + " ";
               }
               if(stack.isEmpty()){
                   return "Expression is not valid";
               }
               else{
                   stack.pop();
               }
            }
            else{//operator encountered
                while(!stack.isEmpty() && (getPriority(temp) <= getPriority(stack.peek()))){
                    output += stack.pop() + " ";
                }
                stack.push(temp);
            }
        }
        while(!stack.isEmpty()){
            output += stack.pop() + " ";
        }
        return output;
    }
                
    public static boolean containsOperator(String a){
        if(a.equals("(")||a.equals(")")||a.equals("+")||a.equals("-")||a.equals("*")||a.equals("/")||a.equals("%")){
            return true;
        }
        return false;
    }
    
    public static int getPriority(String a){
        switch(a){
            case "*":
            case "/":
            case "%":
                return 2;
            case "+":
            case "-":
                return 1;
            default:
                return 0;
        }
    }
    public static int postfixEvaluation(String a){
        Stack<String> stack = new Stack<>();
        String[] split = a.split(" ");
        int num1 = 0, num2 = 0, result = 0;
        String temp;
        for(int i=0; i<split.length; i++){
            if(!containsOperator(split[i])){
                 temp = split[i];
                stack.push(temp);
            }else{
                num2 = Integer.parseInt(stack.pop());
                num1 = Integer.parseInt(stack.pop());
                result = getResult(num1, num2, split[i]);
                stack.push(result + "");
            }
        }
       result = Integer.parseInt(stack.pop());
       return result;
    }
    
    public static int getResult(int a, int b, String c){
        switch(c){
            case "+":
                return a+b;
            case "-":
                return a-b;
            case "*":
                return a*b;
            case "/":
                return a/b;
            case "%":
                return a%b;
            default:
                return 0;
        }
    }
    
}
