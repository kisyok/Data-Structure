/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tutor8.pkg2;

/**
 *
 * @author Kisyok Indran Veerasamy
 */
public class Tutor82 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       SortTest<String> a = new SortTest<>(SortTest.ASCENDING, "");
        System.out.print("The random String are : ");
        a.showValue();
        System.out.println("Merge Sort - Ascending Order");
        a.mergeSort();
        a.showValue();
        
        SortTest<String> b = new SortTest<>(SortTest.ASCENDING, "");
        System.out.print("The random String are : ");
        b.showValue();
        System.out.println("Quick Sort - Ascending Order");
        b.quickSort();
        b.showValue();
    }
    
}
