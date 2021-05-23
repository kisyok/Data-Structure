/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab5.pkg1;

/**
 *
 * @author Kisyok Indran Veerasamy
 */
public class Stack <T>{
    private ListNode head;

    public Stack() {
        head = null;
    }
    public boolean isEmpty(){
        return head == null;
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
    public void push(T a){
        head = new ListNode(a, head);
    }
    public T pop(){
        if(head == null){
            return null;
        }
        T temp = (T) head.getData();
        head = head.getLink();
        return temp;
    }
    public T peek(){
        if(head == null){
            return null;
        }
        else{
            return (T) head.getData();
        }
    }
    public void showStack(){
        if(isEmpty()){
            System.out.println("Stack is empty");
        }
        else{
            ListNode currentNode = head;
            while(currentNode != null){
                System.out.print(currentNode.toString());
                currentNode = currentNode.getLink();
            }
        }
        
    }
    public void remove(String colour){
        if(isEmpty()){
            System.out.println("is empty");
        }else{
            ListNode currentNode = head;
            ListNode tempNode = head;
            while(currentNode.getLink() != null){
                if(head.getData().equals(colour)){
                    head = head.getLink();
                }else if(currentNode.getLink().getData().equals(colour)){
                    tempNode = currentNode.getLink();
                    currentNode.setLink(tempNode.getLink());
                    tempNode = null;
                    continue;
                }
                currentNode = currentNode.getLink();
            }
            if(currentNode.getData().equals(colour)){
                currentNode = null;
            }
        }
    }
    public void remove(){
        if(isEmpty()){
            System.out.println("Stack is empty");
        }
        else{
            ListNode currentNode = head;
            ListNode tempNode = head;
            while(currentNode.getLink()!= null){
            if(head.getData().equals("blue")){
                head = head.getLink();
            }
            else if(currentNode.getLink().getData().equals("blue")){
                tempNode = currentNode.getLink();
                currentNode.setLink(tempNode.getLink());
                tempNode = null;
                continue;
            }
            
            currentNode = currentNode.getLink();
        }
            if(currentNode.getData().equals("blue")){
                currentNode = null;
            }
    }
    }
}
