/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab6.pkg5;

/**
 *
 * @author Kisyok Indran Veerasamy
 */
public class Lab65 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Packet n1 = new Packet("Video 1", 1);
        Packet n2 = new Packet("Video 2", 2);
        Packet n3 = new Packet("Video 3", 0);
        Packet n4 = new Packet("Video 4", 0);
        Packet n5 = new Packet("Video 5", 2);
        Packet n6 = new Packet("Video 6", 1);
        Packet n7 = new Packet("Video 7", 2);
        Packet n8 = new Packet("Video 8", 2);
        Packet n9 = new Packet("Video 9", 0);
        Packet n10 = new Packet("Video 10", 1);
        
        PriorityQueue<Packet> q = new PriorityQueue<>();
        System.out.println("10 packets arrived");
        Packet[] packet = {n1,n2,n3,n4,n5,n6,n7,n8,n9,n10};
        for(int i=0;i <packet.length; i++){
            System.out.println(packet[i].toString());
            q.PriorityEnqueue(packet[i]);
        }  
        
        System.out.println("\nProcessing 10 network packets");
         for(int i=0;i <packet.length; i++){
            System.out.println(q.PriorityDequeue());
        }
        
        

    }
    
}
