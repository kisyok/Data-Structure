/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab7.pkg2;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Scanner;

/**
 *
 * @author Kisyok Indran Veerasamy
 */
public class Lab72 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        try{
            Scanner s = new Scanner(new FileInputStream("lab7Q2.txt"));
            String line = "";
            while(s.hasNextLine()){
                line = s.nextLine();
            }
            
            String[] input = line.split(" ");
            BST<String> treeOri = new BST<>();
            BST<String> treeUnique = new BST<>();
            
            for(int i=0; i<input.length; i++){
                String str = "";
                    for(int j=0; j<input[i].length(); j++){
                        if(Character.isLetter(input[i].charAt(j))){
                            str += Character.toLowerCase(input[i].charAt(j));
                        }
                    }
                    treeOri.addNode(str);
                    if(!treeUnique.contains(str)){
                        treeUnique.addNode(str);
                    }
            }
            
            Queue<String> q = new Queue<>();
            for(int i=0; i<treeUnique.getSize(); i++){
                String word = treeUnique.getMinimum();
                treeUnique.remove(word);
                int occurrence = treeOri.getOccurence(word);
                String temp = "000" + occurrence + " " + word;
                q.enqueue(temp);
            }
            
            System.out.println("Word Frequency Generator Program");
            q.showQueue();
            s.close();
        }catch(FileNotFoundException e){
            System.out.println("File Not Found");
        }
    }
    
}
