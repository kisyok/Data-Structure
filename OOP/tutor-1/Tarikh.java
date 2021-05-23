/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tutor.pkg1;

/**
 *
 * @author HP
 */
public class Tarikh {
    private int day, month, year;

    public Tarikh(int day, int month, int year) {
        this.day = day;
        this.month = month;
        this.year = year;
    }


    public String toString() {
        String outputDay = Integer.toString(day);
        if(outputDay.length()<2){
            outputDay = "0" + outputDay;
        }
        String outputMonth = Integer.toString(month);
        if(outputMonth.length()<2){
            outputMonth = "0" + outputMonth;
        }
        return "Day: " + day + " Month: " + month + " Year: " + year + "\nDate is : " + outputDay + "/" + outputMonth + "/" + year;
    }

    
}
