package temp;

import java.util.Scanner;

public class Numbers {
    public static void main(String[] args) {
        
        //int[] numbers = new int[4];

        // numbers[0] = 9; 
        // numbers[1] = 5; 
        // numbers[2] = 3; 
        // numbers[3] = 8;
        //ArrayIndexOutOfBoundsException
        //numbers[4] = 8; 

        // System.out.println(numbers[0]);
        // System.out.println(numbers[1]);
        // System.out.println(numbers[2]);
        // System.out.println(numbers[3]);

        Scanner in = new Scanner(System.in);
        System.out.println("Please enter the length of the array");
        int length = in.nextInt();

        // 1 way
        int[] numbers = new int[length];
        // 2 way
        // int[] numbers ;
        // numbers = new int[length];

        //3 way
        //int[] numbers= {2,5,7,9,0} ;



        in.nextLine();

        // assing values
        for(int i = 0 ; i < numbers.length; i++){
            System.out.println("Please enter number ["+ i +"]");
            numbers[i] = in.nextInt(); 
        }

        System.out.println("--------------------------");
        // print array
        for(int i = 0 ; i < numbers.length; i++){
            System.out.println(numbers[i]);
        }


    }
}
