package Tutorial3;

import java.util.Scanner;

public class Exercise3 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Please enter a number ");  
        int n = in.nextInt(); 
        
        // if( n % 11 == 0 ){
        //     System.out.print("Multiple of 11");
        //     if(n < 100)
        //         System.out.println(" and less than 100");
        //     else
        //         System.out.println(" and Greater than 100");
        // }else{
        //     System.out.print(" Not multiple of 11 ");
        //     if(n < 100)
        //         System.out.println(" and less than 100");
        //     else
        //         System.out.println(" and Greater than 100");
        // }

        // another solution 
        if( n % 11 == 0 && n < 100)
            System.out.println("Multiple of 11 and less than 100 ");
        else if( n % 11 == 0 && n >= 100)
            System.out.println("Multiple of 11 and greater than 100 ");
        else if ( n % 11 != 0 && n < 100)
            System.out.println(" Not multiple of 11 and less than 100 ");
        else //if (n % 11 != 0 && n >= 100)
            System.out.println(" Not multiple of 11 and greater than 100 ");     

    }
}
