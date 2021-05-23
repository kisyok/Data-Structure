//@author Kisyok Indran Veerasamy/
package lab8.pkg1;

import java.util.Random;

public class SortTest<T extends Comparable<T>> {
    public static final int ASCENDING = 1;
    public static final int DESCENDING = 2;
    private final int MAX=101;
    private final int MAXCHAR=26;
    private T[] value;
    private T[] odd;
    private T[] even;
    private Random r;
    private int orderType, size;
    
    public SortTest(int a, T b, int n) {  
        size = n;
        orderType = a;
        value = (T[]) new Comparable[size];
        r = new Random();
        char c;
        for(int i=0; i<size; i++) {
            if (b instanceof Integer){ 
                value[i] = (T) ((Integer) r.nextInt(MAX));                
            }else if (b instanceof Double){
                value[i] = (T) ((Double) (0.01*r.nextInt(MAX)));
            }else if (b instanceof Character){
                c = (char)('A'+r.nextInt(MAXCHAR));
                value[i] = (T) ((Character) c);
            }else{
                String t = "";
                for(int j=0; j<8; j++){
                    c = (char)('A'+r.nextInt(MAXCHAR));
                    t += Character.toLowerCase(c);
                }
                value[i] = (T) (t + "");
            }
        }
    }     
    public void sortOddEven(){
        mergeSort();
        int numOdd=0, numEven=0;
        for(int i=0; i<size; i++){
            if( (Integer)value[i] % 2 != 0){
               numOdd++;
            }else if( (Integer)value[i] % 2 == 0){
               numEven++;
            }
        }
        odd = (T[]) new Comparable[numOdd];
        even = (T[]) new Comparable[numEven];
        
        int counterOdd = 0, counterEven = 0;
        for(int i=0; i<size; i++){
            if( (Integer)value[i] % 2 != 0){
                odd[counterOdd] = value[i];
                counterOdd++;
            }else if( (Integer)value[i] % 2 == 0){
                even[counterEven] = value[i];
                counterEven++;
            }
        }
      
        for(int j=0; j<odd.length; j++){
            value[j] = odd[j]; 
        }
        for(int k=0; k<even.length; k++){
            value[odd.length+k] = even[k];
        }
    }
    
    public void showValue() {
        for(int i=0; i<value.length; i++) {
            System.out.print(value[i] + " ");
            if ((i+1)%10==0)
                System.out.println();
        }    
    }
    
    public void mergeSort() {
        mergeSort(0, value.length-1);        
    }
    
    public void mergeSort(int first, int last) {
        if (first<last) {
            int middle = (first+last)/2;
            mergeSort(first, middle);
            mergeSort(middle+1, last);
            merge(first, middle, middle+1, last);
        }
    }   
    
    public void merge(int leftfirst, int leftlast, int rightfirst, int rightlast) {
        T[] temp = (T []) new Comparable[size];
        int index=leftfirst;
        int currentindex= leftfirst;
        
        while((leftfirst<=leftlast) && (rightfirst<=rightlast)) {
            if ( (value[leftfirst].compareTo(value[rightfirst])<0 && orderType==ASCENDING) ||
                 (value[leftfirst].compareTo(value[rightfirst])>0 && orderType==DESCENDING) ) {   
                temp[index]= value[leftfirst];
                leftfirst++;
            }else {
                temp[index]= value[rightfirst];
                rightfirst++;
            }
            index++;
        }
        
        while(leftfirst<=leftlast) {
            temp[index]= value[leftfirst];
            leftfirst++;
            index++;
        }
        while(rightfirst<=rightlast) {
            temp[index]= value[rightfirst];
            rightfirst++;
            index++;
        }
        
        for(int i=currentindex; i<=rightlast; i++)
            value[i] = temp[i];
    }
}
