/*
write a program that have two classes to find and prints area and circumference 
of triangle and circle, and the third class is the main class to create objects from these two 
classes.
 */
package javatask6;
import java.util.*;
   

/**
 *
 * @author Rania Tarek
 */


// build a class called circle, it has no access modifier selected so it is package private 
class circle {
    // circle class has two methods 
    // first method will return the area of the circle
    double area(double r){
     return (Math.PI*r*r);// pi is a method of the static class math so we can invoke it directly by the name of the class without needing to declare an object 
    }
    //the second method will return the circumference of the circle
    double perimeter(double r){
      return (2*Math.PI*r);
    }
    }
// class triangle has two methods to calculate area and perimeter of it 
class triangle{
    double area(double h,double b){
    return (0.5*h*b);
    }
    double perimeter (double a, double b, double c){
    return (a+b+c);
    }
}  

public class Javatask6 {
    public static void main(String[] args) {
      circle cir = new circle ();// declare an object of class circle 
      System.out.println("enter the radius of the circle:");
      Scanner in = new Scanner (System.in);
      double radius =in.nextDouble(); // user will enter the radius of the circle 
      System.out.println("the area is  "+cir.area(radius)); // access method area by obj cir and pass the value of the radius to it 
      System.out.println("the perimeter is  "+cir.perimeter(radius)); // access method perimeter by obj cir and pass the value of the radius to it 
      
      System.out.println("enter the three diminsions of the triangle and the hight:"); 
      //user will enter the dimisions of the triangle 
      double a=in.nextDouble();
      double b=in.nextDouble();
      double c=in.nextDouble();
      double h=in.nextDouble();
      triangle tri= new triangle();
      // print the area and the perimeter of the triangle 
      System.out.println("the area is  "+tri.area(h,b));
      System.out.println("the perimeter is  "+tri.perimeter(a,b,c));
  

    }
    
}


