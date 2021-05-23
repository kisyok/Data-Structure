package lab10.pkg2;

public class GraphNode1<V , E> {
    private V vertice;
    private GraphNode1 verticeLink;
    private E edgeLink;
    private boolean marked;
    
    public GraphNode1() {
        vertice = null;
        verticeLink = null;
        edgeLink = null;
        marked=false;
    }
    
    public GraphNode1(V a, GraphNode1 b) {
        vertice = a;
        verticeLink = b;
        edgeLink = null;
        marked = false;
    }
    
    public void setVertice(V a) {vertice = a;}
    public V getVertice() {return vertice;}
    public void setMarked(boolean a) {marked = a;}
    public boolean getMarked() {return marked;}    
    public void setVerticeLink(GraphNode1 a) { verticeLink = a;}
    public GraphNode1 getVerticeLink() { return verticeLink; }    
    public void setEdgeLink(E a) { edgeLink = a;}
    public E getEdgeLink() { return edgeLink; }    
    public String toString() { return vertice + " --> " ; }     
}

