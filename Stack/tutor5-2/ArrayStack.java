/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tutor5.pkg2;

/**
 *
 * @author Kisyok Indran Veerasamy
 */
public class ArrayStack<T>{
    private T[] stack;
    static final int MAX = 10;
    private int index;

    public ArrayStack() {
        index = 0;
        stack = (T[]) new Object[MAX];
    }
    public boolean isEmpty(){
        return (index==0);
    }
    public int getSize(){
        return index;
    }
    public boolean isFull(){
        return (index==MAX);
    }
    public void Push(T a){
        if(!isFull()){
            ++index;
            stack[MAX-index] = a;
        }else{
            System.out.println("Full Stack");
        }
    }
    public T Pop(){
        T temp;
        if(!isEmpty()){
            temp = stack[MAX-index];
            index--;
            return temp;
        }
        return null;
    }
    public T Peek(){
        if(!isEmpty()){
            return stack[MAX-index];
        }
        return null;
    }
    public void showStack(){
        if(isEmpty()){
            System.out.println("Stack is empty");
        }
        else{
            for(int i=MAX-index; i<MAX; i++){
                System.out.print(" <-- " + stack[i]);
            }
        }
    }
}
