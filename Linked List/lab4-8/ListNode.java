//@author Kisyok Indran Veerasamy
package lab4.pkg8;


public class ListNode<T> {

    private T data;
    private ListNode listNode;

    public ListNode() {
        data = null;
        listNode = null;
    }

    public ListNode (T a, ListNode b) {
        data = a;
        listNode = b;
    }

    public void setData(T a) {
        data = a;
    }

    public T getData() {
        return data;
    }

    public void setLink(ListNode listNode) {
        this.listNode = listNode;
    }

    public ListNode getLink() {
        return listNode;
    }

    public String toString() {
        return data + " --> ";
    }
}
