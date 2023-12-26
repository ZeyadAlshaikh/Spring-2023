package Tutorial2;
import java.util.Scanner;

public class Exercise2 {
    public static void main(String[] args){

        Scanner in = new Scanner(System.in);
        System.out.println("Please enter 2 numbers");
        int num1 = in.nextInt();
        int num2 = in.nextInt();

        if( num1 % num2 == 0 )
            System.out.println("True");
        else
            System.out.println("False");
       
    }
}
