/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab4.pkg7;

/**
 *
 * @author Kisyok Indran Veerasamy
 */
public class CircularLinkedList <T extends Comparable <T>>{
    private ListNode head;
    private ListNode tail;

    public CircularLinkedList() {
        head = null;
        tail = null;
    }
     
    public void addCircularNode(T a){
        ListNode newNode = new ListNode(a, null);
        if(head == null){
            head = newNode;
            tail = newNode;
            newNode.setLink(head);
        }
        else{
            tail.setLink(newNode);
            tail = newNode;
            tail.setLink(head);
            
        }
    }
    public int length(){
        ListNode currentNode = head;
        int count = 0;
        do{
            currentNode = currentNode.getLink();
            count++;
        }while(currentNode != head);
        return count;
    }
    public void deleteCircularNode(){
         ListNode currentNode = head;
        ListNode tempNode = head;
        while(currentNode.getLink().getLink() != head){
            currentNode = currentNode.getLink();
        }
        tempNode = currentNode;
        currentNode = currentNode.getLink();
        tempNode.setLink(head);
        currentNode = null;
    }
    public void showCircularNode(){
        ListNode currentNode = head;
        do{
            System.out.print(currentNode.toString());
            currentNode = currentNode.getLink();
        }while(currentNode != head);
        System.out.print(currentNode.toString());
    }
    public String getCircularItem(int index){
        ListNode currentNode = head;
        for(int i=1; i<index; i++){
            currentNode = currentNode.getLink();
        }
        return " " + currentNode.getData();
    }
}
