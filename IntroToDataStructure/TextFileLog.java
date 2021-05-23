/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab2.pkg2;

/**
 *
 * @author wif190017
 */
public class TextFileLog<T extends Comparable<T>> implements SimpleLog<T> {
    
    private T[]log;
    private int index, maxsize;
    
    public TextFileLog(int a){
        index = -1;
        maxsize = a;
        log = (T[]) new Comparable[a];
        System.out.println("Create a text file log with maximum record equal to " + a);
        System.out.println("Text File Log Size " + a);
    }
   
    public void insert(T t) {
        System.out.println(t);
        if(!isFull()){
            index++;
            log[index] = t;
        }
        else{
            System.out.println("Adding another record");
            System.out.println("The log is full");
        }
    }

    public boolean isFull() {
        return maxsize == (index+1);
    }

    public int size() {
        return index+1;
    }

    public boolean search(T t) {
        for(int i=0; i<=index; i++){
            if(log[i].compareTo(t)==0){
                return true;
            }
        }
        return false;
    }

    public void clear() {
        System.out.println("Clear the text file log");
        for(int i=0; i<=index; i++){
            log[i] = (T) null;
            index =- 1;
        }
    }
    
    public String toString(){
        String str = "";
        for(int i=0; i<=index; i++){
            str += log[i] + " ";
        }
        return str;
    }
    
}
