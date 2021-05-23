/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab4.pkg3;

/**
 *
 * @author Kisyok Indran Veerasamy
 */
public class Course implements Comparable <Course>{
    private String code, name;
    private int creditHours, points;
    private char grade;

    public Course(String code, String name, int creditHours, char grade) {
        this.code = code;
        this.name = name;
        this.creditHours = creditHours;
        this.grade = grade;
    }

    public String getCode() {
        return code;
    }

    public String getName() {
        return name;
    }

    public int getCreditHours() {
        return creditHours;
    }

    

    public char getGrade() {
        return grade;
    }

    public int getPoints(){
        switch(grade){
            case 'A':
                return 4;
            case 'B':
                return 3;
            case 'C':
                return 2;
            case 'D':
                return 1;
            case 'F':
                return 0;
            default:
                return 0;
        }
    }

    @Override
    public String toString() {
        return "Course : " + code + " (" + name + ") - " + creditHours + " credit hours." + " Grade : " + grade  ;
    }
    
    
  @Override
    public int compareTo(Course o) {
        return 0;
    }  
}

