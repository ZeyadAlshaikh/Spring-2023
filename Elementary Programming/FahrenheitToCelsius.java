import java.util.Scanner;

public class FahrenheitToCelsius {
    public static void main(String[] args) {
        
        Scanner in = new Scanner(System.in);
        int c, f;
        //double c;  

        System.out.println("Please enter Fahrenheit temperature");
        f = in.nextInt(); 

        c = (int)((5.0/9)*(f-32));
            System.out.println("C temperature is " + c );
 
        // this part shows how to cast double to int
        int x = 100; 
        double y = x; 
        x = (int) y; 

    }
}
