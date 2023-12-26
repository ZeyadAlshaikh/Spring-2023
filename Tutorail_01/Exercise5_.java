import java.util.Scanner;

public class Exercise5_ {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.println("Please enter x ");
        int x = in.nextInt();
        int z = x^3;
        System.out.println(z); 
        int y = (int)Math.pow(x,3) - x + 1;
        
        System.out.println("Y = "+ y );
        
        
    }
}
