/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab8.pkg3;

/**
 *
 * @author Kisyok Indran Veerasamy
 */
public class Lab83 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("Perfomance Comparison of Sorting Algorithms");
        System.out.println("Running on 1000 sets of 100000 random numbers");
        
        long quickSortTime = 0,selectionSortTime = 0, mergeSortTime = 0, insertionSortTime = 0, bubbleSortTime = 0;
        
        for(int i=0; i<1000; i++){
            
            SortTest<Integer> a = new SortTest<>(1,1);
        
            long start = System.currentTimeMillis();
            a.quickSort();
            long end = System.currentTimeMillis();
            quickSortTime += (end-start);
        
            start = System.currentTimeMillis();
            a.selectionSort();
            end = System.currentTimeMillis();
            selectionSortTime += (end-start);
        
            start = System.currentTimeMillis();
            a.mergeSort();
            end = System.currentTimeMillis();
            mergeSortTime += (end-start);
        
            start = System.currentTimeMillis();
            a.insertionSort();
            end = System.currentTimeMillis();
            insertionSortTime += (end-start);
        
            start = System.currentTimeMillis();
            a.bubbleSort();
            end = System.currentTimeMillis();
            bubbleSortTime += (end-start);
        
        }
        System.out.println("Quick Sort : " + quickSortTime);
        System.out.println("Selection Sort : " + selectionSortTime);
        System.out.println("Merge Sort : " + mergeSortTime);
        System.out.println("Insertion Sort " + insertionSortTime);
        System.out.println("Bubble Sort : " + bubbleSortTime);
        
        long[] value = new long[5];
        value[0] = quickSortTime;
        value[1] = selectionSortTime;
        value[2] = mergeSortTime;
        value[3] = insertionSortTime;
        value[4] = bubbleSortTime;
        
        String[] name = new String[5];
        name[0] = "Quick Sort";
        name[1] = "Selection Sort";
        name[2] = "Merge Sort";
        name[3] = "Insertion Sort";
        name[4] = "Bubble Sort";
                
        long min = 999999999;
        String ans = "";
        for(int j=0; j<value.length; j++){
            if(value[j]<min){
                min = value[j];
                ans = name[j];
            }
        }
        System.out.println("The fastest sorting algo is " + ans);
    }       
    
}
