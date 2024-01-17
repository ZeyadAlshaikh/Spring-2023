package Loops;

import java.util.Scanner;

public class GuessNumber {
    
    public static void main(String[] args) {
        int num = (int) (Math.random() * 10);
        System.out.println(num);

        Scanner in = new Scanner(System.in);
        int choice=-1; 
        // int count=0; 
        // do{
        //     System.out.println("Please enter a number [0-9]");
        //     choice = in.nextInt();
        //     count++; 
        // }while(choice != num && count < 3);

        // System.out.println("By using for");
        // for(int i = 0;choice != num && i < 3; i++){
        //     System.out.println("Please enter a number [0-9]");
        //     choice = in.nextInt();
        // }

        int num1 =0  ; 
        int sum = 0; 
        while( num1 >=0 ){
            System.out.println("Please enter a number of -1 to exit");
            num1 = in.nextInt();
            sum += num1; 
        }
        System.out.println("Sum =  "+ (sum+1));

    }
}
