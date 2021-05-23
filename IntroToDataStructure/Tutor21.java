/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tutor2.pkg1;

/**
 *
 * @author HP
 */
public class Tutor21 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        compare("Hello","World");
        compare(12.4,64.3);
        compare(20,35);
        compare("Welcome","Welcome");
    }
    public static <T,U> void compare(T t,U u){
        System.out.println("The parameters value are: " + t + " and " + u);
         if(t instanceof Integer && u instanceof Integer){
            System.out.println("The sum of the integer is " + ((Integer)t + (Integer)u));
        }
        else if(t instanceof Double && u instanceof Double){
            System.out.printf("The sum of the double is %.1f", ((Double)t + (Double)u));
            System.out.println("");
        }
        else if(t instanceof String && u instanceof String){
            if(t.equals(u)){
                System.out.println("The string is equal");
            }
            else{
                System.out.println("The string is not equal");
            }
        }
    }
}
