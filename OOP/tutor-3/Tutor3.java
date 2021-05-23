/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tutor.pkg3;

/**
 *
 * @author HP
 */
public class Tutor3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int mpbs = 5;
        int gb = 50;
        System.out.println(mpbs + "Mpbs Subscription and " + gb + "GB");
        DPlan b = new DPlan(mpbs,gb);
        System.out.print(b.toString());
        
        MPlan c = new MPlan(mpbs,gb);
        System.out.print(c.toString());
        
        if(b.price()>c.price()){
            System.out.println("\nMPlan is cheaper as compared to DPlan");
        }
        else{
            System.out.println("\nDPlan is cheaper as compared to MPlan");
  
        }
        
    }
    
}
