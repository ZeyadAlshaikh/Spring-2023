package Arrays_1D;

import java.util.Scanner;
import java.util.Arrays;
public class Names {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String[] names; 

        System.out.println("Please enter how many names you want");
        int length = in.nextInt(); 
        in.nextLine();
        names = new String[length];

        System.out.println(Arrays.toString(names));

        for( int i = 0 ; i < names.length; i++){
            System.out.println("Please enter name ["+ i +"]");
            names[i] = in.nextLine();
        }

       // Arrays.sort(names);
        System.out.println(Arrays.toString(names));

        System.out.println(Arrays.binarySearch(names, "Ali"));
    }
}
