import java.sql.Time;
import java.util.Scanner;

public class FahrenheitToCelsius {
    public static void main(String[] args) {
        // int f , c; 
        // Scanner in = new Scanner(System.in);

        // System.out.println("Please enter Fahrenheit");
        // f = in.nextInt();

        // c = (int) ((5.0/9)*(f-32));
        
        // System.out.println("C = " + c);

        System.out.println(System.currentTimeMillis());
        long seconds = System.currentTimeMillis() / 1000;
        System.out.println("Second: "+ seconds);

        long minutes = seconds/60; 
        long remainingSeconds = seconds%60; 

        System.out.println("Time: "+ minutes +":"+ remainingSeconds);

        System.out.println(1.0 - 0.9);

        System.out.printf( "Time: %d-%d%n"   , minutes, remainingSeconds);
        System.out.printf("number: %.2f",(1.0 - 0.9));
        

    }
}
