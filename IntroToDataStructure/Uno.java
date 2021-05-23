/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab2.pkg3;

import java.util.LinkedList;
import java.util.Random;

/**
 *
 * @author HP
 */
public class Uno<T extends Comparable<T>> {
    
    
    private int draw;
    private T[] arr;
    private int index,player;
    private LinkedList<T> linkedList;
    private       String[][] newArray =
            {
                {"Black","Blue","Red","Yellow","Green"}, 
                {"Wild","Add four","Add two","Reverse","Skip","1","2","3","4","5","6","7","8","9","0"}, 
            };
 
    Random rand = new Random();
    public Uno(int draw, int player)
    {
        index=-1;
        this.player = player;
        this.draw = draw;
        arr = (T[]) new Comparable[draw]; 
        linkedList = new LinkedList<>();
    }
    
    public boolean arrayContains(T t)
    {
        for(int i = 0; i <index +1; i++)
        {
            if(arr[i].equals(t))
                return true;
        }
        return false;
    }
    public void insertArray(T t)
    {
         if(!arrayFull())
        {
            if(!arrayContains(t))
            {
                index++;
                arr[index] = t;
            }
        }
        else
            System.out.println("Array is full.");
    }
    
    public boolean arrayFull()
    {
        return draw  == index +1;
    }
    
    public String toStringArray()
    {
   
      String str = ": ";
        System.out.println("Player " + player + " draws " + draw +" times");
      for(int a = 0; a < draw; a++)
      {
          if(generateI() == 0)
          {
              str +=  newArray[0][0] + " " + newArray[1][generateJ(2)] + "  : ";  
              insertArray((T)str);
              str = " :";
          }
          else{
              str += newArray[0][generateJ(4)+1] + " " + newArray[1][generateJ(13)+2] + " :";
              insertArray((T)str);
              str = ":";
          }
         
      }
      return str;
    }
    
    public void clear() {
        for(int i = 0; i < arr.length; i++)
        {
            arr[i] = (T) null;
        }
        index = -1;
       // size = 0;
    }
    public void insertLinkedList(T t)
    {
        if(!linkedListFull())
        {
            if(!linkedList.contains(t))
                linkedList.add(t);
        }
        else
            System.out.println("Linked List is Full");
    }
    
    public boolean linkedListFull()
    {
        return linkedList.size() == draw;
    }
    
    public String toStringLinkedList()
    {
        String str = ":";
        System.out.println("Player " + player + " draws " + draw +" times");
        for(int a = 0; a <= draw; a++)
        {
        while(!linkedListFull())
        {
            
            if(generateI() == 0)
          {
              str = newArray[0][0] + " " + newArray[1][generateJ(2)] + "  : ";
             insertLinkedList((T) str);
              str = " :";
          }
          else{
              str = newArray[0][generateJ(4)+1] + " " + newArray[1][generateJ(13)+2] + " : : ";
              insertLinkedList((T) str);
              str = " :";
        }
        }
        }
        return str;
    
    }
    
    public void displayLinkedList()
    {
        
     System.out.println("Linked List implementation: ");
     toStringLinkedList();
        for(int i = 0; i<linkedList.size(); i ++)
        {
            System.out.print(linkedList.get(i)+ " ");
        }
        System.out.println("");
    }
    public void displayArray()
    {
        
        System.out.println("Array implementation: ");
        toStringArray();
        for(int i = 0; i < arr.length; i ++)
        {
            System.out.print(arr[i] + " ");
        }
        System.out.println("");
    }
    public int generateI()
    {
            int randI = rand.nextInt(5);
      return randI;
    }
    
    public int generateJ(int num)
    {
            int randJ = rand.nextInt(num);
      return randJ;
    }
}