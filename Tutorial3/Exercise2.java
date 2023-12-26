package Tutorial3;

import java.util.Scanner;

public class Exercise2 {
    public static void main(String[] args) {
        
        Scanner in = new Scanner(System.in);
        System.out.println("Please enter a b range");
        int a = in.nextInt();
        int b = in.nextInt(); 

        System.out.println("Please enter a number");
        int n = in.nextInt(); 

        if( a > b){
            int c = a ; 
                a = b; 
                b = c ; 
        }


        if(n >= a  && n <= b )//|| n <= a && n >= b)
            System.out.println("In ranage");
        else
            System.out.println("Not in ranage");
    }
}
