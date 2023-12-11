import java.util.*;

public class Circle{


    public static void main(String[] args){

        double radius; 
        final double PI = 3.14; 
        Scanner in = new Scanner(System.in);
        
        System.out.println("Please enter radius");
        radius = in.nextDouble();

        // syntax error. final variable cannot be changed....
        //PI = 3.1456677;
        
        
        double area = PI * Math.pow(radius, 2) ; 
        //double area = Math.PI * Math.pow(radius, 2) ; 

        System.out.println("Area = " + area); 


        /*This part shows how to use % to find if the number 
         * is even or odd
         */
        int n1 = 10 ; 

        if( n1 % 2 == 0)
            System.out.println("Even ");
        else 
            System.out.println("Odd");

    }
}