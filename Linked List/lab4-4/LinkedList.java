/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab4.pkg4;

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
        System.out.println("");
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
    public int sum(){
        ListNode currentNode = head;
        int sum = 0;
        while(currentNode != null){
            sum += (int) currentNode.getData();
            currentNode = currentNode.getLink();
        }
        return sum;
    }
    public int even(){
        ListNode currentNode = head;
        int even = 0 ;
        while(currentNode != null){
            if((int) currentNode.getData() % 2 == 0){
                even++;
            }
            currentNode = currentNode.getLink();
        }
        return even;
    }
    
    
    
}
