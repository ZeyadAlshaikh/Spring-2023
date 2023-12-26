package Selections;

import java.util.Scanner;

public class OddEven {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Please enter a number");
        int num = in.nextInt();

        boolean even = num % 2 == 0;
        boolean gTH = num > 100;  
        
        if(even && gTH)
            System.out.println("Even > 100");
        else if ( even ){
             System.out.println("Even <= 100");
            
        }else if( !even && gTH )
            System.out.println("Odd > 100");
        else
             System.out.println("Odd <= 100");
           
    }
}
