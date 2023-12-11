import java.util.Scanner;

public class Sample
{

    public static void main(String[] args){
        // this program shows an example of run-time error 
        // because we divide by 0 
        int x = 10;
        Scanner in = new Scanner(System.in);
        System.out.println("Please enter a number");
        x = in.nextInt();
        System.out.println(100/0);


       // System.out.print("Hello ");
       // System.out.println("World!");
       // System.out.println( "5 * 5");


    }
}