
package lab10.pkg2;

import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.PriorityQueue;

public class Graph<V extends Comparable<V>, E> {
    private GraphNode head;
    
    public Graph() {
        head = null;
    }

    public boolean isEmpty() {
        return (head==null);
    }
    
    public int getSize() {
        int count=0;    
        GraphNode currentNode = head;
        while (currentNode != null) {
            currentNode = currentNode.getVerticeLink();
            count++;
        }
        return count;
    }
    
    public void clear() {
        head=null;
    }
    
    public void showGraph() {
        GraphNode currentNode = head;
        while (currentNode != null) {
            System.out.println(currentNode.toString());
            Edge edgeNode = (Edge) currentNode.getEdgeLink();
            while (edgeNode != null) {
                  System.out.print(edgeNode.toString());
                  edgeNode = edgeNode.getEdgeLink();
            }
            System.out.println();
            currentNode = currentNode.getVerticeLink();
        }
    }
    
    public GraphNode hasVertice(V a) {
        GraphNode currentNode = head;        
        if (isEmpty()) {
            return null;
        }
        else {        
            while (currentNode!= null) {
                if (a.compareTo( (V) currentNode.getVertice())==0) {
                    return currentNode;
                }
                currentNode = currentNode.getVerticeLink();
            }
        }
        return null;
    }
    
    public void addVertice(V a) {
        GraphNode newNode =new GraphNode(a, null);
        GraphNode currentNode = head;        
        if (head==null) {
            head = newNode;
        }
        else {        
            while (currentNode.getVerticeLink()!= null) 
                currentNode = currentNode.getVerticeLink();            
            currentNode.setVerticeLink(newNode);
        }
    }
    
    public void markVertice(V a) {
        if (hasVertice(a)!=null) {
            GraphNode currentNode = head;       
            while (currentNode!= null) {
                if (a.compareTo( (V) currentNode.getVertice())==0) {
                    currentNode.setMarked(true);
                    break;
                }
                else
                    currentNode = currentNode.getVerticeLink();
            }        
        }
    }
    
    public boolean isMarked(V a) {
        if (hasVertice(a)!=null) {
            GraphNode currentNode = head;       
            while (currentNode!= null) {
                if (a.compareTo( (V) currentNode.getVertice())==0) 
                    return currentNode.getMarked();                    
                else
                    currentNode = currentNode.getVerticeLink();
            }   
        }
        return false;
    }
        
    public boolean addEdge(V from, V to, E weight) {
        if (hasVertice(from)==null || hasVertice(to)==null)
            return false;
        else {
            GraphNode currentNode = head;       
            while (currentNode!= null) {
               if (from.compareTo( (V) currentNode.getVertice())==0) {                
                    GraphNode temp = hasVertice(to);                    
                    Edge newNode = new Edge(temp, weight, null);
                    Edge edgeNode = (Edge) currentNode.getEdgeLink();
                    if (edgeNode==null)
                        currentNode.setEdgeLink(newNode);
                    else {
                        while(edgeNode.getEdgeLink()!=null)
                            edgeNode = edgeNode.getEdgeLink();
                        edgeNode.setEdgeLink(newNode);
                    }
                    return true;
                }
                else
                   currentNode = currentNode.getVerticeLink();
            }
        }
        return false;
    }
    
    public boolean deleteEdge(V from, V to) {
        if (!isEdge(from, to))
            return false;
        else {
            GraphNode currentNode = head;       
            while (currentNode!= null) {
                if (from.compareTo( (V) currentNode.getVertice())==0) {     
                    GraphNode temp = hasVertice(to); 
                    Edge previousNode =null;
                    Edge edgeNode = (Edge) currentNode.getEdgeLink();
                    while(edgeNode!=null) {
                        if (edgeNode.getVerticeLink()==temp) {
                            if (previousNode==null)
                                currentNode.setEdgeLink(edgeNode.getEdgeLink());
                            else 
                                previousNode.setEdgeLink(edgeNode.getEdgeLink());
                            return true;
                        }
                        else {
                            previousNode = edgeNode;
                            edgeNode = edgeNode.getEdgeLink();
                        }    
                    }
                }    
                else
                   currentNode = currentNode.getVerticeLink();
            }
        }
        return false;
    }
    
