/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package q06_pentagon;

import java.util.Scanner;

/**
 *
 * @author Sri Vasavi Vipparla
 */
public class Pentagon {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //creating object for Scanner class to read values from keyboard
        Scanner s1=new Scanner(System.in);
        System.out.print("Enter the length from the center to a vertex: ");
        double r=s1.nextDouble();
        //calculating the side value by using given formula 
        //and using Math class for calculating trignometry values
        double s=(2*r)*Math.sin(Math.PI/5);
        //calculating the area by using the given formula
        //and using Math class for calculating trignometry values
        double Area=(5*s*s)/(4*Math.tan(Math.PI/5));
        //displaying the result with 2 decimals using String.format()
        System.out.println("The area of the pentagon is "+String.format("%.2f", Area));
        
    }
    
}
