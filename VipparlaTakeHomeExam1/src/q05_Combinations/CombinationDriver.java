/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package q05_Combinations;

import java.util.Scanner;

/**
 *
 * @author Sri Vasavi Vipparla
 */
public class CombinationDriver {

    /**
     * @param args the command line arguments
     */
    
	public static void main(String[] args) {
            //first_Number ,second_Number is used to get the combinations in between those 2 digits
            //total_combinations is used to count the combinations
		int first_Number,second_Number,total_combinations = 0; 
                //creating object for Scanner class to read values from keyboard
                 Scanner s=new Scanner(System.in);
                 System.out.println("Enter first number:");
                 first_Number=s.nextInt();
                 System.out.println("Enter second number:");
                 second_Number=s.nextInt();        
                 		// diaplaying combinations form first_Number to second_Number as per question
		for (int i=1; i < second_Number; i+=1) {
			for (int j = i + 1; j <= 7; j+=1) {
			// displays the combinations list	
                            System.out.println(i + " " + j);
                                //increments the total_combinations count
				total_combinations++;
			}
		}

		// display the total number of combinations count
		System.out.println("The total number of all combinations is " + total_combinations);
	}
}
  
    