    public boolean isEdge(V from, V to) {
        if (hasVertice(from)==null || hasVertice(to)==null)
            return false;
        else {
            GraphNode currentNode = head;       
            while (currentNode!= null) {
                if (from.compareTo( (V) currentNode.getVertice())==0) {     
                    GraphNode temp = hasVertice(to); 
                    Edge edgeNode = (Edge) currentNode.getEdgeLink();
                    if (edgeNode==null)
                        return false;
                    else {
                        while(edgeNode!=null) {
                            if (edgeNode.getVerticeLink()==temp)
                                return true;
                            edgeNode = edgeNode.getEdgeLink();
                        }
                    }
                }
                else
                   currentNode = currentNode.getVerticeLink();
            }
        }
        return false;
    }
    
    public E getWeight(V from, V to) {
         if (isEdge(from, to)) {
            GraphNode currentNode = head;       
            while (currentNode!= null) {
                if (from.compareTo( (V) currentNode.getVertice())==0) {     
                    GraphNode temp = hasVertice(to); 
                    Edge edgeNode = (Edge) currentNode.getEdgeLink();
                    while(edgeNode!=null) {
                        if (edgeNode.getVerticeLink()==temp)
                            return (E) edgeNode.getWeight();
                        edgeNode = edgeNode.getEdgeLink();
                    }
                }    
                else
                   currentNode = currentNode.getVerticeLink();
            }
         }
         return null;    
    }
    
