/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package q13_creditcard;

import java.util.Scanner;

/**
 *
 * @author Sri Vasavi Vipparla
 */
public class CreditCard {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //creating object for Scanner class to read values from keyboard
        Scanner s=new Scanner(System.in);
        System.out.println("Enter a credit card number as a long integer: ");
        long card_number=s.nextLong();
        //isValid() is used to check the CreditCard is valid or not
        boolean check= isValid(card_number);
       
      
    }
    //used to get the size of the credit card
        public static int getSize(long d){
            String size = d + "";
		return size.length();          
        }
        //used to get the prefix number for the creditcard
        public static long getPrefix(long number,int k){
            if (getSize(number) > k)  {
			String prefix = number + "";
			number=  Long.parseLong(prefix.substring(0, k));
                        return number;
		}
		return number;
                
        }
        //used to get the digit while doubling the even places
        public static int getDigit(int number){
            if (number<=9)
			return number;
            else{
                //if number >= 10 it will add the two digits by using divsion and modulus
                number=number/10+number%10;
			return number;
        }}
        //doubling the even places and adding
        public static int sumOfDoubleEvenPlace(long number){
            int add = 0;
		String even_place = number + "";
                //getting even numbers in the given number
		for (int i = getSize(number) - 2; i >= 0; i -= 2) {
                    //doubling the even place digit
                    int twice=getDigit(Integer.parseInt(even_place.charAt(i) + "") * 2);
		//addition of even_place doubling result	
                    add =add+twice; 
		}
		return add;
        }
        // adding the all odd place values
        public static int sumOfOddPlace(long number){
            int add = 0;
		String odd_place = number + "";
		for (int i = getSize(number) - 1; i >= 0; i -= 2) {
                    //addition of add place values
                    int odd=Integer.parseInt(odd_place.charAt(i) + "");
			add= add+odd;
		}
		return add;
        }
        // checking prefix value is matched or not 
        //i.e prefix is 4 or 5 or 37 or 6
        public static boolean prefixMatched(long number , int d){
            int size =getSize(d);
        return getPrefix(number, size) == d;
        }
        //checking creditcard is valid or not
        public static boolean isValid(long number){
            //boolean status=
                    if((getSize(number) >= 13 && getSize(number) <= 16) &&
			(prefixMatched(number, 4) || prefixMatched(number, 5) ||
			prefixMatched(number, 37) || prefixMatched(number, 6)) &&
			((sumOfDoubleEvenPlace(number) + sumOfOddPlace(number)) % 10 == 0)){
                        System.out.println(number+"is valid");
            return true;
        }
                    else{
                        System.out.println(number+"is  invalid");
                         return false;
                    }
        }

}
            
        
     
        
    
  
