//@author Kisyok Indran Veerasamy
package tutor9.pkg2;

import java.util.Random;

public class SearchTest<T extends Comparable<T>> { 
    public static final int ASCENDING = 1;
    public static final int DESCENDING = 2;
    private final int MAX=20;
    private final int MAXCHAR=26;
    private T[] value;    
    private int orderType, size, line;
    private Random r;
    
    public SearchTest(T b, int size) {            
        this.size = size;       
        line =10;
        value = (T[]) new Comparable[size];
        r = new Random();
        char c;
        for(int i=0; i<size; i++) {
            if (b instanceof Integer) 
                value[i] = (T) ((Integer) r.nextInt(MAX));                
            else if (b instanceof Double)
                value[i] = (T) ((Double) (0.01*r.nextInt(MAX)));
            else if (b instanceof Character) {
                c = (char)('A'+r.nextInt(MAXCHAR));
                value[i] = (T) ((Character) c);
            }
            else {
                c = (char)('A'+r.nextInt(MAXCHAR));
                value[i] = (T) (c+"");        
            }
        }
    }
        
    public SearchTest(int sortType, T b, int size) {    
        orderType = sortType;
        this.size = size;        
        line =10;
        value = (T[]) new Comparable[size];
        r = new Random();
        char c;
        for(int i=0; i<size; i++) {
            if (b instanceof Integer) 
                value[i] = (T) ((Integer) r.nextInt(MAX));                
            else if (b instanceof Double)
                value[i] = (T) ((Double) (0.01*r.nextInt(MAX)));
            else if (b instanceof Character) {
                c = (char)('A'+r.nextInt(MAXCHAR));
                value[i] = (T) ((Character) c);
            }
            else {
                c = (char)('A'+r.nextInt(MAXCHAR));
                value[i] = (T) (c+"");        
            }
        }
    }
    
    public void showValue() {
        for(int i=0; i<value.length; i++) {
            System.out.print(value[i] + " ");
            if ((i+1)%line==0)
                System.out.println();
        }    
    }    
    
    public T getElement(int index) {
        return value[index];
    }
    
    public boolean binarySearch(T t){
        int index = binarySearchCount(0, value.length-1, t);
        if(index != -1){
            return true;
        }else{
            return false;
        }
    }
     public int binarySearchCount(int start, int end, T t) {
        int middle = (start + end) / 2;
        if(end < start) {
            return -1;
        } 
        if(value[middle].compareTo(t)==0)
            return middle;
        else if ( (value[middle].compareTo(t)>0 && orderType==ASCENDING) ||
                  (value[middle].compareTo(t)<0 && orderType==DESCENDING) )
            return binarySearchCount(start, middle - 1, t);
        else
            return binarySearchCount(middle+1, end, t);
    }
     
     public int binarySearchCount(T t) {
        int count=0;
        int index=binarySearchCount(0, value.length, t);
        if (index!=-1) {
            for(int i=index; i>=0 && t.compareTo(value[i])==0; i--)
                count++;
            for(int i=index+1; i<value.length && t.compareTo(value[i])==0; i++)
                count++;
        }
        return count;
    }
     public int[] binarySearchList(T t){
        int count=0, newIndex;
        int index = binarySearchCount(0, value.length, t);
        newIndex = index;
        if(index != -1){
            for(int i=index; i>=0 && t.compareTo(value[i])==0; i--){
            count++;
            newIndex = i;
        }
        for(int i=index+1; i<value.length && t.compareTo(value[i])==0; i++)
            count++;
        int[] a =new int[count];
        
        for(int i=0; newIndex<value.length && t.compareTo(value[newIndex])==0; i++, newIndex++){
            a[i] = newIndex;
        }
        return a;
        }
        return null;
    }
     public int binarySearchCountRange(int start, int end, T t1, T t2){
        int middle = (start + end)/2;
        if(end<start){
            return -1;
        }
        if((value[middle].compareTo(t1)>=0) && value[middle].compareTo(t2)<=0)
            return middle;
        else if((value[middle].compareTo(t1)>0 && orderType==ASCENDING ) ||
           (value[middle].compareTo(t1)<0 && orderType==DESCENDING))
            return binarySearchCountRange(start, middle-1, t1, t2);
        else
            return binarySearchCountRange(middle+1, end, t1, t2);
        
    }
    public boolean binarySearch(T t1, T t2){
        int index = binarySearchCountRange(0, value.length, t1, t2);
        if(index!=-1){
            return true;
        }else{
            return false;
        }
    }
    
        
   
    public int binarySearchCount(T t1, T t2){
        int count=0;
        int index = binarySearchCountRange(0, value.length, t1, t2);
        if(index != -1){
            for(int i=index; i>=0 && t1.compareTo(value[i])<=0 && t2.compareTo(value[i])>=0; i--)
                count++;
            for(int i=index+1; i<value.length && t1.compareTo(value[i])<=0 && t2.compareTo(value[i])>=0; i++)
                count++;
        }
        return count;
    }
    
    
    
    public int[] binarySearchList(T t1, T t2){
        int count=0, newIndex;
        int index = binarySearchCountRange(0, value.length, t1, t2);
        newIndex = index;
        if(index != -1){
            for(int i=index; i>=0 && t1.compareTo(value[i])<=0 && t2.compareTo(value[i])>=0; i--){
                count++;
                newIndex = i;
            }
            for(int i=index+1; i<value.length && t1.compareTo(value[i])<=0 && t2.compareTo(value[i])>=0; i++)
                count++;
            int[] a = new int[count];
            for(int i=0; newIndex<value.length && t1.compareTo(value[newIndex])<=0 && t2.compareTo(value[newIndex])>=0; i++, newIndex++){
                a[i] = newIndex;
            }
            return a;
        }
        return null;
    }
    
    public void selectionSort(int a) {
        orderType = a;
        for(int i=0; i<value.length-1; i++ )
            swap(i, getMinIndex(i));
    }
    
    public void swap(int index1, int index2) {
        T temp = value[index1];
        value[index1] = value[index2];
        value[index2] = temp;
    }
    public int getMinIndex(int start) {
        T temp = value[start];
        int index = start;
        for(int i=start+1; i<value.length; i++) {
            if (temp.compareTo(value[i])>0 && orderType==ASCENDING) {
                index = i;
                temp = value[i];
            }
            else if (temp.compareTo(value[i])<0 && orderType==DESCENDING) {
                index = i;
                temp = value[i];
            }    
        }
        return index;
    }
    
}