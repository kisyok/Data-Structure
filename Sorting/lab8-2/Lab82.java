/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab8.pkg2;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Scanner;

/**
 *
 * @author Kisyok Indran Veerasamy
 */
public class Lab82 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        try {
            Scanner s = new Scanner(new FileInputStream("lab8Q2.txt"));
            int line = 0;
            while (s.hasNextLine()) {
                s.nextLine();
                line++;
            }

            s = new Scanner(new FileInputStream("lab8Q2.txt"));

            String lines = "";
            String[] str;
            System.out.println("Reading data from product text file");
            Product[] product = new Product[line];
            int i = 0;
            while (s.hasNextLine()) {
                lines = s.nextLine().replaceAll(", ", " : ");
                System.out.println(lines);
                str = lines.split(" : ");
                product[i] = new Product(str[0], str[1], Double.parseDouble(str[2]), Integer.parseInt(str[3]));
                i++;
            }

            System.out.println("After Quick Sort (Price, PID) : ");
            quickSort(product);
            for(int j=0; j<product.length; j++){
                System.out.println(product[j].toString());
            }
            s.close();
        } catch (FileNotFoundException e) {
            System.out.println("file not found");
        }
    }
    enum Type{
        PRICE, PID;
    }
    public static void quickSort(Product[] product){
        quickSort(product, 0, product.length-1, Type.PRICE); 
        quickSortPID(product);
    }
    public static void quickSort(Product[] product, int first, int last, Type type){
        if(first < last){
            Product splittingValue = product[last];
            int i = first - 1;
            for(int k=first; k<last; k++){
                if(type == Type.PRICE){
                    if(product[k].getPrice() < splittingValue.getPrice()){
                        i++;
                        Product temp = product[k];
                        product[k] = product[i];
                        product[i] = temp;
                    }
                }else{
                    if(product[k].getPID().compareTo(splittingValue.getPID())<0){
                        i++;
                        Product temp = product[k];
                        product[k] = product[i];
                        product[i] = temp;
                    }
                }
            }
            Product temp = product[i+1];
            product[i+1] = product[last];
            product[last] = temp;
            quickSort(product, first, i, type);
            quickSort(product, i + 2, last, type);
        }
    }
    public static void quickSortPID(Product[] product){
        Product previousProduct = null;
        Product currentProduct;
        if(product.length>0){
            previousProduct = product[0];
            int samePrice = 0;
            int first = 0;
            for(int i=1; i<product.length; i++){
                currentProduct = product[i];
                if(currentProduct.getPrice() == previousProduct.getPrice()){
                    samePrice++;
                }else{
                    quickSort(product, first, first+samePrice, Type.PID);
                    previousProduct = currentProduct;
                    first = i;
                    samePrice = 0;
                }
            }
            if(samePrice > 0){
                quickSort(product, first, first+samePrice, Type.PID);
            }
        }else{
            System.out.println("The array is empty");
        }
    }
    public static void swap(Product first, Product second){
        Product temp = first;
        first = second;
        second = temp;
    }
     
}
