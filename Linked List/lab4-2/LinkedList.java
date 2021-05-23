/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab4.pkg2;

/**
 *
 * @author Kisyok Indran Veerasamy
 */
public class LinkedList <T extends Comparable<T>>{
    public ListNode head;

    public LinkedList() {
        head = null;
    }
    public ListNode getHead(){
        return head;
    }
    public void setHead(ListNode head){
        this.head = head;
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
    public void splitList(){
        System.out.println("\nSplit the list into two");
        ListNode currentNode = head;
        ListNode middleNode;
        ListNode secondNode;
        
        int length = length()/2;
        if(length() % 2 != 0){
            length++;
        }
        int index;
        System.out.print("First List: ");
        for(index = 0; index<length; index++){
            System.out.print(currentNode.toString());
            currentNode = currentNode.getLink();
        }
        System.out.println();
        
        secondNode = currentNode;
        middleNode = currentNode;
        for(int i=index; i<length; i++){
            secondNode.setLink(currentNode.getLink());
            if(currentNode.getLink() != null){
                secondNode = secondNode.getLink();
                currentNode = currentNode.getLink();
            }
        }
        secondNode = middleNode;
        System.out.print("Second List: ");
        while(secondNode != null){
            System.out.print(secondNode.toString());
            secondNode = secondNode.getLink();
        }
        System.out.println();
    }
    public void alternateList(LinkedList first, LinkedList second){
        System.out.println("\nSplit the list by alternating the nodes");
        ListNode currentNode = head;
        System.out.print("First List: ");
        while(currentNode.getLink() != null){
            System.out.print(currentNode.toString());
            first.addNode((char)currentNode.getData());
            currentNode = currentNode.getLink().getLink();
        }
            System.out.println(currentNode.toString());
            first.addNode((char)currentNode.getData());
        
        currentNode = head.getLink();
        System.out.print("Second List: ");
        while(currentNode.getLink().getLink() != null){
            System.out.print(currentNode.toString());
            second.addNode((char)currentNode.getData());
            currentNode = currentNode.getLink().getLink();
        }
        System.out.print(currentNode.toString());
        second.addNode((char)currentNode.getData());
    }
    
    public void mergeList(LinkedList first, LinkedList second){
        System.out.println("\n\nMerge First List and Second List by alternating nodes");
        ListNode currentNode1 = first.head;
        ListNode currentNode2 = second.head;
        int length = first.length() + second.length();
        while(currentNode1 != null){
            System.out.print(currentNode1.toString());
            currentNode1 = currentNode1.getLink();
            if(currentNode2 != null){
            System.out.print(currentNode2.toString());
            currentNode2 = currentNode2.getLink();
            }
        }
    }
                    
     public void reverse(ListNode node) {
        if (head.getLink() != null) {
            ListNode newNode = new ListNode(head.getData(), node);
            head = head.getLink();
            reverse(newNode);
        } else {
            head = new ListNode(head.getData(), node); // last node
            showList();
        }
    }
    
}
