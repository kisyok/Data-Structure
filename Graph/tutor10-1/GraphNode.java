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
public class GraphNode<V> {
    private V vertice;
    private Edge[] edges = new Edge[ArrayGraph.MAX_SIZE];
    private boolean marked;
    
    public GraphNode(){
        vertice = null;
        marked = false;
    }
    public GraphNode(V a){
        this.vertice = a;
        marked = false;
    }

    public V getVertice() {
        return vertice;
    }

    public Edge[] getEdgesArray() {
        return edges;
    }

    public boolean isMarked() {
        return marked;
    }

    public void setVertice(V vertice) {
        this.vertice = vertice;
    }

    public void setMarked(boolean marked) {
        this.marked = marked;
    }

    @Override
    public String toString() {
        return vertice + " -- > ";
    }

    
    
}
