/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package q04_SSN;

import java.util.Scanner;

/**
 *
 * @author Sri Vasavi Vipparla
 */
public class SSNValidation {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //creating object for Scanner class to read values from keyboard
        Scanner s=new Scanner(System.in);
        System.out.println("Enter SSN :");
        //reading SSn value from keyboard
        String SSN=s.nextLine();
        //validating SSN ,total length of SSN is 11 and fourth and sixth place consists '-' or not
        if((SSN.length()!=11)&&(SSN.charAt(3)=='-')&&((SSN.charAt(6)) == '-')){
            System.out.println(SSN +"is an invalid social security number"); 
             //conditional fails program will stop stop executing
            System.exit(0);
        }
        else{
           //validating the SSN contains digits at specific locations or not
               if((Character.isDigit(SSN.charAt(0)))&&Character.isDigit(SSN.charAt(1))
                       &&Character.isDigit(SSN.charAt(2))&&Character.isDigit(SSN.charAt(4))
                       &&Character.isDigit(SSN.charAt(5))&&Character.isDigit(SSN.charAt(7))
                       &&Character.isDigit(SSN.charAt(8))&&Character.isDigit(SSN.charAt(9))){
                   System.out.println(SSN+"is a valid social security number");}
               else{
                   System.out.println(SSN+"is an invalid social security number");
               }
        }
    }
}