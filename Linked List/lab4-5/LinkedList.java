/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab4.pkg5;

import java.util.Iterator;

/**
 *
 * @author Kisyok Indran Veerasamy
 */
public class LinkedList <T extends Comparable<T>>{
    private ListNode head;

    public LinkedList() {
        head = null;
    }
     public int length(){
        int count = 0;
        ListNode currentNode = head;
        while(currentNode != null){
            currentNode = currentNode.getLink();
            count++;
        }
        return count;
    }
    public boolean isEmpty(){
        return (head==null);
    }
   
    public void showList(){
        ListNode currentNode = head;
        while(currentNode != null){
            System.out.print(currentNode.toString());
            currentNode = currentNode.getLink();
        }
    }
    public void addNode(T a){
        ListNode newNode = new ListNode(a, null);
        ListNode currentNode = head;
        if(head == null){
            head = newNode;
        }else{
            while(currentNode.getLink() != null){
                currentNode = currentNode.getLink();
            }
            currentNode.setLink(newNode);
        }
    }
        
        public void removeAtIndex(int index){
            if(index == 0){
                deleteFrontNode();
            }else if(index == length()-1){
                deleteNode();
            }else if(index >= length()){
                System.out.println("Invalid imdex. No node deleted");
            }else{
                ListNode currentNode = head;
                for(int i=1; i<index; i++){
                    currentNode = currentNode.getLink();
                }
                ListNode tempNode = currentNode.getLink();
                currentNode.setLink(tempNode.getLink());
                tempNode = null;
                }
            }
        
        public void deleteFrontNode(){
            if(head != null){
                head = head.getLink();
            }else{
                System.out.println("The list is empty");
            }
        }
        public void deleteNode(){
            ListNode currentNode = head;
            ListNode previousNode = head;
            if(head != null){
                if(currentNode.getLink() == null){
                    head = null;
                }
                else{
                    while(currentNode.getLink() != null){
                        previousNode = currentNode;
                        currentNode = currentNode.getLink();
                    }
                    previousNode.setLink(null);
                }
            }else{
                System.out.println("The list is empty");
            }
        }
        public LinkedListIterator listIterator(){
            return new LinkedListIterator();
        }
        
    private class LinkedListIterator<T> implements Iterator<T>{
                private ListNode<T> currentNode = head;
                private int n =-1;
     
        @Override
        public boolean hasNext(){
            n++;
            return currentNode != null;
     }
     
        @Override 
        public T next(){
            T data = (T) currentNode.getData();
            currentNode = currentNode.getLink();
            return data;
     }
     
        @Override
        public void remove(){
            removeAtIndex(n);
            n--;
     }
 }
}
        