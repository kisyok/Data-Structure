/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab8.pkg2;

/**
 *
 * @author Kisyok Indran Veerasamy
 */
public class Product {
    private String PID, SID;
    private double price;
    private int quantity;

    public Product(String PID, String SID, double price, int quantity) {
        this.PID = PID;
        this.SID = SID;
        this.price = price;
        this.quantity = quantity;
    }

    public String getPID() {
        return PID;
    }

    public String getSID() {
        return SID;
    }

    public double getPrice() {
        return price;
    }

    public int getQuantity() {
        return quantity;
    }

    @Override
    public String toString() {
        return PID + " : " + SID + " : " + price +  " : " + quantity ;
    }
    
}
