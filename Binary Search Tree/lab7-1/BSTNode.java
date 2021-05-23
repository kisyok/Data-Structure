/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab7.pkg1;

/**
 *
 * @author Kisyok Indran Veerasamy
 */
public class BSTNode<T extends Comparable<T>> {
    private T data;
    private BSTNode leftLink;
    private BSTNode rightLink;

    public BSTNode() {
        data = null;
        leftLink = null;
        rightLink = null;
    }
    public BSTNode(T a, BSTNode b, BSTNode c) {
        data = a;
        leftLink = b;
        rightLink = c;
    }

    public T getData() {
        return data;
    }

    public BSTNode getLeft() {
        return leftLink;
    }

    public BSTNode getRight() {
        return rightLink;
    }

    public void setData(T a) {
        data = a;
    }

    public void setLeft(BSTNode a) {
        leftLink = a;
    }

    public void setRight(BSTNode a) {
        rightLink = a;
    }
    
    
}
