import java.util.Scanner;
/*This part shows how to use % to find if the number 
* is even or odd
*/
public class EvenOdd {
    

    public static void main(String[] args){

        double number; 
        final double PI = 3.14; 
        Scanner in = new Scanner(System.in);
        
        System.out.println("Please enter a number");
        number = in.nextDouble();

        
        int n1 = 10 ; 

        if( number % 2 == 0)
            System.out.println(number +" is Even ");
        else 
            System.out.println(number +" is Odd");

    }
}