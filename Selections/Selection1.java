package Selections;

import java.util.Scanner;

public class Selection1 {
    public static void main(String[] args) {

        

        // boolean x = 9 < 2;
        // System.out.println( x  );
        Scanner in = new Scanner(System.in);
        System.out.println("Please enter a number");
        int num = in.nextInt();
        boolean even = num % 2  == 0; 

         if(!even) {
            System.out.println("Odd"); 
        }else
            System.out.println("Even");

        // if(num % 2 == 0 && num >100){
        //     System.out.println("Even Greater than 100");
        //     System.out.println("Greate work ");
        // }else if ( num % 2 == 0)
        //     System.out.println("Even less than or equal 100");
        // else
        //     System.out.println("Odd");

    }
}
