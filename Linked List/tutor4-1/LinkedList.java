/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tutor4.pkg1;

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
    public void showList(){
        ListNode currentNode = head;
        while(currentNode != null){
            System.out.print(currentNode.toString());
            currentNode = currentNode.getLink();
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
    //to add 10.5 for numbers>20
    public void add20(){
        int twenty = 20;
        ListNode currentNode = head;
        while(currentNode != null){
            if((double)currentNode.getData()>20){
                currentNode.setData((double)currentNode.getData()+10.5);
            }
            currentNode = currentNode.getLink();
        }
    }
    
    
    
}
