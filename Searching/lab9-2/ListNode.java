//@author Kisyok Indran Veerasamy
package lab9.pkg2;

public class ListNode<T extends Comparable<T>> {
    private T data;
    private ListNode link;
    
    public ListNode() {
        data = null;
        link = null;
    }
    
    public ListNode(T a, ListNode b) {
        data = a;
        link = b;
    }
    
    public void setData(T a) {data = a;}
    public T getData() {return data;}
    
    public void setLink(ListNode a) { link = a;}
    public ListNode getLink() { return link; }
    
    public String toString() { return data + " --> " ; }    
}