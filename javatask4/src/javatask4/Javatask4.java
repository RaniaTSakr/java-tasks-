/*
]find the transpose of the 2d array 
 */
package javatask4;
import java.util.*;

/**
 *
 * @author Rania Tarek
 */
public class Javatask4 {

  
    public static void main(String[] args) {
     int row, coloum,i, j;
     Scanner in= new Scanner(System.in);
     //user will enter the values of both the rows and the coloums of the matrix
     System.out.println("enter the number of rows: ");
     row= in. nextInt();
     System.out.println("eneter the number of coloums: ");
     coloum= in.nextInt();
     //declaration of the matrix
     int arr[][]= new int [row][coloum];
     System.out.println("enter the values of the matrix:");
     // for loop so user can enter the elements of the matrix 
     //the first for to access row by row and the second for to access coloum by colum in each selected row 
     for(i=0; i<row; i++)
     {
        for(j=0; j<coloum; j++)
            arr[i][j]= in.nextInt(); 
     }
     
    // print the matrix before the transpose 
    System.out.println("The matrix before Transpose is ");  
    for(i = 0; i < row; i++)  
        {  
            for(j = 0; j < coloum; j++)   
                System.out.print(arr[i][j]+" ");  
         
            System.out.println(" ");  
        }  
            
    // print the amtrix after the transpose  
    System.out.println("The matrix after Transpose is ");  
    for(i = 0; i < coloum; i++)  
        {  
            for(j = 0; j < row; j++)   
                //switch the places of both i and j so i become now refer to coloums instead of row and the same for j 
                System.out.print(arr[j][i]+" ");  
             
            System.out.println(" ");  
        }  
         
   
    }
    
}
