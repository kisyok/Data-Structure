/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tutor4.pkg5;

import java.util.Random;

/**
 *
 * @author Kisyok Indran Veerasamy
 */
public class LinkedList <T extends Comparable <T>> {
    private ListNode head;
    private Random r;

    public LinkedList() {
        head = null;
    }
    public boolean isEmpty(){
        return head==null;
    }
     public void showList(){
        ListNode currentNode = head;
        while(currentNode != null){
            System.out.print(currentNode.toString());
            currentNode = currentNode.getLink();
        }
    }

     
     public void addNode(int a){
         int i=0;
         while(i<a){
         r = new Random();
        ListNode newNode = new ListNode(r.nextInt(11), null);
        ListNode currentNode = head;
        if(head == null){
            head = newNode;
        }else{
            while(currentNode.getLink() != null){
                currentNode = currentNode.getLink();
            }
            currentNode.setLink(newNode);
        }
        i++;
    }
}
      
     public void delete(int a){
         ListNode currentNode = head;
         ListNode tempNode = head;
         if(!isEmpty()){
         while(currentNode.getLink() != null){
            if((int)head.getData()==a){//to check the head
                 head = head.getLink();
             }else if((int)currentNode.getLink().getData()==a){//to check second node up to second last node
                 tempNode = currentNode.getLink();
                 currentNode.setLink(tempNode.getLink());
                 tempNode = null;
                 continue;
             }
            currentNode = currentNode.getLink();
         }
         if((int)currentNode.getData()==a){//to check last node
             currentNode = null;
         }
     }else{
        System.out.println("The list is empty");
     }
}
}