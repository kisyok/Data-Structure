/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tutor31.b;

/**
 *
 * @author Kisyok Indran Veerasamy
 */
public class Tutor31B {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5};
        int n = arr.length;
        System.out.println("Sum; " + sum(arr,n));
    }
    public static int sum(int arr[], int n){
        if(n<=0){
            return 0;
        }
        else{
            return (sum(arr, n-1))+ arr[n-1];
        }
    }
}
