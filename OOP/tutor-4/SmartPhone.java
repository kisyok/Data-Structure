/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tutor4;

/**
 *
 * @author HP
 */
public class SmartPhone implements Comparable{
    private String name;
    private int price;

    public SmartPhone() {
        this.name = "";
        this.price = 0;
    }

    
    public SmartPhone(String name, int price) {
        this.name = name;
        this.price = price;
    }

    public int getPrice() {
        return price;
    }
    
    public int compareTo(Object t){
        if(price>((SmartPhone)t).getPrice()){
            return 1;
        }
        else 
            return 0;
    }
    @Override
    public String toString() {
        return name + "(RM" + price + ")";
    }
    
    
}
