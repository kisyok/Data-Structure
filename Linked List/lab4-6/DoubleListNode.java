/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab4.pkg6;

/**
 *
 * @author Kisyok Indran Veerasamy
 */
public class DoubleListNode <T>{
    private T data;
    private DoubleListNode previousLink;
    private DoubleListNode nextLink;

    public DoubleListNode() {
        data = null;
        previousLink = null;
        nextLink = null;
    }
    public DoubleListNode(T a, DoubleListNode b, DoubleListNode c) {
        data = a;
        previousLink = b;
        nextLink = c;
    }

    public T getData() {
        return data;
    }

    public DoubleListNode getPreviousLink() {
        return previousLink;
    }

    public DoubleListNode getNextLink() {
        return nextLink;
    }

    public void setData(T a) {
        data = a;
    }

    public void setPreviousLink(DoubleListNode a) {
        previousLink = a;
    }

    public void setNextLink(DoubleListNode a) {
        nextLink = a;
    }
    public void setLink(DoubleListNode a, DoubleListNode b){
        previousLink = a;
        nextLink = b;
    }

    @Override
    public String toString() {
        return  " <-- " + data + " --> ";
    }
    
    
    
    
    
}
