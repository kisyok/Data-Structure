//@author Kisyok Indran Veerasamy
package lab8.pkg4;

import java.util.Random;

public class SortTest<T extends Comparable<T>> {
    private final int MAX=100;
    private final int MAXCHAR=26;
    private T[] value;
    private Random r;
    private int size;
    
    public SortTest(T b, int n) {                                           
        size = n;
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
    
    public void swap(int index1, int index2) {
        T temp = value[index1];
        value[index1] = value[index2];
        value[index2] = temp;
    }
    
    public void showValue() {
        for(int i=0; i<value.length; i++) {
            System.out.print(value[i] + " ");
            if ((i+1)%10==0)
                System.out.println();
        }    
    }
    public void HeapSort(){
        HeapSort(value);
    }
    public void HeapSort(T value[]){
        int n = value.length;
        for(int i=n/2-1; i>=0; i--){
            heapify(value, n, i);
        }
        for(int i=n-1; i>0; i--){
            swap(0, i);
            heapify(value, i, 0);
        }
    }
    public void heapify(T value[], int n, int i){
        int largest = i;
        int left = 2*i+1;
        int right = 2*i+2;
        
        if(left < n && value[left].compareTo(value[largest])>0){
            largest = left;
        }
        if(right < n && value[right].compareTo(value[largest])>0){
            largest = right;
        }
        if(largest != i){
            swap(i, largest);
            heapify(value, n, largest);
        }
    }
}
