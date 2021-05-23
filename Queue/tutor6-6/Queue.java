/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tutor6.pkg6;

/**
 *
 * @author Kisyok Indran Veerasamy
 */
public class Queue<T> {
    private ListNode head;
    
    public Queue(){
        head = null;
    }
    public boolean isEmpty(){
        return (head==null);
    }
    public int getSize(){
        int count = 0;
        ListNode currentNode = head;
        while(currentNode != null){
            currentNode = currentNode.getLink();
            count++;
        }
        return count;
    }
    public T dequeue(){
        if(head == null){
            return null;
        }
        T temp = (T) head.getData();
        head = head.getLink();
        return temp;
    }
    public void enqueue(T a){
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
    public T peek(){
        if(head == null){
            return null;
        }
        return (T) head.getData();
    }
   
    public void showQueue(){
        if(isEmpty()){
            System.out.println("Empty Queue");
        }else{
        ListNode currentNode = head;
        while(currentNode != null){
            System.out.print(currentNode.toString());
            currentNode = currentNode.getLink();
        }
        }
        
    }
    
}
