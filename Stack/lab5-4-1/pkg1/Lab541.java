/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab5.pkg4.pkg1;

import java.util.Scanner;

/**
 *
 * @author Kisyok Indran Veerasamy
 */
public class Lab541 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        String[] input = {"System.out.println(str.charAt(3);", "System.out.println(\"\\(No Error\");", "int[] num = 1, 2};", "if(arr[{3] < 4);"};
        
        for (int i = 0; i < input.length; i++) {
            System.out.print("Enter a expression : ");
            System.out.println(input[i]);
            check(input[i]);
            System.out.println();
        }
    }
    public static void check(String a) {
        Stack<Character> stack = new Stack<>();
        boolean balanced = true;
        System.out.println(a);
        for (int i = 0; i < a.length(); i++) {
            if (a.charAt(i) == '\\') {
                i += 2;
            }
            if (!isBracket(stack, a.charAt(i), i)) {
                balanced = false;
            }
        }
        for (int i = 0; i < stack.getSize(); i++) {
            balanced = false;
            char c = stack.pop();
            System.out.printf("%" + (a.length() - 1) + "s", " ");
            isMissing(c);
        }
        if (balanced) {
            System.out.println("The expression is balanced");
        }
    }

    public static boolean isBracket(Stack s, char c, int index) {
        boolean balanced = true;
        switch (c) {
            case '(':
                s.push(c);
                return true;
            case '[':
                s.push(c);
                return true;
            case '{':
                s.push(c);
                return true;
            case ')':
                if(!s.isEmpty()){
                    c = (char) s.pop();
                }
                else{
                    isExtra(c,index);
                    return false;
                }
                while (!(c == '(') && !s.isEmpty()) {
                    System.out.printf("%" + index + "s", " ");
                    isMissing(c);
                    if(!s.isEmpty()){
                        c = (char) s.pop();
                    }
                    else{
                        break;
                    }
                    balanced = false;
                }
                return balanced;
            case ']':
                if(!s.isEmpty()){
                    c = (char) s.pop();
                }
                else{
                    isExtra(c,index);
                    return false;
                }
                while (!(c == '[') && !s.isEmpty()) {
                    System.out.printf("%" + index + "s", " ");
                    isMissing(c);
                    if(!s.isEmpty()){
                        c = (char) s.pop();
                    }
                    else{
                        break;
                    }
                    balanced = false;
                }
                return balanced;
            case '}':
                if(!s.isEmpty()){
                    c = (char) s.pop();
                }
                else{
                    isExtra(c,index);
                    return false;
                }
                while (!(c == '{') && !s.isEmpty()) {
                    System.out.printf("%" + index + "s", " ");
                    isMissing(c);
                    if(!s.isEmpty()){
                        c = (char) s.pop();
                    }
                    else{
                        break;
                    }
                    balanced = false;
                }
                return balanced;
            default:
                return true;
        }
    }
     public static void isExtra(char c,int index){
        System.out.printf("%" + index + "s", " ");
        System.out.println("^ Extra " + c);
    }

    public static void isMissing(char c) {
        switch (c) {
            case '(':
                System.out.println("^ Missing )");
                break;
            case '[':
                System.out.println("^ Missing ]");
                break;
            case '{':
                System.out.println("^ Missing }");
                break;
            default:
                System.out.println("error" + c);
        }
    }
   
}