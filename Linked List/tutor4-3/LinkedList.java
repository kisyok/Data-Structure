/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tutor4.pkg3;

/**
 *
 * @author Kisyok Indran Veerasamy
 */
public class LinkedList <T extends Comparable <T>> {
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
    // to display the linked list
    public void showList(LinkedList a){
        ListNode currentNode = this.head;
        ListNode currentNodeA = a.head;
        while(currentNode != null){
            System.out.println("MYR " + currentNode.toString() + " : " + currentNodeA.toString());
            currentNode = currentNode.getLink();
            currentNodeA = currentNodeA.getLink();
        }
    }
    // to add new node at the back
    public void addNode(T a){
        ListNode newNode = new ListNode(a,null);
        ListNode currentNode = head;
        if(head==null){
            head = newNode;
        }else{
            while(currentNode.getLink() != null){
                currentNode = currentNode.getLink();
            }
            currentNode.setLink(newNode);
        }
    }
    //to convert amount to currency
    public void currency(int amount, LinkedList a){
        ListNode currentNode = this.head;
        ListNode currentNodeA = a.head;
        while(currentNode != null){
            int notes=0;
            while(amount >= (int)currentNode.getData()){
                amount = amount - (int)currentNode.getData();
                notes++;
            }
            currentNodeA.setData(notes);
            currentNode = currentNode.getLink();
            currentNodeA = currentNodeA.getLink();
            
        }
    }
    
    
    
}
