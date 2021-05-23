/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab23extra;

/**
 *
 * @author HP
 */
public class Cards {
  private String color;
    private String type;
    public Cards(){

    }
    public Cards(String color,String type){
        this.color=color;
        this.type=type;
    }
    public String displaytype(){
        return this.color+" "+type;
    }
}