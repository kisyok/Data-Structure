/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab3.pkg4.pkg1;

import java.util.Date;
import java.util.concurrent.TimeUnit;

/**
 *
 * @author Kisyok Indran Veerasamy
 */
public class DayToday {
    //1587312000000 is Unix time stamp which is = 20/4/2020
    private final Date date = new Date(1587312000000L);
    private final Date today = new Date();
    public enum day{Sunday, Monday, Tuesday, Wednesday, Thursday, Friday, Saturday}
    
    DayToday(){
        System.out.println(date);
    }
    
    public Date getDate(){
        return date;
    }
    
    public int getTimeDiff(){
        return (int) TimeUnit.DAYS.convert(today.getTime()-date.getTime(), TimeUnit.MILLISECONDS);
    }
    
    public day getDay(int dayDiff, day currentDay){
        //System.out.println(currentDay);
        if(dayDiff==0){
            if(currentDay.ordinal()==0)
                return day.values()[6];
            return day.values()[currentDay.ordinal()];
        }else{
            if(currentDay.ordinal()==0)
                return getDay(dayDiff-1,day.values()[6]);
            return getDay(dayDiff-1,day.values()[currentDay.ordinal()-1]);
        }    
    }
    
}
