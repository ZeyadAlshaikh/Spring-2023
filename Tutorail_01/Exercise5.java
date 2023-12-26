package Tutorail_01;

import java.util.Scanner;
import java.lang.Math;

public class Exercise5 {
    public static void main(String[] args) {
        
        Scanner in = new Scanner(System.in);
        System.out.println("Please enter x ");
        int x = in.nextInt(); 


        int y =(int) Math.pow(x,3) - x + 1;
        System.out.println("Y = " + y );
    }
}
