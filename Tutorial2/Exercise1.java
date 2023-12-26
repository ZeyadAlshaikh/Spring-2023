package Tutorial2;

import java.util.Scanner;

public class Exercise1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Please enter 3 numbers");
        
        int num1 = in.nextInt();
        int num2 = in.nextInt(); 
        int num3 = in.nextInt();

        if( num1 >= num2 && num1 >= num3)
            System.out.println("Max is "+num1);
        else if (num2 >= num1 && num2 >= num3)
            System.out.println("Max is " + num2);
        else 
            System.out.println("Max is "+ num3);

        in.close();

        System.out.println(Math.max(num1, Math.max(num2, num3)));
    }
}
