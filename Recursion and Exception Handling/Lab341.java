/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab3.pkg4.pkg1;

import lab3.pkg4.pkg1.DayToday.day;

/**
 *
 * @author Kisyok Indran Veerasamy
 */
public class Lab341 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        DayToday b = new DayToday();
        System.out.println(b.getDay(b.getTimeDiff(), day.Thursday));
    }
    
}
