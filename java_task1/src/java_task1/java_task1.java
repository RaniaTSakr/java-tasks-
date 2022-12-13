/**
Program to find and prints the character whose ASCII value 
will get entered by user at run-time.
*/
package java_task1;
import java.util.*;

/**
  @author Rania Tarek
 */
public class java_task1 {

    public static void main(String[] args) {
        int ASCII;
        char c; 
        Scanner in = new Scanner(System.in);
        System.out.print("enter the ascii value: ");
        ASCII= in.nextInt(); // user will enter an integer number 
        c= (char) ASCII;  // to convert from int to char , use casting so that the ascii character of the intger value will be stored in a char variable 
        System.out.println("the character of the given ascii is"+" "+c );
        
        
    }
    
}
