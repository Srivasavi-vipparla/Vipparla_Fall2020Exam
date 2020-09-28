/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package q02_Fan;

import java.util.Scanner;

/**
 *
 * @author Sri Vasavi Vipparla
 */
public class FanDriver {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    // creating object for Fan class
    Fan f=new Fan();
    //calling the default fan by using objectname.toString()
    System.out.println("defalut fan is : \n"+f.toString());
    //creating objectreference for Scanner class to read values from keyboard
        Scanner s= new Scanner(System.in);
        System.out.print("Enter fan Color :");
        // reading fan color from keyboard
        String color=s.nextLine();
        // Mutating the fan color
        f.setColor(color);
        //displaying fan color by using getColor()
        System.out.println("Fan color is :"+f.getColor());
        //reading radius value from keyboard
        System.out.print("Enter fan Radius :");
        double radius=s.nextDouble();
        //Mutating the fan radius
        f.setRadius(radius);
        //displaying radius value by using getRadius()
        System.out.println("Fan Radius is :"+f.getRadius());
        //reading fan speed from keyboard
        System.out.print("Enter fan Speed :");
        int speed=s.nextInt();
        while(speed!=1&&speed!=2&&speed!=3){
            System.out.println("Choose the correct speed : SLOW(1)/MEDIUM(2)/FAST(3)");
            speed=s.nextInt();
        }
        //Mutating the fan speed
        f.setSpeed(speed);
        //displaying fan speed by using getSpeed()
        System.out.println("Fan Speed is :"+f.getSpeed());
        //reading fan state from keyboard
        System.out.print("fan State on(true) /off(false) :");
        boolean on=s.nextBoolean();
        ////Mutating the fan state
        f.setOn(on);
        //displaying the fan state
        System.out.println("Fan is on :"+f.isOn());
        //calling the customized fan by using objectname.toString()
        System.out.println(f.toString());
        
    
        
    }
    
}
