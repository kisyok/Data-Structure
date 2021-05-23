/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab4.pkg6;

/**
 *
 * @author Kisyok Indran Veerasamy
 */
public class DoubleLinkedList <T>{
    private DoubleListNode head;

    public DoubleLinkedList() {
        head = null;
    }
    public int length(){
        int count = 0;
        DoubleListNode currentNode = head;
        while(currentNode != null){
            currentNode = currentNode.getNextLink();
            count++;
        }
        return count;
    }
    public void showList(){
        DoubleListNode currentNode = head;
        while(currentNode != null){
            System.out.print(currentNode.toString());
            currentNode = currentNode.getNextLink();
        }
    }
    public void addRightNode(T a){
        DoubleListNode newNode = new DoubleListNode(a, null, null);
        DoubleListNode currentNode = head;
        if(head == null){
            head = newNode;
        }else{
            while(currentNode.getNextLink() != null){
                currentNode = currentNode.getNextLink();
            }
            currentNode.setNextLink(newNode);
            newNode.setPreviousLink(currentNode);
        }
    }
    public void deleteAtIndex(int index){
        if(index==0){
            deleteLeftNode();
        }else if(index==length()-1){
            deleteRightNode();
        }else if(index >= length()){
            System.out.println("Invalid index");
        }else{
            DoubleListNode currentNode = head;
            for(int i=1; i<index; i++){
                currentNode = currentNode.getNextLink();
            }
            DoubleListNode tempNode = currentNode.getNextLink();
            currentNode.setNextLink(tempNode.getNextLink());
            if(tempNode.getNextLink() != null){
                tempNode.getNextLink().setPreviousLink(currentNode);
            }
            tempNode = null;
        }
    }
    public void deleteLeftNode(){
        if(head != null){
            head = head.getNextLink();
            head.setPreviousLink(null);
        }else{
            System.out.println("The list is empty");
        }
    }
    public void deleteRightNode(){
        DoubleListNode currentNode = head;
        DoubleListNode previousNode = head;
        if(head != null){
            if(currentNode.getNextLink() == null){
                head = null;
            }else{
                while(currentNode.getNextLink() != null){
                    previousNode = currentNode;
                    currentNode = currentNode.getNextLink();
                }
                currentNode = null;
                previousNode.setNextLink(null);
            }
        }else{
            System.out.println("The list is empty");
        }    
    }
    public void replace(int num, int index){
        DoubleListNode currentNode = head;
        for(int i=1; i<index; i++){
            currentNode = currentNode.getNextLink();
        }
        currentNode.setData(num);
    }
    public void even(){
        DoubleListNode currentNode = head;
        DoubleListNode tempNode = head;
        while(currentNode.getNextLink() != null){
            if((int)head.getData() % 2 == 0){
                head = head.getNextLink();
            }
            else if((int)currentNode.getNextLink().getData() % 2 == 0){
                tempNode = currentNode.getNextLink();
                currentNode.setNextLink(tempNode.getNextLink());
                if(tempNode.getNextLink() != null){
                    tempNode.getNextLink().setPreviousLink(currentNode);
                }
                tempNode = null;
                continue;
            }
          currentNode = currentNode.getNextLink();
        }
        if((int) currentNode.getData() % 2 == 0){
            currentNode = null;
        }
    }
    
}
