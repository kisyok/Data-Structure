/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab4.pkg1;

/**
 *
 * @author HP
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
    public void clear(){
        head = null;
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
   public void addFrontNode(T a){
       head = new ListNode(a, head);
   } 
   public void addSortNode(T a){
       if(head == null){
           addNode(a);
       }else{
           T currentNodeData = (T) head.getData();
           if(a.compareTo(currentNodeData)<0){//compare with head
               addFrontNode(a);
           }else{
               ListNode currentNode = head;
               while(true){
                   if(currentNode.getLink() != null){
                       if(a.compareTo((T)currentNode.getLink().getData())<0){//compare with second node
                           ListNode newNode = new ListNode(a, currentNode.getLink());
                           currentNode.setLink(newNode);
                           break;
                       }else{
                           currentNode = currentNode.getLink();
                       }
                   }else{//last node
                       ListNode newNode = new ListNode(a, null);
                       currentNode.setLink(newNode);
                       break;
                       
                   }
               }
           }
       }
   }
    
    
    
}
