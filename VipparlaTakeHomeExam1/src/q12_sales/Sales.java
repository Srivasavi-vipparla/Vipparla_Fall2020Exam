/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package q12_sales;

/**
 *
 * @author Sri vasavi Vipparla
 */
public class Sales {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    
        double goal_to_earn=30000;
        double commision_rate=0,sales_amount=0;
        do{
            sales_amount+=0.01;
           // commision_rate=0;
            /* if the sales_amount is in between 0.01 and 5000 */
        if(sales_amount>=0.01 && sales_amount<=5000){
            commision_rate=sales_amount*(8/100);
        }
        /* if the sales_amount is in between 5000.01 and 10000 */
        if(sales_amount>=5000.01 && sales_amount<=10000){
            
            commision_rate=5000*(8/100)+(sales_amount-5000)*(10/100);
        }
          /* if the sales_amount is in between 10000.01 */  
        if(sales_amount>=10000.01){
            commision_rate=5000*(8/100)+(sales_amount-5000)*(10/100)+(sales_amount-10000)*(12/100);
        }
        sales_amount=sales_amount+0.01;
    }while(commision_rate <=goal_to_earn);
        System.out.println("minimum sales you have to generate in order to make $30,000"+sales_amount); 
}
}