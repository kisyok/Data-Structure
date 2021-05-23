/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab6.pkg4;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Scanner;

/**
 *
 * @author Kisyok Indran Veerasamy
 */
public class Lab64 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Queue<int[]> q = new Queue<>();
        Queue<String> print = new Queue<>();
        int gain = 0;
        
        try{
            Scanner s = new Scanner(new FileInputStream("lab6Q4.txt"));
            
            String type = "";
            while(s.hasNextLine()){
                String[] temp = s.nextLine().split(" ");
                if(temp[1].equals("B")){
                    type = "Buy";
                    int[] input = {Integer.parseInt(temp[2]), Integer.parseInt(temp[3])};
                    q.enqueue(input);
                }else if(temp[1].equals("S")){
                    type = "Sell";
                    int n = 0;
                    int sold = Integer.parseInt(temp[2]);
                    while(n!=sold){
                        int[] input = q.dequeue();
                        n += input[0];
                        if(n>sold){
                            gain += (input[0]-(n-sold))*((Integer.parseInt(temp[3]))-input[1]);
                            break;
                        }else{
                            gain += input[0]*(Integer.parseInt(temp[3])-input[1]);
                        }
                    }
                }
                String str = "Day " + temp[0] + " : " + type + " " + temp[2] + " shares at RM " + temp[3];
                print.enqueue(str);
            }
            print.showQueue();
            System.out.println("Total Gain " + gain);
            s.close();
        }catch(FileNotFoundException e){
            System.out.println("File Not Found");
        }
    }
    
}
