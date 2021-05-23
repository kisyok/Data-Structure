/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab5.pkg4;

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
    public boolean show(int index, char a){
        boolean found =false;
       ListNode currentNode = head;
       ListNode tempNode = head;
        if(!isEmpty()){
            int i=0;
            if((char)head.getData() == a){
                found = true;
                head = head.getLink();
            }else{
            while(i < index-1){
                if((char)currentNode.getLink().getData() == a){
                    found = true;
                    tempNode = currentNode.getLink();
                    currentNode.setLink(currentNode.getLink().getLink());
                    tempNode = null;
                    break;
                }
                currentNode = currentNode.getLink();
                i++;
            }
            if((char)currentNode.getData() == a){
                found = true;
                    currentNode = null;
                }
        }
    }
        return found;
    }
    
}
