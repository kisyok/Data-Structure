/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tutor7.pkg3;

/**
 *
 * @author Kisyok Indran Veerasamy
 */
public class ArrayBST<T extends Comparable<T>> {
    public static final int INORDER = 1;
    public static final int PREORDER = 2;
    public static final int POSTORDER = 3;
    private final int MAX = 20;
    private T[] BST;
    private int index, height, traverse, arrayIndex;
    private T[] treeArray;
    
    public ArrayBST(){
        index = -1;
        height = 0;
        BST = (T[]) new Comparable[MAX];
    }
    public boolean isEmpty(){
        return (index == -1);
    }
    public int getSize(){
        int count = 0;
        for(int i=0; i<MAX; i++){
            if(BST[i] != null){
                count++;
            }
        }
        return count;
    }
    public int getHeight(){
        for(int i=0; i<MAX; i++){
            if(BST[i] != null){
                index = i;
            }
        }
        height = (int) (Math.log(index+1)/Math.log(2)) + 1;
        return height;
    }
    public void addNode(T t){
        boolean add = false;
        int i = 0, height = 0;
        if(isEmpty()){
            index = 0;
            BST[index] = t;
        }else{
            while(i<MAX){
                if(BST[i]==null){
                    BST[i] = t;
                    add = true;
                    break;
                }else if(t.compareTo(BST[i])<=0){
                    i = 2*i+1;
                }else{
                    i = 2*i+2;
                }
            }
        }
    }
    public void setOrder(int a){
        traverse = a;
        treeArray = (T[]) new Comparable[MAX];
        arrayIndex = 0;
        if(traverse==INORDER){
            inOrder(0);
        }else if(traverse==PREORDER){
            preOrder(0);
        }else{
            postOrder(0);
        }
    }
    public void inOrder(int a){
        if(a>=MAX){
            return;
        }
        if(BST[a] != null){
            inOrder(a*2+1);
            treeArray[arrayIndex++] = BST[a];
            inOrder(a*2+2);
        }
    }
    public void preOrder(int a){
        if(a>=MAX){
            return;
        }
        if(BST[a] != null){
            treeArray[arrayIndex++] = BST[a];
            preOrder(a*2+1);
            preOrder(a*2+2);
        }
    }
    public void postOrder(int a){
        if(a>=MAX){
            return;
        }
        if(BST[a] != null){
            postOrder(a*2+1);
            postOrder(a*2+2);
            treeArray[arrayIndex++] = BST[a];
           
        }
    }
    public void showTree(){
    for(int i=0; i<arrayIndex; i++)
            System.out.print(treeArray[i] + " ");
    }
    public boolean remove(T t){
        boolean found = false;
        if(isEmpty()){
            return false;
        }else{
            for(int i=0; i<MAX; i++){
                if(BST[i] == t){
                    if(2*i+1 >= MAX || 2*i+2 >= MAX){
                        BST[i] = null;
                        found = true;
                        break;
                    }else if(BST[2*i+1] == null && BST[2*i+2] == null){
                        BST[i] = null;
                        found = true;
                        break;
                    }else if(BST[2*i+2] == null){ // right child empty
                        replace(i, 2*i+1);
                        found = true;
                        break;
                    }else if(BST[2*i+1] == null){ // left child empty
                        replace(i, 2*i+2);
                        found = true;
                        break;
                    }else{
                        replaceWithChildren(i); //with both children
                        found = true;
                        break;
                    }
                }    
            }
        }
        return found;
    }
    public void replace(int a, int b){
        Queue<Integer> tempQ = new Queue<>();
        Queue<Integer> oldQ = new Queue<>();
        Queue<Integer> newQ = new Queue<>();
        int currentIndex, oldIndex, newIndex;
        
        tempQ.enqueue(b);
        while(!tempQ.isEmpty()){
            currentIndex = tempQ.dequeue();
            newQ.enqueue(currentIndex);
            if((currentIndex*2+2) <= (Math.pow(2, getHeight())-2)){
                tempQ.enqueue(currentIndex*2+1);
                tempQ.enqueue(currentIndex*2+2);
            }
        }
        tempQ.enqueue(a);
        while(!tempQ.isEmpty()){
            currentIndex = tempQ.dequeue();
            oldQ.enqueue(currentIndex);
            if((currentIndex*2+2) <= (Math.pow(2, getHeight())-2)){
                tempQ.enqueue(currentIndex*2+1);
                tempQ.enqueue(currentIndex*2+2);
            }
        }
        while(!newQ.isEmpty()){
            oldIndex = oldQ.dequeue();
            newIndex = newQ.dequeue();
            BST[oldIndex] = BST[newIndex];
            BST[newIndex] = null;
        }
    }
    public void replaceWithChildren(int a){
        int currentIndex = a*2+2;
        while(currentIndex*2+1 < MAX && BST[currentIndex*2+1] != null){
            currentIndex = currentIndex*2+1;
        }
        BST[a] = BST[currentIndex];
        
        int currentRoot = currentIndex;
        if(BST[currentIndex*2+2] != null){
            replace(currentIndex, currentIndex*2+2);
        }else{
            BST[currentIndex] = null;
        }
    }
    
}
