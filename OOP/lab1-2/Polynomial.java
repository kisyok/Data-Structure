/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author jhoe
 */
public class Polynomial {
    private double[] coefficient;
    
    public Polynomial(int degree, double[] coefficient){
        this.coefficient = coefficient;
    }
    
    @Override
    public String toString(){
        String output = "";
        for(int i=coefficient.length; i>0;i--){
            int power = i-1;
            double number = coefficient[coefficient.length-i];
            
            String variable;
            if(power==1)
                variable = "x";
            else if (power==0)
                variable = "";
            else
                variable="x^"+power;
            
            String plusSign = "+";
            if(number<0.0)
                plusSign = " ";
            
            output += plusSign+number+variable;    
        }
        return output.substring(1);
    }
    
    public double evaluate(double x){
        double sum = 0;
        System.out.println("When x = "+x);
        for(int i=coefficient.length; i>0;i--){
            int power = i-1;
            double number = coefficient[coefficient.length-i];
            sum += Math.pow(x, power)*number;
        }
        System.out.println(this.toString() + " = " + sum);
        return sum;
    }
}
