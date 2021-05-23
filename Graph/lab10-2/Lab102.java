/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab10.pkg2;

import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.PriorityQueue;

/**
 *
 * @author HP
 */
public class Lab102 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Graph<String, Double> a = new Graph<>();
        a.addVertice("A");
        a.addVertice("B");
        a.addVertice("C");
        a.addVertice("D");
        a.addVertice("E");
        a.addVertice("F");
        a.addVertice("G");
        a.addVertice("H");
        
        a.addEdge("A", "B", 0.4);
        a.addEdge("A", "C", 0.1);
        a.addEdge("B", "C", 0.1);
        a.addEdge("B", "D", 0.2);
        a.addEdge("B", "E", 0.7);
        a.addEdge("C", "F", 0.3);
        a.addEdge("E", "H", 0.5);
        a.addEdge("F", "H", 0.4);
        a.addEdge("A", "G", 0.8);
        a.addEdge("G", "H", 0.8);
        
        System.out.println("Constructing a graph with 8vertices and 10 edges");
        a.showGraph();
        
        System.out.println("The shortest path from A - H by distance ");
        a.findPathBFS("A", "H");
        
        System.out.println("The shortest path from A - H by cost ");
        a.dijkstra(a, "A", "H"); 
    }
    
}