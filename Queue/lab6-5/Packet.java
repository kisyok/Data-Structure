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
public class Packet implements Comparable<Packet> {
    private String type;
    private int priority;

    public Packet(String a, int b) {
        type = a;
        priority = b;
    }

    public String getType() {
        return type;
    }

    public int getPriority() {
        return priority;
    }

    @Override
    public String toString() {
        return type + " (priority=" + priority + ')';
    }
    
    
    public int compareTo(Packet a){
        return 0;
    }
}
