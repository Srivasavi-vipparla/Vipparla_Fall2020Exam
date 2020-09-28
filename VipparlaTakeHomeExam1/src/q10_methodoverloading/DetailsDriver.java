/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package q10_methodoverloading;

/**
 *
 * @author Sri Vasavi Vipparla
 */
public class DetailsDriver {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //creating objectreference for Details class
   Details d =new Details();
   //calling the overloaded methods in Details class 
        System.out.println(d.details("Sri Vasavi"));
        System.out.println(d.details("Sri Vasavi","Vipparla"));
        System.out.println(d.details(23,1996));
        System.out.println(d.details("Sri Vasavi","vipparla",23,1996));
    }
    
}
