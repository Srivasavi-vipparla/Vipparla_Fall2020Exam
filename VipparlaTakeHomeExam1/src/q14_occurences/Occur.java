/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package q14_occurences;

/**
 *
 * @author Sri Vasavi Vipparla
 */
public class Occur {
    private String string1,string2;
    //constructor is used to assign values to variables
    Occur(String string1,String string2){
        this.string1=string1;
        this.string2=string2;
    }
    //countSubstring() is used to count the occurences of string2 in string1
    public int countSubstring(String string1,String string2){
        int count=0;
        //checking string1 and string 2 are empty or not
        if(string1.length()!=0 && string2.length()!=0){
            
            for (int i=0;i<string1.length();i+=string2.length()){
                //Returns the index within this string of the first occurrence 
                //of the specified substring, starting at the specified index.
                i=string1.indexOf(string2,i);
                //i returns -1 if there is no such occurrence.
                if(i!=-1){
                    count++;
                    }
                else
                    break;
        }}
        else{
            System.out.println("Strings are empty");
            return count;
        }
        return count;
    }
}
