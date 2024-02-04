package Arrays_1D;

import java.util.Scanner;
import java.util.Arrays;
public class Introduction {
    public static void main(String[] args) {
        //type[] name = new type[size]
        //type[] name = {val1 , val2, val3 } ;

        int[] intArray = new int[4];
        intArray[0] = 1;
        intArray[1] = 3;
        intArray[2] = 5;
        intArray[3] = 7;
        System.out.println(intArray[0]);
        System.out.println(intArray[1]);
        System.out.println(intArray[2]);
        System.out.println(intArray[3]);
        //ArrayIndexOutOfBoundsException
        //System.out.println(intArray[4]);

        // print array with loop
        for (int i = 0; i < intArray.length; i++) {
            System.out.println(intArray[i]);
        }

        
        Scanner in = new Scanner(System.in);

        String[] stringArray = new String[4];
        //String[] stringArray = {"Ali", "Ahmad","Ibraheam","Abdullah"};
        // reading from the user
        for (int i = 0; i < stringArray.length; i++) {
            System.out.println("Please enter a name");
            stringArray[i] = in.nextLine();
        }

        // print 
        // for(int i = 0 ; i< stringArray.length; i++ ){
        //     System.out.println(stringArray[i]);
        // }

        // using Arrays class
        Arrays.sort(stringArray);
        System.out.println("After Sorting");
        System.out.println(Arrays.toString(stringArray));

    }
}
