/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tutor.pkg3;

/**
 *
 * @author HP
 */
public class MPlan extends ISP {
    private double price;
    private int mpbs, gb;

    public MPlan(int mpbs, int gb) {
        super("MPlan");
        this.mpbs = mpbs;
        this.gb = gb;
    }
    public double price(){
        return price = ((5*mpbs)+(0.8*gb));
    }

    @Override
    public String toString() {
        return super.toString() + price() ;
    }
    
    
}
