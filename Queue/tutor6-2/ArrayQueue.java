/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tutor6.pkg2;

/**
 *
 * @author Kisyok Indran Veerasamy
 */
public class ArrayQueue<T> {
    private T[] arr;
    public static int max;
    int front = -1, rear = -1;
    
    public ArrayQueue(){
        this(10);
    }

    public ArrayQueue(int size) {
        max = size;
        arr = (T[]) new Object[max];
    }
    public boolean isEmpty(){
        return getSize() == 0;
    }
    public boolean isFull(){
        return getSize() == max;
    }
    public int getSize(){
        if(front == -1){
            return 0;
        }
        if(rear >= front){
            return rear - front + 1;
        }else{
            return (max - front) + (rear + 1);
        }
    }
    public void enqueue(T data){
        if((front==0 && rear==max-1) || (rear == front-1)){
            System.out.println("Queue is full");
        }else if(rear==max-1 && front!=0){
            rear = 0;
            arr[rear] = data;
        }else if(front == -1 && rear == -1){// start
            rear = front = 0;
            arr[rear] = data;
        }else{
            rear++;
            arr[rear] = data;
        }
    }
    public T dequeue(){
        if(front==-1){
            return null;
        }
        T data = arr[front];
        arr[front] = null;
        if(front == rear){//restart
            front = rear=-1;
        }else if(front == max-1){
            front = 0;
        }else{
            front++;
        }
        return data;
    }
    public T peek(){
        if(isEmpty()){
            return null;
        }
        return arr[front];
    }
    public void showQueue(){
        if(front == -1){
            System.out.println("Queue is empty");
        }else if(rear >= front){
            for(int i = front; i <= rear; i++){
                System.out.print(arr[i] + " --> ");
            }
        }else{
            for(int i = front; i<max; i++){
                System.out.print(arr[i] + " --> ");
            }
            for(int i=0; i<=rear; i++){
                System.out.println(arr[i] + " --> ");
            }
        }
        System.out.println();
    }
    
    
}
