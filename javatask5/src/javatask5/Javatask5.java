/*
write a program to remove all coma ( , ) in a given string from the user
 */
package javatask5;
import java.util.*;

/**
 *
 * @author Rania Tarek
 */
public class Javatask5 {

    
    public static void main(String[] args) {
        String str= new String();
        Scanner in= new Scanner(System.in);
        System.out.println("enter string: ");
        str= in.nextLine(); // user will enter the string 
        str = str.replace(",",""); // if the string has comma in it, it will remove it using that replace method of string class 
        System.out.println(str);// print the string after removing the comma if there is any 
        
           
      
               
       
          
               
    }
    
}
