/**
  combination and permutation 
 */
package javatask2;
import java.util.*;

/**
 * @author Rania Tarek
 */
public class Javatask2 {
    
    // build a method called fact so it return the factorial of a number , so you can invoke in the main method and simplify the process 
 
   public static int fact (int num){
       int fact = 1;
       for (int i=1;i<= num; i++){
           // factorial of a number is equal to the number times the factorial of (number -1) and the process repeats itself
           fact= fact*i;
       }
        
       return fact;
   
   }
 

    public static void main(String[] args) {
        int r, n, ncr, npr; 
        Scanner in = new Scanner(System.in);
        //user will enter the values of n and r so i can pass both to the fact method 
        System.out.println("enter value of r: ");
        r= in.nextInt();
        System.out.println("enter value of n");
        n=in.nextInt();
        // nPr = factorial(n) / factorial(n-r)
        // nCr = factorial(n)/(factorial(n-r) * factorial(r))
        ncr = (fact(n))/((fact(n-r)*fact(r)));
        npr= (fact(n))/(fact(n-r));
        System.out.println("the combination value is "+ncr);
        System.out.println("the permutation value is "+npr);
        

    }
    
}
