/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab3.pkg1;

/**
 *
 * @author Kisyok Indran Veerasamy
 */
public class Lab31 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("Mesh Topology");
        int n = 7;
        System.out.println("There are " + n + " switches in the campus.");
        System.out.println("The total number of connections required are " + meshTopology(n));
    }
    public static int meshTopology(int n){
        if(n>0){
            return (n-1) + meshTopology(n-1);
        }
        else{
            return 0;
        }
    }
}
