package Tutorial3;

import java.util.Scanner;

public class Exercise2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Please enter 2 integer a b in any order");
        int a = in.nextInt();
        int b = in.nextInt();

        if(a > b ){
            //swap 
            int temp = a ;
            a = b ; 
            b = temp; 
        }

        System.out.println("Please entre a number");
        int num = in.nextInt();
        if(num >=a && num <= b)
            System.out.println(num + " in the rage");
        else
            System.out.println(num + " non in the range");

    }
}
