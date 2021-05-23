//@author Kisyok Indran Veerasamy
package lab9.pkg1;

import java.util.Random;

public class SearchTest<T extends Comparable<T>> { 
    public static final int ASCENDING = 1;
    public static final int DESCENDING = 2;
    private final int MAX=20;
    private final int MAXCHAR=26;
    private T[][] value;    
    private int orderType, size, line;
    private Random r;
    
    public SearchTest(T b, int N) {            
        this.size = N*N;       
        line =10;
        value = (T[][]) new Comparable[N][N];
        r = new Random();
        char c;
        for(int i=0; i<N; i++) {
            for(int j=0; j<N; j++){
            if (b instanceof Integer) 
                value[i][j] = (T) ((Integer) (10 + r.nextInt(19-10+1)));                
            else if (b instanceof Double)
                value[i][j] = (T) ((Double) (0.01*r.nextInt(MAX)));
            else if (b instanceof Character) {
                c = (char)('A'+r.nextInt(MAXCHAR));
                value[i][j] = (T) ((Character) c);
            }
            else {
                c = (char)('A'+r.nextInt(MAXCHAR));
                value[i][j] = (T) (c+"");        
            }
        }
        }
    }
        
   
    public void showValue() {
        for(int i=0; i<value.length; i++) {
            for(int j=0; j<value.length; j++){
                System.out.print(value[i][j] + "  ");
        }    
            System.out.println();
     }
    }
    public boolean linearSearch(T t) {
        boolean found = false;
        for(int i=0; i<value.length; i++) {
            for(int j=0; j<value.length; j++){
                if(value[i][j].compareTo(t)==0)
                    found = true;
        }
    }
        return found;
    }
    public int linearSearchCount(T t) {
        int count=0;
        for(int i=0; i<value.length; i++) {
            for(int j=0; j<value.length; j++){
                if(value[i][j].compareTo(t)==0)
                    count++;
        }
    }
        return count;
    }
    
    public String linearSearchList(T t) {
        String str = "";
        int index = 0;
        for(int i=0; i<value.length; i++) {
            for(int j=0; j<value.length; j++){
                if(value[i][j].compareTo(t)==0)
                    str += "[" + i + "," + j + "]";
        }
    }
        return str;
    }

    
}