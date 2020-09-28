/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package q11_loanpayment;

import java.util.Scanner;

/**
 *
 * @author Sri Vasavi Vipparla
 */
public class LoanPayment {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner s=new Scanner(System.in);
        System.out.print("Loan Amount:");
        double loan_amount=s.nextInt();
        System.out.print("Number of Years: ");
        int years=s.nextInt();
        System.out.print("Annual Interest Rate: ");
        double interest=s.nextDouble();
        //Calaculating the monthly interest rate by using yearly interest rate
        double monthly_interest_rate=interest/1200;
        //calculationg the monthly loan payment
        double monthly_payment=loan_amount*monthly_interest_rate/(1-1/Math.pow(1+monthly_interest_rate,years*12));
        //displaying the monthly loan payment with 2 decimal values
        System.out.println("Monthly Payment: "+String.format("%.2f",monthly_payment));
        //calculating the year(s) payment and printing with 2 decimal values
        double yearly_payment=monthly_payment*years*12;
        System.out.println("Total Payment: "+String.format("%.2f",(yearly_payment)));
        System.out.println("Payment#     Interest     Principal     Balance");
        int payment=0;
        double interst_rate,principal_amount;
        //calculating payments for every month
        while(payment<years*12){
            //calculating the interest rate for loan amount
            interst_rate=monthly_interest_rate*loan_amount;
            //calculating the principal amount
            principal_amount=monthly_payment-interst_rate;
            //calculating the remaining loan amount after deducting principal amount
            loan_amount-=principal_amount;
            //increasing the payment month 
            payment=payment+1;
            System.out.println(String.format("%-13d",payment)+String.format("%-13.2f",interst_rate)+
                    String.format("%-13.2f",principal_amount)+String.format("%.2f",loan_amount));
            
            
            
        }
    }
    
}
