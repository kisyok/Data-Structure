/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab6.pkg5;

/**
 *
 * @author Kisyok Indran Veerasamy
 */
public class PriorityQueue<T extends Comparable <T>> {
    private ListNode head;
    
    public PriorityQueue(){
        head = null;
    }
    public boolean isEmpty(){
        return (head==null);
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
    public T PriorityDequeue(){
        T temp = null;
        if(head == null){
            return null;
        }else if(getSize()==1){
            temp =(T)head.getData();
            return temp;
        }else{
            ListNode currentNode = head;
            int currentPriority = getCurrentPriority(head);
            int highestPriority = getHighestPriorityQueue();
            if(currentPriority == highestPriority){
                temp = (T) head.getData();
                head = head.getLink();
                return temp;
            }
            while(currentNode != null){
                currentPriority = getCurrentPriority(currentNode.getLink());
                temp = (T) currentNode.getLink().getData();
                if(currentPriority == highestPriority){
                    ListNode tempNode = currentNode.getLink().getLink();
                    currentNode.setLink(tempNode);
                    break;
                }
                currentNode = currentNode.getLink();
            }
        }
        return temp;
    }
    public void PriorityEnqueue(Packet a){
        ListNode newNode = new ListNode(a, null);
        ListNode currentNode = head;
       if(head == null){
           head = newNode;
       }
       else{
           if(a.getPriority()>getCurrentPriority(head)){
               head = new ListNode(a, head);
           }
           else{
               currentNode = head;
               while(true){
                   if(currentNode.getLink() != null){
                       if(a.getPriority()>getCurrentPriority(currentNode.getLink())){
                           newNode = new ListNode(a, currentNode.getLink());
                           currentNode.setLink(newNode);
                           break;
                       }else{
                           currentNode = currentNode.getLink();
                       }
                   }else{
                       newNode = new ListNode(a, null);
                       currentNode.setLink(newNode);
                       break;
                       
                   }
               }
           }
       }
   }

    public int getCurrentPriority(ListNode c){
        Packet currentNodeData = (Packet) c.getData();
        return currentNodeData.getPriority();
    }
    public int getHighestPriorityQueue(){
        int priority = 0;
        ListNode currentNode = head;
        while(currentNode != null){
            int currentPriority = getCurrentPriority(currentNode);
            if(currentPriority>priority){
                priority = currentPriority;
            }
            currentNode = currentNode.getLink();
        }
        return priority;
    }
    public T peek(){
        if(head == null){
            return null;
        }
        return (T) head.getData();
    }
    public void showQueue(){
        if(isEmpty()){
            System.out.println("Empty Queue");
        }else{
        ListNode currentNode = head;
        while(currentNode != null){
            System.out.println(currentNode.toString());
            currentNode = currentNode.getLink();
        }
        }
    }
    
     
}
