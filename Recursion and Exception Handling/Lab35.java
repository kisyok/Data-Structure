//@author Kisyok Indran Veerasamy
package lab3.pkg5;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Lab35 {

    public static void main(String[] args) {
        int[] arr = new int [5];
        
        try{
            int iterate = 0;
            while(true){
            Scanner s = new Scanner(System.in);
            try{
                System.out.print("Enter an integer: ");
                int x = s.nextInt();
                arr[iterate] = x;
                iterate++;
            }catch(InputMismatchException e){
                System.out.println("Invalid input type");
            }
            }
        }catch(ArrayIndexOutOfBoundsException e){
            for(int i=0; i<arr.length; i++){
                System.out.print(arr[i] + " ");
            }
        }
        
        
        
        
        
        
        
        /*
        //another way but incomplete
        Scanner s = new Scanner(System.in);
        int[] arr = new int[5];
       for(int i=0; i<5; i++){
            try{
                    System.out.print("Enter an Integer: ");
                    arr[i] = s.nextInt();
                
            }catch(InputMismatchException e){
                System.out.println("Invalid input type");
                s.nextLine();
                i--;
                continue;
            }catch(ArrayIndexOutOfBoundsException e){
                System.out.println("ArrayIndexOutOfBoundsException");
            }
    }
        System.out.println("The array of integers are: ");
            for(int i=0; i<arr.length; i++){
                    System.out.print(arr[i] + " ");
        }
        */
    }
}
