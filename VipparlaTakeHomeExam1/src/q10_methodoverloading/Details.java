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
public class Details {
    // declaring variables 
    String firstName,lastName;
int age,birthyear;
//creating methods with same name and different signatures
//displaying firstName
public String details (String firstName)
{
return firstName;
}
//displaying firstName and lastName
public String details(String firstName,String lastName){
    return firstName+" "+lastName;
    
}
//displaying age and year
public int details(int age ,int year){
    return age+year;
}
//displaying firstName,lastName,age,year
public String details(String firstName,String lastName,int age ,int year){
    return firstName+"  "+lastName+" "+age+" "+year;
}
}