/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab10.pkg1;

/**
 *
 * @author HP
 */
public class Lab101 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Graph<String, Integer> a = new Graph<>();
        a.addVertice("A");
        a.addVertice("B");
        a.addVertice("C");
        a.addVertice("D");
        a.addVertice("E");
        a.addVertice("F");
        a.addVertice("G");
        
        a.addEdge("A", "B", 1);
        a.addEdge("A", "C", 1);
        a.addEdge("B", "D", 1);
        a.addEdge("B", "E", 1);
        a.addEdge("C", "F", 1);
        a.addEdge("E", "G", 1);
        
        a.showGraph();
        
        System.out.println("Find the path from A to G ");
        System.out.print("The path is : ");
        a.findPathDFS("A", "G");
    }
    
}
