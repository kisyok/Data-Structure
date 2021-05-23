/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab1.pkg3;

/**
 *
 * @author wif190017
 */
public class Lab13 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        SimpleNetwork a = new SimpleNetwork("Host 1", "10.1.1.1", "255.255.255.224", "UP");
        System.out.println(a.toString());
        
        SimpleNetwork b = new SimpleNetwork("Host 2", "10.1.1.2", "255.255.255.224", "DOWN");
        System.out.println(b.toString());
        
        SimpleNetwork c = new SimpleNetwork("Host 3", "10.1.1.70", "255.255.255.224", "UP");
        System.out.println(c.toString());
        
        SimpleNetwork d = new SimpleNetwork("Host 4", "10.1.1.15", "255.255.255.224", "UP");
        System.out.println(d.toString());
        
        a.ping(b);
        a.ping(c);
        a.ping(d);
                          
    }
    
}
