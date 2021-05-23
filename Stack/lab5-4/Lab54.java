/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab5.pkg4;

import java.util.Scanner;

/**
 *
 * @author Kisyok Indran Veerasamy
 */
public class Lab54 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
       String[] as = {"System.out.print(str.charAt(3);", "System.out.println(\"\\( No Error\");", "int[] num = 1,2};", "if (arr[{3] < 4)"};
       for(int i=0; i<as.length; i++){
       System.out.print("Enter an expression : " + as[i]);
       System.out.println("\n" + as[i]);
       check(as[i]);
       System.out.println("");
       }
    }
    public static void check(String a){
        String str = "";
        Stack<Character> stack = new Stack<>();
        char temp = ' ';
       for(int i=0; i<a.length(); i++){
            temp = a.charAt(i);
            if(temp == '\\'){
                i++;
                continue;
            }
            if(isOpenBracket(temp)){
                stack.push(temp);
            }else if(isCloseBracket(temp)){
                if(!stack.isEmpty()){
                    char peek = stack.peek();
                    if(getPair(temp)==peek){
                        stack.pop();
                    }else if(getPair(temp) != peek){
                        for (int b = 0; b < i; b++) System.out.print(" ");
                            if(stack.show(i, getPair(temp))){
                                break;
                            }else{
                        System.out.println("^ Missing " + getPair(temp));
                        break;
                            }
                    }
                }else{//stack is not empty and found close bracket
                    for (int b = 0; b < i; b++) System.out.print(" ");
                    System.out.println("^ Extra " + temp);
                    stack.push(temp);
                    break;
            }
           
        }
       
            if(temp == ';' && !stack.isEmpty() && isOpenBracket(stack.peek())){
                for (int b = 0; b < i; b++) System.out.print(" ");
                System.out.println("^ Missing " + getPair(stack.peek()));
                break;
            }
       }
            if(stack.isEmpty()){
                System.out.println("The expression is balanced");
            }else{
                System.out.println("^ Missing " + getPair(stack.pop()));
            }
        
    }
    public static char getPair(char a){
        if(a == '('){
            return ')';
        }else if(a == '['){
            return ']';
        }else if (a == '{'){
            return '}';
        }else if(a == ')'){
            return '(';
        }else if(a == ']'){
            return '[';
        }else if (a == '}'){
            return '{';
        }
        return ' ';
    }
    public static boolean isOpenBracket(char a){
        if(a == '(' || a == '{' || a == '['){
            return true;
        }
        return false;
    }
     public static boolean isCloseBracket(char a){
        if(a == ')' || a == '}' || a == ']'){
            return true;
        }
        return false;
    }
    
}
