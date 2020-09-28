/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package q02_Fan;

/**
 *
 * @author Sri Vasavi Vipparla
 */
public class Fan {

    //used to specify the fan speed range
    private static final int SLOW = 1, MEDIUM = 2, FAST = 3;
    private int speed;// specifies fan speed
    private boolean on;// indicates fan state 
    private double radius;//indicates fan radius
    private String color;// indicates fan color
    //creating a default fan with no-arg constructor

    Fan() {
        color = "white";
        radius = 9.5;
        speed = MEDIUM;
        on = false;

    }

    // returns the fan speed
    public int getSpeed() {
        return speed;
    }

    //mutates the fan speed
    public void setSpeed(int speed) {
        this.speed = speed;
    }
    // return the fan speed

    public boolean isOn() {
        return on;
    }

    //mutates the fan state
    public void setOn(boolean on) {
        this.on = on;
    }

    //return the fan radius
    public double getRadius() {
        return radius;
    }

    //mutates the radius value
    public void setRadius(double radius) {
        this.radius = radius;
    }

    // return the fan color
    public String getColor() {
        return color;
    }

    //mutates the fan color
    public void setColor(String color) {
        this.color = color;
    }

    // display the object values in given format 
    @Override
    public String toString() {
        if (on == true) {
            return "fan speed is : " + getSpeed() + "   fan color is : " + getColor() + "   fan radius is: " + getRadius();
        } else {
            return "fan color is : " + getColor() + "   fan radius is : " + getRadius();
        }
    }

}
