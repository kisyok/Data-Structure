/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tutor8.pkg1;

/**
 *
 * @author Kisyok Indran Veerasamy
 */
public class Tutor81 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        SortTest<Character> a = new SortTest<>(SortTest.DESCENDING, 'A');
        System.out.print("The random characters are : ");
        a.showValue();
        System.out.println("Selection Sort - Descending Order");
        a.selectionSort();
        a.showValue();
        
        SortTest<Character> b = new SortTest<>(SortTest.DESCENDING, 'A');
        System.out.print("The random characters are : ");
        b.showValue();
        System.out.println("Bubble Sort - Descending Order");
        b.bubbleSort();
        b.showValue();
        
        SortTest<Character> c = new SortTest<>(SortTest.DESCENDING, 'A');
        System.out.print("The random characters are : ");
        c.showValue();
        System.out.println("Insertion Sort - Descending Order");
        c.insertionSort();
        c.showValue();
        
        SortTest<Character> d = new SortTest<>(SortTest.DESCENDING, 'A');
        System.out.print("The random characters are : ");
        d.showValue();
        System.out.println("Merge Sort - Descending Order");
        d.mergeSort();
        d.showValue();
        
        SortTest<Character> e = new SortTest<>(SortTest.DESCENDING, 'A');
        System.out.print("The random characters are : ");
        e.showValue();
        System.out.println("Quick Sort - Descending Order");
        e.quickSort();
        e.showValue();
    }
    
}
