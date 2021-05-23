//@author Kisyok Indran Veerasamy
package tutor8.pkg3;

public class LinkedList<T extends Comparable<T>> {
    private static ListNode head;
    public static final int ASCENDING = 1;
    public static final int DESCENDING = 2;
    private int orderType;
    
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

    // delete from the back
    public void deleteNode() {
        ListNode currentNode = head;
        ListNode previousNode = head;
        if (head != null) {
            if (currentNode.getLink() == null)
                head = null;
            else {
                while (currentNode.getLink() != null) {
                    previousNode = currentNode;
                    currentNode = currentNode.getLink();
                }
                previousNode.setLink(null);
            }    
        }
        else
            System.out.println("The list is empty.");
    }
    
    public void addFrontNode(T a) {
        head = new ListNode(a, head);
    }
    
    public void deleteFrontNode() {
        if (head != null)
            head = head.getLink();
        else
            System.out.println("The list is empty.");
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
    
   public void addNodeByPosition(T a, int index) {        
        if (index==0) 
            addFrontNode(a);        
        else if (index==length())
            addNode(a);
        else if (index>length())
            System.out.println("Invalid index. No node inserted");   
        else {
            ListNode newNode =new ListNode(a, null);
            ListNode currentNode = head;
            for(int i=1; i<index; i++)
                currentNode = currentNode.getLink();
            
            ListNode tempNode = currentNode.getLink();
            currentNode.setLink(newNode);
            newNode.setLink(tempNode);
        }        
    }
    
    public void deleteNodeByPosition(int index) {        
        if (index==0) 
            deleteFrontNode();
        else if (index==length()-1)
            deleteNode();
        else if (index>=length())
            System.out.println("Invalid index. No node deleted");
        else {
            ListNode currentNode = head;
            for(int i=1; i<index; i++)
                currentNode = currentNode.getLink();
            ListNode tempNode = currentNode.getLink();
            currentNode.setLink(tempNode.getLink());
            tempNode = null;
        }
    }
    
    public void set(T t, int index) {
        if (index==0) {
            setFront(t);
        }
        else if (index==length()-1)
            setBack(t);
        else if (index>=length())
            System.out.println("Invalid index. Update failed.");
        else {
            ListNode currentNode = head;
            for(int i=1; i<=index; i++)
                currentNode = currentNode.getLink();    
            currentNode.setData(t);   
        }
    }
    
    public void setFront(T t) {
        if (head != null)
            head.setData(t);
        else
            System.out.println("Invalid update. List is empty");
    }
    
    public void setBack(T t) {
        if (head != null) {
            ListNode currentNode = head;
            while(currentNode.getLink() != null)
                currentNode = currentNode.getLink();
            currentNode.setData(t);
        }
        else
            System.out.println("Invalid update. List is empty");
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
    public void selectionSort(int a){
        orderType = a;
        for(int i=0; i<length()-1; i++){
            swap(i, getSelectionIndex(i));
        }
    }
    public int getSelectionIndex(int start){
        T temp = null, temp1 = null;
        ListNode currentNode = head;
        int index = start;
        for(int i=0; i<=start; i++){
            if(i == start){
                temp = (T) currentNode.getData();
                currentNode = currentNode.getLink();
            }else{
                currentNode = currentNode.getLink();
            }
        }
        for(int i=start+1; i<length(); i++){
            temp1 = (T) currentNode.getData();
            if(temp.compareTo(temp1)>0 && orderType == ASCENDING){
                index = i;
                temp =temp1;
            }else if(temp.compareTo(temp1)<0 && orderType == DESCENDING){
                index = i;
                temp = temp1;
            }
            currentNode = currentNode.getLink();
        }
        return index;
    }
    public void swap(int index1, int index2){
        ListNode currentNode = head;
        ListNode swapNode = head;
        T temp = null, temp1 = null;
        for(int i=0; i<=index1; i++){
            if(i == index1){
                temp = (T) currentNode.getData();
            }else{
                currentNode = currentNode.getLink();
            }
        }
        for(int i=0; i<=index2; i++){
            if(i == index2){
                temp1 = (T) swapNode.getData();
                currentNode.setData(temp1);
                swapNode.setData(temp);
            }else{
                swapNode = swapNode.getLink();
        }
        }
    }
    }