/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tutor10.pkg1;

import java.util.ArrayList;

/**
 *
 * @author HP
 */
public class Tutor101 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("Creating a graph with 7 vertices and 7 edges");
        ArrayGraph<String, Double> graph = new ArrayGraph<>();
        graph.addVertice("A");
        graph.addVertice("B");
        graph.addVertice("C");
        graph.addVertice("D");
        graph.addVertice("E");
        graph.addVertice("F");
        graph.addVertice("G");
        graph.addEdge("A", "B", 0.4);
        graph.addEdge("A", "C", 0.3);
        graph.addEdge("B", "C", 0.1);
        graph.addEdge("B", "D", 0.2);
        graph.addEdge("B", "E", 0.7);
        graph.addEdge("C", "F", 0.3);
        graph.addEdge("F", "G", 0.4);
        graph.showGraph();
        
        System.out.println("Remove edge from B to C");
        graph.deleteEdge("B", "C");
        graph.showGraph();
        
        System.out.println("The weightage from C to F: " + graph.getWeight("C", "F"));
        ArrayList<String> adjacent = graph.getAdjacent("B");
        System.out.print("The adjacent of B: ");
        for(int i=0; i<adjacent.size(); i++){
            System.out.print(adjacent.get(i) + " ");
        }
        System.out.println();
    }
    
}
