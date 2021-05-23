/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab5.pkg5;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Scanner;

/**
 *
 * @author Kisyok Indran Veerasamy
 */
public class Lab55 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String[] file = {"test.xml", "test2.xml", "test3.xml", "test4.xml"};
        for(int j=0; j<file.length; j++){
            
    try{
        Scanner in = new Scanner(new FileInputStream(file[j]));
        Stack<String> stack = new Stack<>();
        String[] line = new String[10];
        String str = "";
        String temp;
        System.out.println("Contents of XML file");
        
        int n = 0;
        while(in.hasNextLine()){
            line[n] = in.nextLine();
            System.out.println(line[n]);
            n++;
        }
        for(int i=0; i<line.length; i++){
            str = line[i];
            if(str == null){
                break;
            }
            temp = str;
            while(true){
                if(!temp.contains("\\/")){
                    temp = str.substring(str.indexOf("<")+1, str.indexOf(">"));
                    stack.push(temp);
                    stack = checkXML(stack);
                    str = str.replace("<" + temp + ">", "");
                }else{
                    temp = str.substring(str.indexOf("<")+1, str.indexOf(">"));
                    stack.push(temp);
                    stack = checkXML(stack);
                    str = str.replace("</" + temp + ">", "");
                }
                if(stack.isEmpty() || !str.contains("<")){
                    break;
                }
            }
            if(stack.isEmpty()){
                break;
            }
        }
    }catch(FileNotFoundException e){
        System.out.println("File Not Found");
    }
        }
    }
    public static Stack<String> checkXML(Stack<String> stack){
        String first, second;
        if(stack.getSize() >= 2){//to check for duplicate input
            first = stack.pop();
            second = stack.peek();
            if(first.contentEquals(second)){
                System.out.println("Duplicate root element " + "<" + first + ">" + "\n");
                while(!stack.isEmpty()){
                    stack.pop();
                }
                return stack;
            }else{
                stack.push(first);
            }
        }
        if(stack.peek().contains("/")){//check if the closing <\> is the same name
            first = stack.pop();
            second = stack.peek();
            if(first.replace("/", "").contentEquals(second)){
                stack.pop();
            }else if(!first.replace("/", "").contentEquals(second)){
                System.out.println("Begin element : " + "<" + second + ">" + " Invalid ending element : " + "<" + first + ">" + "\n");
                while(!stack.isEmpty()){
                    stack.pop();
                }
                return stack;
            }
        }
        if(stack.isEmpty()){
            System.out.println("The xml document is valid");
        }
        return stack;
    }
}
