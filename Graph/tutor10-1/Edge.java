/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tutor10.pkg1;

/**
 *
 * @author HP
 */
public class Edge<E> {
    private GraphNode verticeLink;
    private E weight;
    
    public Edge(){
        verticeLink = null;
        weight = null;
    }
    public Edge(GraphNode verticeLink, E weight){
        this.verticeLink = verticeLink;
        this.weight = weight;
    }

    public GraphNode getVerticeLink() {
        return verticeLink;
    }

    public E getWeight() {
        return weight;
    }

    public void setVerticeLink(GraphNode verticeLink) {
        this.verticeLink = verticeLink;
    }

    public void setWeight(E weight) {
        this.weight = weight;
    }

    @Override
    public String toString() {
        return " --> " + verticeLink.getVertice() + " : " + getWeight();
    }
    
}
