/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package q03_Recatngle;

import java.awt.Rectangle;

/**
 *
 * @author Sri Vasavi Vipparla
 */
public class rectangle {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Rectangle box1 = new Rectangle(10,20,10,10);
Rectangle box2 = new Rectangle(10,20,10,10);
Rectangle box3 = box1;
Rectangle box4;
System.out.println(box1 == box2);
System.out.println(box1.equals(box2));
System.out.println(box2 == box3);
System.out.println(box2.equals(box3));
System.out.println(box1==box3);
box3 = new Rectangle(10,20,10,10);
System.out.println(box1==box3);
System.out.println(box1.equals(box3));

String s1 = new String("Java");
String s2 = s1;
String s3 = new String(s2);
String s4 = "Java";
System.out.println(s1 == s2);
System.out.println(s1.equals(s2));
System.out.println(s1 == s3);
System.out.println(s1.equals(s3));
System.out.println(s1 == s4);
System.out.println(s1.equals(s4));
System.out.println(s2 == s3);
System.out.println(s2.equals(s3));
System.out.println(s2 == s4);
System.out.println(s2.equals(s4));
System.out.println(s3 == s4);
System.out.println(s3.equals(s4));

    }
    
}
