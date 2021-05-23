//@author Kisyok Indran Veerasamy
package lab9.pkg2;

public class LinkedList<T extends Comparable<T>> {
    private ListNode head;
    
    public LinkedList() {
        head = null;
    }
  
    public int length() {
        int count=0;    
        ListNode currentNode = head;
        while (currentNode != null) {
            currentNode = currentNode.getLink();
            count++;
        }
        return count;
    }
    
    public void clear() {
        head=null;
    }
    
    public boolean isEmpty() {
        return (head==null);
    }
    
    public void showList() {
        ListNode currentNode = head;
        while (currentNode != null) {
            System.out.print(currentNode.toString());
            currentNode = currentNode.getLink();
        }
    }
    public boolean linearSearch(T t) {
        ListNode currentNode = head;
        while (currentNode != null) {
            if(currentNode.getData()==t){
                return true;
            }
            currentNode = currentNode.getLink();
        }
        return false;
    }
    public int linearSearchCount(T t) {
        ListNode currentNode = head;
        int count = 0;
        while (currentNode != null) {
            if(currentNode.getData()==t){
                count++;
            }
            currentNode = currentNode.getLink();
        }
        return count;
    }
    public boolean linearSearchRange(T from, T to) {
        ListNode currentNode = head;
        while (currentNode != null) {
            if(currentNode.getData().compareTo(from)>=0 && currentNode.getData().compareTo(to)<=0){
                return true;
            }
            currentNode = currentNode.getLink();
        }
            return false;
        }
    public int linearSearchRangeCount(T from, T to) {
        ListNode currentNode = head;
        int count = 0;
        while (currentNode != null) {
           if(currentNode.getData().compareTo(from)>=0 && currentNode.getData().compareTo(to)<=0){
                count++;
            }
            currentNode = currentNode.getLink();
        }
            return count;
        }
        
    
        
    // insert at the back
    public void addNode(T a) {
        ListNode newNode =new ListNode(a, null);
        ListNode currentNode = head;        
        if (head==null) {
            head = newNode;
        }
        else {        
            while (currentNode.getLink() != null) 
                currentNode = currentNode.getLink();                                         
            currentNode.setLink(newNode);
        }
    }

    public boolean contains(T t) {
        boolean found = false;
        ListNode currentNode = head;
        while (currentNode != null) { 
            if (t.compareTo( (T) currentNode.getData())==0) {
                found = true;
                break;
            }            
            currentNode = currentNode.getLink();
        }
        return found;
   }
    
    public T get(int index) {
        if (index==0) {
            return getFront();
        }
        else if (index==length()-1)
            return getBack();
        else if (index>=length())
            return null;
        else {
            ListNode currentNode = head;                        
            for(int i=1; i<=index; i++)
                currentNode = currentNode.getLink();
            return (T) currentNode.getData();            
        }
   }
    
    public T getFront() {
        if (head != null)
            return (T) head.getData();
        else
            return null;
    }
    
    public T getBack() {
        if (head != null) {
            ListNode currentNode = head;
            while(currentNode.getLink() != null)
                currentNode = currentNode.getLink();
            return (T) currentNode.getData();        
        }    
        else
            return null;
    }
    
}