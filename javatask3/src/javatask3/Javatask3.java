/**
 * find the max of an array given by the user 
 */
package javatask3;
import java.util.*;

/**
 *
 * @author Rania Tarek
 */
public class Javatask3 {

    public static void main(String[] args) {
        
           int n;
           
           System.out.println("enter the size of the array: ");
           Scanner in = new Scanner(System.in);
           n= in.nextInt(); // user will enter the size of the array 
           int []arr=new int [n]; // declaration of the array 
           System.out.println("enter array elements: ");
           // for loop so the user can intialize the elements of the array 
           for (int i=0; i<n; i++)
           { 
               arr[i]=in.nextInt();
               
           }
           
           int max= arr[0];
           // for loop so it can scrol into the elements of the array and find the max 
           for (int i=0; i< n; i++)
           { 
              if(arr[i]>max)
                  max=arr[i];
              
     
           }
           System.out.println("the max of the array is :"+ max);
           
               
           
           

    }
    
}
