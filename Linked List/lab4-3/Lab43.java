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
public class Lab43 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Course programming = new Course("WXX101", "Programming", 5, 'B');
        Course networking = new Course("WXX201", "Networking", 4, 'C');
        Course operatingSystem = new Course("WXX301", "Operating System", 3, 'A');
        LinkedList<Course> courselist = new LinkedList<>();
              
        courselist.addNode(programming);
        courselist.addNode(networking);
        courselist.addNode(operatingSystem);
        System.out.println("The list consits of");
        courselist.showList();
        
        int points = 0;
        int creditHours = 0;
        for(int i=0; i<courselist.length(); i++){
            points += courselist.get(i).getCreditHours() * courselist.get(i).getPoints();
            creditHours += courselist.get(i).getCreditHours();
        }
        
        System.out.println("Total point is " + points);
        System.out.println("Total credit is " + creditHours);
        double gradepoint = (points*1.0/creditHours);
        System.out.printf("Grade point average is %.2f", gradepoint);
    }
    
}
