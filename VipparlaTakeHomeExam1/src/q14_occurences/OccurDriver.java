/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package q14_occurences;

import java.util.Scanner;

/**
 *
 * @author Sri vasavi Vipparla
 */
public class OccurDriver {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner s=new Scanner(System.in);
        System.out.println("Enter String 1");
        String string1=s.nextLine();
        System.out.println("Enter string 2");
        String string2=s.nextLine();
        //creating objectreference for Occur class
        Occur o =new Occur(string1,string2);
        System.out.println("The number of occurrences of back in the above string are "+o.countSubstring(string1,string2));
        
    }
    
}
