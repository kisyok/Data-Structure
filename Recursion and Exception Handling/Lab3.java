/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab3.pkg4;

import java.util.Calendar;
import java.util.TimeZone;

/**
 *
 * @author Kisyok Indran Veerasamy
 */
public class Lab3 {
     private String sDate;
    int daysCount = 0;
    int daysBack;
    String day;

    public Lab3() {
       
        Calendar today = Calendar.getInstance(TimeZone.getDefault());
        day = getDay(today.getTime().toString());

        String todayDate = today.get(Calendar.DAY_OF_MONTH) + "/" + (today.get(Calendar.MONTH) + 1) + "/" + today.get(Calendar.YEAR);

        System.out.println("Today Date (dd/mm/yyyy): "  + todayDate);
        System.out.println("Today is on " + day);

        sDate = "19/10/2016";
        System.out.print("Search Date (dd/mm/yyyy): "  + sDate);
        System.out.println();
        findDay(todayDate);
    }

    private void findDay(String searchDate) {

        String[] part = searchDate.split("/");
        int day = Integer.valueOf(part[0]);
        int month = Integer.valueOf(part[1]);
        int year = Integer.valueOf(part[2]);

        daysCount++;

        if (day == 1) {
            day = 31;
            if (month == 3) {
                //Check if leap year
                if (year % 400 == 0) {
                    day = 29;
                } else if (year % 100 != 0 && year % 4 == 0) {
                    day = 29;
                } else {
                    day = 28;
                }
            }
            if (month == 12 || month == 10 || month == 7 || month == 5) {
                day = 30;
            }
            if (month == 1) {
                year--;
                month = 12;
            } else {
                month--;
            }
        } else {
            day--;
        }

        searchDate = day + "/" + month + "/" + year;

        if (this.sDate.equals(searchDate)) {
            daysBack = (daysCount % 7);
            int dayIndexNum = getDayIndex(this.day);
            int index = dayIndexNum - daysBack;
            if (index < 0) {
                index = 7 - Math.abs(dayIndexNum - daysBack);
            }

            System.out.println("Search date is on " + dayIndex[index]);
        } else {
            findDay(searchDate);
        }
     }

     String[] dayIndex = {"Sunday", "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday"};

    private int getDayIndex(String day) {
        for (int i = 0; i < dayIndex.length; i++) {
            if(dayIndex[i].contains(day)) return i;
        }
        return -1;
    }

    private String getDay (String day) {
        if (day.contains("Sun")) {
            return dayIndex[0];
        } else if (day.contains("Mon")) {
            return dayIndex[1];
        } else if (day.contains("Tue")) {
            return dayIndex[2];
        } else if (day.contains("Wed")) {
            return dayIndex[3];
        } else if (day.contains("Thu")) {
            return dayIndex[4];
        } else if (day.contains("Fri")) {
            return dayIndex[5];
        } else if (day.contains("Sat")) {
            return dayIndex[6];
        } else {
            return "";
        }
    }


   
}
