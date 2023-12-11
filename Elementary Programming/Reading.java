import java.util.Scanner;

public class Reading {
    public static void main(String[] args) {
        // Scanner in = new Scanner(System.in);
        // int x , y , z; 

        // System.out.println("Please Enter x y z ");
        // x = in.nextInt(); 
        // y = in.nextInt(); 
        // z = in.nextInt();

        // System.out.printf("x: %d y:%d z:%d \n", x ,y ,z );


        long totalMilliseconds = System.currentTimeMillis();
        System.out.println(totalMilliseconds/1000);
        long totalSecond = totalMilliseconds/1000; 
        long totalMinutes = totalSecond/60; 


        System.out.println(1.0 - 0.1 - 0.1 - 0.1 - 0.1 - 0.1);
        System.out.println(1.0 - 0.9);

        Scanner in = new Scanner(System.in);

        System.out.println("Please enter your name ");
        String name = in.next(); 

        System.out.println("Please enter your age");
        int age = in.nextInt(); 

        System.out.println("Please enter x y z");
        int x = in.nextInt(); 
        int y = in.nextInt(); 
        int z = in.nextInt(); 

        System.out.printf("Your name: %s\nage:%d\nX:%d Y:%d Z:%d%n",name, age, x, y, z);



        
    }
}
