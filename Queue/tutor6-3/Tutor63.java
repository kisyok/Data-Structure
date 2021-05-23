/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tutor6.pkg3;

import java.util.Random;


/**
 *
 * @author Kisyok Indran Veerasamy
 */
public class Tutor63 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Random r = new Random();
        Queue<String> q = new Queue<>();
        System.out.println("Simulating a Queue to purchase MY phone");
        int C = 1;// no of customer
        int N = 0;//number of phones bought
        int p = 0;// no of phones bought
        int total = 30;
        while(N<=30){
            int phone = 1 + r.nextInt(3);
            p += phone;
            if(p<=30){//to check for the last customer especially (eg. currently N=28, newly generated phone can be 3)
            q.enqueue("Customer " + C + " : " + phone + " set(s)");
            C++;
            N += phone;
            }else{
                p -= phone;
            }
            if(N==30){
                C--;
                break;
            }
        }
        q.showQueue();
        System.out.println("Number of customers : " + C);
        System.out.println("P " + p);
    }
    
}
