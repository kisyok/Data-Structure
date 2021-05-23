/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tutor4.pkg6;

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
    public void addFrontNode(T a){
        head = new ListNode(a, head);
    }
    public void median(){
        ListNode slowNode = head;
        ListNode fastNode = head;
        ListNode tempNode = null;
        if( head != null){
            while(fastNode != null && fastNode.getLink() != null ){
                fastNode = fastNode.getLink().getLink();
                tempNode = slowNode;
                slowNode = slowNode.getLink();
            }
            if(length() % 2 == 0){
            System.out.println("\nThe median is " + ((int) slowNode.getData() +  (int) tempNode.getData())/2);
            }
            else{
                System.out.println("\nThe median is " + slowNode.getData());
            }
        }
    }
    
    
    
}