    public ArrayList getAdjacent(V a) {
        ArrayList<V> array = new ArrayList();
        if (hasVertice(a)!=null) {
            GraphNode currentNode = head;       
            while (currentNode!= null) {
                if (a.compareTo( (V) currentNode.getVertice())==0) {  
                    Edge edgeNode = (Edge) currentNode.getEdgeLink();
                    while (edgeNode!=null) {
                        array.add((V)edgeNode.getVerticeLink().getVertice());
                        edgeNode = edgeNode.getEdgeLink();
                    }
                    break;
                }  
                else
                    currentNode = currentNode.getVerticeLink();
            }   
        }       
        return array;
    }
//    public void findPathDFS(V from, V to){
//        ArrayList<V> adjacent;
//        Stack<V> nodeStack = new Stack<>();
//        Stack<V> pathStack = new Stack<>();
//        nodeStack.push(from);
//        while(true){
//            V top = nodeStack.peek();
//            markVertice(top);
//            if(to.compareTo(top)==0){
//                while(!nodeStack.isEmpty()){
//                    V node = nodeStack.pop();
//                    if(isMarked(node)){
//                        pathStack.push(node);
//                    }
//                }
//                 break;
//            }else{
//                adjacent = getAdjacent(top);
//                if(adjacent.size()==0){
//                    while(true){
//                        nodeStack.pop();
//                        if(!isMarked(nodeStack.peek())){
//                            break;
//                        }
//                    }
//                }else{
//                    for(int i=0; i<adjacent.size(); i++){
//                        nodeStack.push(adjacent.get(i));
//                    }
//                }
//            }
//        }
//        while(!pathStack.isEmpty()){
//            System.out.print(pathStack.pop().toString() + " --> ");
//        }
//        
//    }
    public void findPathBFS(V from, V to){
        ArrayList<V> adjacent;
        Queue<V> nodeQueue = new Queue<>();
        Queue<String> pathToNodeQueue = new Queue<>();
        boolean found = false;
        nodeQueue.enqueue(from);
        pathToNodeQueue.enqueue(from.toString());
        while(!found){
            V top = nodeQueue.dequeue();
            String topPath = pathToNodeQueue.dequeue();
            adjacent = getAdjacent(top);
            if(adjacent.size() != 0){
                for(int i=0; i<adjacent.size(); i++){
                    nodeQueue.enqueue(adjacent.get(i));
                    String str = topPath + " --> " + adjacent.get(i).toString();
                    pathToNodeQueue.enqueue(str);
                    if(to.compareTo(adjacent.get(i))==0){
                        found = true;
                        while(pathToNodeQueue.getSize() != 1){
                            pathToNodeQueue.dequeue();
                        }
                        System.out.println(pathToNodeQueue.dequeue() + " --> ");
                        break;
                    }
                }
            }
                
        }
    }
    public void dijkstra(Graph graph, String from, String to) {
        HashMap<String, Double> totalCosts = graph.getHashMap(from);
        HashMap<String, String> previousNodes = new HashMap<>();
        PriorityQueue<NodeAndWeight<String, Double>> queue = new PriorityQueue<>();
        DecimalFormat df = new DecimalFormat("#.0"); //1dp

        queue.minQueue(new NodeAndWeight(from, 0.0));
        while (!queue.isEmpty()) {
            NodeAndWeight node = queue.remove();
            String vertice = (String) node.getNode();
            graph.markVertice(vertice);

            ArrayList<String> adjascent = graph.getAdjacent(vertice);
            for (int i = 0; i < adjascent.size(); i++) {
                String neighbour = adjascent.get(i);
                if (!graph.isMarked(neighbour)) {
                    Double altPath = Double.sum(totalCosts.get(vertice), (Double) graph.getWeight(vertice, neighbour));
                    altPath = Double.valueOf(df.format(altPath));

                    Double currentValueOnNeighbour = Double.valueOf(String.valueOf(totalCosts.get(neighbour)));
                    if(altPath.compareTo(currentValueOnNeighbour) < 0) {
                        totalCosts.put(neighbour, altPath);
                        previousNodes.put(neighbour, vertice);
                        queue.minQueue(new NodeAndWeight(neighbour, altPath));
                    }
                }
            }
        }

        System.out.println("The shortest path from A - H by cost");
        System.out.println(getPath(previousNodes, from, to));
    }

    public String getPath(HashMap<String, String> hashMap, String from, String to) {
        String str = "";
        String hash = hashMap.toString(); // result: {B=A, C=B, D=B, E=B, F=C, G=A, H=F}
        hash = hash.replace("{", "");
        hash = hash.replace("}", "");
        hash = hash.replaceAll(" ", "");
        String[] values = hash.split(",");

        ArrayList<String> arrayList = new ArrayList<>();
        for (int i = 0; i < values.length; i++) { arrayList.add(values[i]); }

        String destination = to;
        str += destination + " -> ";
        while (true) {
            for (int i = 0; i < arrayList.size(); i++) {
                String s = arrayList.get(i);
                if (s.contains(destination)) {
                    String[] elem = s.split("=");
                    str = elem[1] + " -> " + str;
                    if (str.contains(from)) {
                        return str;
                    } else {
                        destination = elem[1];
                    }
                    arrayList.remove(s);
                    break;
                }
            }
        }
    }

    public class NodeAndWeight<A extends Comparable<A>, B extends Comparable<B>> implements Comparable<NodeAndWeight<A,B>>{
        private A node;
        private B weight;

        public NodeAndWeight(A node, B weight) {
            this.node = node;
            this.weight = weight;
        }

        @Override
        public int compareTo(NodeAndWeight<A, B> o) {
            if(node.compareTo(o.getNode()) == 0) {
                return 0;
            }
            return weight.compareTo(o.getWeight());
        }

        public A getNode() { return node; }
        public B getWeight() { return weight; }

        public String toString() {
            return node + " : " + weight;
        }
    }
}
