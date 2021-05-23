/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab2.pkg1;

import java.util.Collections;
import java.util.LinkedList;
import java.util.Random;

/**
 *
 * @author wif190017
 */
public class generate<T extends Comparable<T>> {
    private T[] arr;
    private int N;
    private LinkedList<T> LinkedList;
    int index;
    
    public generate(int N){
        index = -1;
        this.N = N;
        LinkedList = new LinkedList<>();
        arr = (T[]) new Comparable[N];
    }
    
    public void insertLinkedList(T t){
        if(!LinkedListIsFull()){
            if(!LinkedList.contains(t)){
                LinkedList.add(t);
            }
        }
        else{
            System.out.println("Linked List is full");
        }
    }
    
    public boolean arrayContains(T t){
        for(int i=0; i<index+1; i++){
            if(arr[i].equals(t)){
                return true;
            }
        }
        return false;
    }
    
    public void insertArray(T t){
        if(!ArrayIsFull()){
            if(!arrayContains(t)){
                index++;
                arr[index] = t;
            }
        }
        else{
            System.out.println("Array is full");
        }
    }
    
    public void display(){
        System.out.println("Linked List Implementation");
        for(int i=0; i<LinkedList.size(); i++){
            System.out.print(LinkedList.get(i) + " ");
        }
        System.out.println("");
        System.out.println("Array Implementation");
        for(int i=0; i<arr.length; i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println("");
        
    }   

    public void sortLinkedList(){
            Collections.sort(LinkedList);
        }
    
    public void sortArray() {
        int firstNumber, secondNumber;
        T temp;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                if (j != arr.length - 1) {
                    firstNumber = (Integer) arr[j];
                    secondNumber = (Integer) arr[j + 1];
                    if (firstNumber > secondNumber) {
                        temp = arr[j];
                        arr[j] = arr[j + 1];
                        arr[j + 1] = temp;
                    }
                }
            }
        }
    }
    
    public boolean ArrayIsFull(){
        return N == index + 1; //restart at -1 initially
    }
    public int arraySize(){
        return index+1;
    }
    public boolean LinkedListIsFull(){
        return N == LinkedList.size();
    }
    public int LinkedListSize(){
        return LinkedList.size();
    }


}